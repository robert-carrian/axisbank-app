package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtils {

	
	public String encodePwd(String pwd) {
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(pwd.getBytes());
		String encodedPwd = new String(encode);
		return encodedPwd;
	}
	
}
