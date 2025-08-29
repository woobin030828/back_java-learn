package lambdaTask;

import java.util.Scanner;

import lambdaTest.CalcResult;
import lambdaTest.LambdaInter02;

public class LambdaTask {
	public void showCalcResult(CalcResult calcResult) {
		String resultMessage = "더하기 결과: %d\n빼기 결과: %d\n곱하기 결과: %d\n나누기 결과: %.2f";
		int addResult = 0, subResult = 0, mulResult = 0;
		double divResult = 0.0;		
		
		addResult = calcResult.getAdd();
		subResult = calcResult.getSubtract();
		mulResult = calcResult.getMultiply();
		divResult = calcResult.getDivide();
		System.out.printf(resultMessage, addResult, subResult, mulResult, divResult);
	}
	public static void main(String[] args) {
		LambdaInter02 lambdaInter02 = (num1, num2) -> {
			CalcResult calcResult = new CalcResult();
			calcResult.setAdd(num1 + num2);
			calcResult.setSubtract(num1 - num2);
			calcResult.setMultiply(num1 * num2);
			calcResult.setDivide(num1 / (double)num2);
			return calcResult;
		};
		CalcResult resultCalc = null;
		LambdaTask lmt = new LambdaTask();
		Scanner sc = new Scanner(System.in);
		int input1 = 0, input2 = 0;
		String inputMessage = "사칙연산에 사용할 수를 입력하세요.(공백 구분 / ex.5 3) : ";

		System.out.print(inputMessage);
		input1 = sc.nextInt();
		input2 = sc.nextInt();
		
		resultCalc = lambdaInter02.calc(input1, input2);
		lmt.showCalcResult(resultCalc);
		
		sc.close();
		
	}
}
