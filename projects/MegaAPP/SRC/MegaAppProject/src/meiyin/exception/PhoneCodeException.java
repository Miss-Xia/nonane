package meiyin.exception;

public class PhoneCodeException extends Exception {
		/**
	 * 
	 */
	private static final long serialVersionUID = -1348399087185551035L;
		private String message;

		public PhoneCodeException(String message){
			this.message = message;
		}
		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
		
	
}
