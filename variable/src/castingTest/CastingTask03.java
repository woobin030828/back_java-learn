package castingTest;

public class CastingTask03 {
	public static void main(String[] args) {
//		String.valueOf(값)
//		어떤 값을 문자열로 강제 형변환
//		변수 선언 및 초기화
		char a = ' ', j = ' ', k = ' ';
		String A = "", J = "", K = "";
		int asciiGap = 'a' - 'A';
//		변수 char 값 삽입
		a = 'a'; 
		j = 'j';
		k = 'k';
//		ASCII 이용, 대문자로 변경 및 String.valueOf 활용하여 문자열로 변경
		A = String.valueOf((char)(a - asciiGap));
		J = String.valueOf((char)(j - asciiGap));
		K = String.valueOf((char)(k - asciiGap));
//		출력
		System.out.printf("결과: %S %S %S", A, J, K);
	}
}
