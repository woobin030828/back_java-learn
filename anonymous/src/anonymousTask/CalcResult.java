package anonymousTask;

public class CalcResult {

	private int num1, num2, add, subtract, multiply;
	private double divide;
	
	public CalcResult() {;}
	public CalcResult(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public int getSubtract() {
		return subtract;
	}
	public void setSubtract(int subtract) {
		this.subtract = subtract;
	}
	public int getMultiply() {
		return multiply;
	}
	public void setMultiply(int multiply) {
		this.multiply = multiply;
	}
	public double getDivide() {
		return divide;
	}
	public void setDivide(double divide) {
		this.divide = divide;
	}

	
}
