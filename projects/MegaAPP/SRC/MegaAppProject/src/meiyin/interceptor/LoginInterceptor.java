package meiyin.interceptor;

import javax.security.auth.login.AccountException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import meiyin.demo.MySessionContext;
import meiyin.domain.outdata.InSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Administrator
 * 
 */
public class LoginInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// 1、手机验证暂时放行，不做判断。
		String uri = request.getRequestURI();
		if (uri.lastIndexOf("phone/verify") > 0) {
			return true;
		}
		
		String parameter = request.getParameter("sessionId");
		HttpSession session = MySessionContext.getSession(parameter);
		if (session == null) {
			throw new AccountException("对不起，请您获取验证码后，请求登录");
		}
		InSession attribute = (InSession) session.getAttribute("session");

		if (uri.lastIndexOf("/login") > 0) {

			Long InSPT = attribute.getInSessionTime();
			// 当前访问时间
			long nowTime = System.currentTimeMillis();
			Long time = (nowTime - InSPT) / 1000;
			String message = attribute.getMessage();
			String auth_code = request.getParameter("auth_code");
			Integer expires_in = attribute.getExpires_in();
			if (time > expires_in) {
				throw new AccountException("对不起，你的验证已超时，请重新获取验证码。");
			}
			if (!message.equals(auth_code)) {
				throw new AccountException("对不起，你的输入的验证码有误，请核对后输入");
			}
			return true;
		}
		String ac = request.getParameter("access_token");
		Long inSTT = attribute.getInSessionTime();
		Integer expires_in = attribute.getExpires_in();
		String token = attribute.getAccess_token();
		long nowTime = System.currentTimeMillis();
		Long time = (nowTime - inSTT) / 1000;
		if (time > expires_in) {
			throw new AccountException("手机验证失效，请重新登录");
		}
		if (!token.equals(ac)) {
			throw new AccountException("手机验证无效");
		}
		return true;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
