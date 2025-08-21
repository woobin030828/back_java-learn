package arrayTest;

import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
		int[] arData1 = new int[5], arData2 = new int[10], arData3 = new int[100],
				arData4 = new int[100], arData5 = new int[5], arData6 = null;
		char[] arDataChar1 = new char[6], arDataChar2 = new char[5];
		char trueValue = ' ';
		int resultSilver1 = 0, inputNumber = 0, 
				max = 0, min = 0, inputMaxNumber = 0, avg = 0, total = 0, j = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arData1.length; i++) {
			arData1[i] = 10 - i * 2;
			System.out.print(arData1[i]  + " ");
		}
		System.out.println("\n");
//      1~10까지 배열에 담고 출력
		for (int i = 0; i < arData2.length; i++) {
			arData2[i] = i + 1;
			System.out.print(arData2[i] + " ");
		}
		System.out.println("\n");
//      1~100까지 배열에 담은 후 홀수만 출력
		for (int i = 0; i < arData3.length; i++) {
			arData3[i] = i+1;
			if (arData3[i] % 2 != 0) {
				System.out.print(arData3[i]  + " ");
			}
		}
		System.out.println("\n");
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
		for (int i = 0; i < arData4.length; i++) {
			arData4[i] = i + 1;
			if (arData4[i] % 2 == 0) {
				resultSilver1 += arData4[i];
			}
		}
		System.out.println(resultSilver1);
//      A~F까지 배열에 담고 출력
		for (int i = 0; i < arDataChar1.length; i++) {
			arDataChar1[i] = (char)('A' + i);
			System.out.print(arDataChar1[i] + " ");
		}
		System.out.println("\n");
//      A~F까지 중 C제외하고 배열에 담은 후 출력
		j = 0;
		for (int i = 0; i < arDataChar2.length; i++) {
			trueValue = (char)('A' + j);
			if (trueValue == 'C' - 1) {				
				j +=2;
			} else {
				j +=1;
			}
			arDataChar2[i] = trueValue;
			System.out.print(arDataChar2[i] + " ");
		}
		System.out.println("\n");
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		for (int i = 0; i < arData5.length; i++) {
			System.out.printf("숫자를 입력하세요 %d 개째 : ", i + 1);
			inputNumber = sc.nextInt();
			arData5[i] = inputNumber;
			if(arData5[i] > max) {
				max = arData5[i];
			}
			if(arData5[i] < min) {
				min = arData5[i];
			}
		}
		System.out.printf("최대값 : %d , 최소 값 : %d", max, min);
		System.out.println("\n");
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		System.out.println("배열의 크기를 정해주십시오.");
		inputMaxNumber = sc.nextInt();
		arData6 = new int[inputMaxNumber];
		for (int i = 0; i < arData6.length; i++) {
			System.out.printf("숫자를 입력하세요 %d 개째 : ", i + 1);
			inputNumber = sc.nextInt();
			arData6[i] = inputNumber;
			total += arData6[i];
			
		}
		avg = total / inputMaxNumber;
		System.out.printf("총 합계는 %d, 평균 값은 %d 입니다.", total, avg);
	
		sc.close();
	}
}

// 알고리즘 -문제를 해결해내가는 과정
