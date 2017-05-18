package meiyin.utils;

import java.util.Random;

public class Token {

	public static String GetToken(){
		Random random = new Random();
		StringBuffer sb=new StringBuffer();
		for (int j = 0; j < 8; j++) {
			int i = random.nextInt(10);
			//sb.append(i);
			sb.append(i);
		}
		String access_token=sb.toString();
		return access_token;
	}
}
