package lambdaExpert;

@FunctionalInterface
public interface Calc {
//	두 정수를 전달 받은 후 더하거나 빼서 리턴한다.
	public int calc(int num1, int num2);
}
