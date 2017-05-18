package meiyin.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Random;

public class SMSTool {
	private static final String ServerURl = "http://m.5c.com.cn/api/send/?";
	private static final String ApiKey = "b5b2d3658ed3b970eeb60c786907a3c0";
	private static final String Username = "meiyin";
	private static final String Password = "asdf123";
	
	
	private static final String UsernameVar = "username";
	private static final String PasswordVar = "password";
	private static final String ApiKeyVar = "apikey";
	private static final String AssignOperator = "=";
	private static final String ParamSeparator = "&";
	private static final String MobileVar = "mobile";
	private static final String ContentVar = "content";
	
	public static final String Encode_Type = "GBK";

	
	public static Boolean sendMsg(String msg, String phoneNum) {
		String content = "";
		try {
			content = URLEncoder.encode(msg, Encode_Type);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return false;
		}
		
		StringBuffer sb = new StringBuffer(ServerURl);
		sb.append(ApiKeyVar + AssignOperator + ApiKey);
		sb.append(ParamSeparator);
		sb.append(UsernameVar + AssignOperator + Username);
		sb.append(ParamSeparator);
		sb.append(PasswordVar + AssignOperator + Password);
		sb.append(ParamSeparator);
		sb.append(MobileVar + AssignOperator + phoneNum);
		sb.append(ParamSeparator);
		sb.append(ContentVar + AssignOperator + content);
		
		;
		try {
			URL url = new URL(sb.toString());
		
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputline = in.readLine();
		
			if (inputline.startsWith("success"))
				return true;
			
			if (inputline.startsWith("error:Missing recipient"))
				return true;
			
			System.err.println(inputline);
		} catch (MalformedURLException e) {
		
			e.printStackTrace();
			return false;
		} catch (IOException e) {
		
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
	public static String genCode() {
		Random r = new Random();
		String ret = "";
		for (int i = 0; i < 6; i++)
			ret += "" + r.nextInt(10);
		return ret;
	}
}
