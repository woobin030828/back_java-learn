package castingTest;

public class CastingTask01 {
	public static void main(String[] args) {
//      8.43 + 2.59를 더한 값이 10이 되도록 출력 (형변환)
		double num1 = 0.0, num2 = 0.0;
//		강제 형변환 된 값을 담아줄 변수 선언
		int num1Int = 0, num2Int = 0;
//		변수 담아주기
		num1 = 8.43;
		num2 = 2.59;
//		num1, num2 강제 형변환
		num1Int = (int)num1;
		num2Int = (int)num2;
		System.out.println(num1Int + num2Int);
//		양방향 암호화, 단방향 암호화(실무에서 쓰이는)
		System.out.println((char)('A' * 100));
		
	}
}
