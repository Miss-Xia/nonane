package meiyin.domain.outdata;

public class OutPhoneCode {
	private String sessionId;
	private int code_length;
	private Integer expires_in = 2590200;
	
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public int getCode_length() {
		return code_length;
	}
	public void setCode_length(int code_length) {
		this.code_length = code_length;
	}
	public Integer getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}
	
}
