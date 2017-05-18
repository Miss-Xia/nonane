package meiyin.domain.outdata;

public class InSession {

	private Long InSessionTime;
	private String message;
	private Integer expires_in = 2590200;
	private String access_token;
	private Integer accountId;
	public Long getInSessionTime() {
		return InSessionTime;
	}
	public void setInSessionTime(Long inSessionTime) {
		InSessionTime = inSessionTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
}
