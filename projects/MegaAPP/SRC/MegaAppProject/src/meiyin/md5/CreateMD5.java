package meiyin.md5;

import java.security.MessageDigest;

public class CreateMD5 {
	public static String getMD5(String plainText) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();

			int i;

			StringBuffer buffer = new StringBuffer();
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0) {
					i += 256;
				}
				if (i < 16) {
					buffer.append(0);
				}
				buffer.append(Integer.toHexString(i));

			}
			return buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null ;
		}

	}

}
