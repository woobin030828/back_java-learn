package arrayTest;

public class ArrayTask03 {
	public static void main(String[] args) {
//		2 - 초기값으로 10, 20, 30, 40, 50 담기
//		변수들 초기값 선언
		int[] intArr1 = new int[10], intArr2 = {10, 20, 30, 40, 50},
				intArr3 = new int[10],intArr4 = new int[10], intArr5 = new int[10];
		int total2 = 0, avg2 = 0, total5 = 0;
		String tempString1 = "", tempString3 = "",
				resultString1 = "", resultString3 = "", resultString4 = "", tempString4 = "";
		
		
//      1. 1~20까지 짝수만 배열에 담고 배열안에 값에 모두 3을 더한 값으로 변경 후 출력하기  
		for (int i = 0; i < intArr1.length; i ++) {
//			1부터 20까지의 짝수만 담고, 3을 더하기
			intArr1[i] += (((i + 1) * 2) + 3);
//			출력
			tempString1 = i == intArr1.length - 1 ? intArr1[i] + "" : intArr1[i] + ", ";
			resultString1 += tempString1;
		}
		resultString1 = "[" + resultString1 + "]";
		System.out.printf("1번 문제, %s \n", resultString1);
		
//      2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기
//		합계 선언
		total2 = 0;
//		for 배열 내 모든 값 누적합 구하기
		for (int i = 0; i < intArr2.length; i++) {
			total2 += intArr2[i];
		}
		
//		합계를 intArr2의 length 만큼 나누기
		avg2 = total2 / intArr2.length;
//		출력
		System.out.printf("2번 문제, [10, 20, 30, 40, 50]의 평균 %d \n", avg2);
		
//      3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기
//		for 1~10까지 배열에 담기
		for(int i = 0; i < intArr3.length; i++) {
			intArr3[i] = i + 1;
//			if 값이 5보다 크다면, 값을 2배로 변경해서 출력하기
			intArr3[i] = intArr3[i] > 5 ? intArr3[i] *= 2 : intArr3[i];
//			출력
			tempString3 = i == intArr3.length - 1 ? intArr3[i] + "" : intArr3[i] + ", ";
			resultString3 += tempString3;
		}
		resultString3 = "[" + resultString3 + "]";
		System.out.printf("3번 문제, %s \n", resultString3);
		
//      4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10 
//		for 1~10까지 배열에 담기
		for (int i = 0; i < intArr4.length; i++) {
			intArr4[i] = i + 1;
//      	단 마지막은 *이 붙지 않는다
//			if 마지막 값이라면, *을 붙이지 않고 그냥 누적
//			else 마지막 값이 아니라면, *을 붙이고 문자열에 누적 
//			나올 결과가 2개 밖에 없기 때문에, 삼항연산자 사용
			tempString4 = i == intArr4.length - 1 ? intArr4[i]+ "" : intArr4[i] + "*";
			resultString4 += tempString4;
		}
//		출력
		System.out.printf("4번 문제, %s \n", resultString4);
		
//      5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기 
//		합계 선언
		total5 = 0;
//		for 1~10까지 배열에 담기
		for (int i = 0; i < intArr5.length; i++) {
			intArr5[i] = i + 1;
//			if 들어간 값이 3의 배수라면, 누적하기
			total5 += intArr5[i] % 3 == 0 ? intArr5[i] : 0;
		}
//		출력
		System.out.printf("5번 문제, 3의 배수의 합계 %d \n", total5);
	}
}