package meiyin.utils;
public class SendMessageUtils {
	
	public static String sendMessage() throws Exception{
			
			String message="测试";
			String phone_number="15011154266";
			String username="dd";
		 	String password_md5="12313" ;
			String apikey ="asdfasdf";
			int startTime =11;
			int ext =12;
			int encode=12;
		
		StringBuffer sb = new StringBuffer("http://m.5c.com.cn/api/send/index.php ?");
			// 拼接参数
			
			sb.append("username=").append(username).append("&");
			sb.append("password_md5=").append(password_md5).append("&");
			sb.append("apikey=").append(apikey).append("&");
			sb.append("mobile=").append(phone_number).append("&");
			sb.append("content=").append(message).append("&");
			sb.append("startTime=").append(startTime).append("&");
			sb.append("ext=").append(ext).append("&");
			sb.append("encode=").append(encode);
			String ss = sb.toString();
		
			return ss;
		
		
		
	}
	
}
