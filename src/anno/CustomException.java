package anno;

public class CustomException {

	static class StartWithCapLatterException extends RuntimeException {

		private static final long serialVersionUID = 1L;
		
		public StartWithCapLatterException(String message) {
			 super(message);
		}
	}
	
	static class InvalidMobileNoException extends RuntimeException {

		private static final long serialVersionUID = 1L;
		
		public InvalidMobileNoException(String message) {
			 super(message);
		}
	}
	
	static class InvalidEmailException extends RuntimeException {

		private static final long serialVersionUID = 1L;
		
		public InvalidEmailException(String message) {
			 super(message);
		}
	}
	
	static class LengthExceedException extends RuntimeException {

		private static final long serialVersionUID = 1L;
		
		public LengthExceedException(String message) {
			 super(message);
		}
	}
}
