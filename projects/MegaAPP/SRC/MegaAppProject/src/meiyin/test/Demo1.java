package meiyin.test;
import java.security.MessageDigest;

public class Demo1 {

	
	//加密  12345
	public byte[] encodePasword(String password){
		//加盐
		//password = "ewgasgwehyerhney12345thgrvjtriuyeafbtwthtreberte";
		//MD5
		String algorithm = "MD5";
		
		//char[] encodeHex = null;
		byte[] digest=null;
		try {
			MessageDigest instance = MessageDigest.getInstance(algorithm);
			digest = instance.digest(password.getBytes());
			//Hex
			//encodeHex = Hex.encodeHex(digest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return digest;
		
	}
	public static void main(String[] args)  {
		Demo1 demo= new Demo1();
		byte[] e = demo.encodePasword("123456");
		
	}
}
