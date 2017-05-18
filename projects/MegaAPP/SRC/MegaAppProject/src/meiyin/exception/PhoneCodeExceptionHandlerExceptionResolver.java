package meiyin.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;


public class PhoneCodeExceptionHandlerExceptionResolver implements HandlerExceptionResolver {


	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
				ModelAndView mv = new ModelAndView();  
	            /*  使用FastJson提供的FastJsonJsonView视图返回，不需要捕获异常   */  
	            MappingJackson2JsonView view = new MappingJackson2JsonView();
	           // FastJsonJsonView view = new FastJsonJsonView();  
	            Map<String, Object> attributes = new HashMap<String, Object>();  
	            
	            attributes.put("message", ex.getMessage());  
	            view.setAttributesMap(attributes);  
	            mv.setView(view);   
	            return mv;  
	    }  
		
		
	}

