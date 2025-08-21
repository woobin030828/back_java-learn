package methodTest;

public class MethodTask01 {
	
//	1부터 지정한 정수까지 출력하는 메서드
	void printNumber(int num) {
//		출력용 문자열 정의
		String resultText = "";
//		지정한 정수만큼 반복
		for (int i = 0; i < num; i++) {
			resultText += i == num - 1 ? (i + 1) + "" : (i + 1) + ", ";
		}
//		출력
		System.out.println(resultText);
	}
//	1부터 지정한 정수까지 반환하는 메서드
	String printNumberString(int num) {
//		반환용 문자열 정의
		String resultText = "";
//		지정한 정수만큼 반복
		for (int i = 0; i < num; i++) {
			resultText += i == num - 1 ? (i + 1) + "" : (i + 1) + ", ";
		}
//		반환
		return resultText;
	}
	
	public static void main(String[] args) {
//		사용준비
		MethodTask01 mt1 = new MethodTask01();
//		10까지 출력하는 메서드 사용
		mt1.printNumber(10);
//		★ 응용, 문자열 반환 - 출력
		System.out.println(mt1.printNumberString(10));
	}
}
