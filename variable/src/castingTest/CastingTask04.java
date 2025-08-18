package castingTest;

public class CastingTask04 {
	public static void main(String[] args) {
		// 변수 선언 및 초기값 설정
		String num1 = " ", num2 =  " ", num3 = " ";
		double num1Double = 0.0, num2Double = 0.0, num3Double = 0.0;
		int num1Int = 0, num2Int = 0, num3Int = 0, result = 0;
		String num1String = "", num2String = "", num3String = "";
		// 제시 값 삽입
		num1 = "12.123";
		num2 = "345.789";
		num3 = "6789";
		// String 형식의 숫자들을 Double로 형변환
		num1Double = Double.parseDouble(num1);
		num2Double = Double.parseDouble(num2);
		num3Double = Double.parseDouble(num3);
		// Double 형식의 숫자들을 int로 강제 형변환하여 소수점 제거
		num1Int = (int)num1Double;
		num2Int = (int)num2Double;
		num3Int = (int)num3Double;
		// Int 형식의 숫자들을 다시 String 형식으로 강제 형변환
		num1String = String.valueOf(num1Int);
		num2String = String.valueOf(num2Int);
		num3String = String.valueOf(num3Int);
		// 출력값 포맷 설정
		result = Integer.parseInt(num1String + num2String + num3String);
		// 출력
		System.out.println(result);
	}
}
