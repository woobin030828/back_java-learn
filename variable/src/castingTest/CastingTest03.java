package castingTest;

public class CastingTest03 {
	public static void main(String[] args) {
		String num1 = "10"; // 클래스 자료형
		int num2 = 5;		// 기본 자료형
//		문자열의 강제 형변환
		System.out.println(Integer.parseInt(num1) + num2); // Integer: 클래스 자료형
		System.out.println(num1.charAt(0));
	}
}
