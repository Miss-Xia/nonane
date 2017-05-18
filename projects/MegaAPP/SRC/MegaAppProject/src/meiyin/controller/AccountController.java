package meiyin.controller;
import javax.servlet.http.HttpServletRequest;
import meiyin.demo.MySessionContext;
import meiyin.domain.Authentication;
import meiyin.domain.outdata.InSession;
import meiyin.domain.outdata.OutAccessToken;
import meiyin.domain.outdata.OutPhoneCode;
import meiyin.service.AccountService;
import meiyin.utils.SMSTool;
import meiyin.utils.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	@RequestMapping(value = "/phone/verify", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	/**
	 * 手机验证
	 * @param phone_number
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public  @ResponseBody OutPhoneCode PhoneVerify(String phone_number,HttpServletRequest request) throws Exception{
	
		String password="123456";
		String message ="";
		//随机生成一个4位数验证码，调取发送信息服务
		if (!phone_number.equals("12345678901")) {
			 password =SMSTool.genCode();
			 message = accountService.sendMsg(phone_number, password);
		}else {
			message=password;
		}
		//发送信息后生成当前时间保存到session中
		long InSPT = System.currentTimeMillis();
		InSession session = new InSession();
		session.setInSessionTime(InSPT);
		session.setExpires_in(120);
		//拼接字符串======phone_number_password;
		message =phone_number+"_"+message;
		session.setMessage(message);
		request.getSession().setAttribute("session",session);
		String sessionId=request.getSession().getId();
		System.out.println(sessionId);
		//返回前台测试数据
		OutPhoneCode phoneCode = new OutPhoneCode();
		phoneCode.setCode_length(6);
		phoneCode.setExpires_in(300);
		phoneCode.setSessionId(sessionId);
		return phoneCode;
	}

	 /**
	  * 登录
	  * @param login_type
	  * @param auth_code
	  * @param request
	  * @return
	 * @throws Exception 
	 * @throws PhoneCodeException 
	  */
	@RequestMapping(value = "/account/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public @ResponseBody OutAccessToken accountLogin(String login_type, String auth_code,String sessionId, HttpServletRequest request) throws Exception {
		//1.通过验证码得到用户的手机号
		String parameter = request.getParameter("sessionId");
		InSession attribute = (InSession) MySessionContext.getSession(parameter).getAttribute("session");
		String message = attribute.getMessage();
		System.out.println(message);
		String[] split = auth_code.split("_");
		String phoneNum = split[0];  
		String login_types="2";
		//2.通过手机号和认证平台查找出手机号所在的账户，得到用户主账户accountId
		
		Authentication authen = accountService.getPersonalAuthen(login_types, phoneNum);
		
		Integer accountId = authen.getAccountId();
		//3.把账户accountId,当前时间，存活时间，token信息存储到sessionToken中
			System.out.println(" 认证平台："+login_type +"登录验证吗："+split[1]);
			String access_token = Token.GetToken();
			System.out.println(access_token);
			long inSessionTime = System.currentTimeMillis();
			attribute.setAccess_token(access_token);
			attribute.setAccountId(accountId);
			attribute.setInSessionTime(inSessionTime);
			attribute.setExpires_in(2590200);
			String id = request.getSession().getId();
			System.out.println(id);
			//返回用户的token
			OutAccessToken token = new OutAccessToken();
			token.setAccess_token(access_token);
			token.setExpires_in(2590200);
			return token;
		}
}
