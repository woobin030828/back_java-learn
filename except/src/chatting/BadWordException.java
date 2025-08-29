package chatting;

// Exception: 컴파일러가 검사한다. try ~ catch를 강제한다.
// 강제종료
// RuntimeExcpetion: 컴파일러가 검사하지 않는다. 즉 강제 종료가 되지 않는다.
public class BadWordException extends RuntimeException {
	public BadWordException() {;}
	public BadWordException(String message) {
		super(message);
	}
	
	
}
