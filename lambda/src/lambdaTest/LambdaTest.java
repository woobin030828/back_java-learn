package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {		
		LambdaInter lambdaInter = (num1, num2) -> {
			int result = num1 + num2;
			System.out.println(result);
		};		
		
		LambdaInter03 lambdaInter03 = num -> num % 2 == 0;
		
		lambdaInter.printAddResult(5, 4);
		System.out.println(lambdaInter03.isEven(3));
	}
	
	
}
