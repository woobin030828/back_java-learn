package anonymousTask;

public class MathField {
	public static void main(String[] args) {
		MathTask mt = new MathTask() {
			
			@Override
			public void setName(String name) {
				System.out.println(name);
			}
			
			@Override
			public String concat(String text1, String text2) {
				String result = "";
				result = text1 + text2;
				return result;
			}
			
			@Override
			public CalcResult calc(int num1, int num2) {
				CalcResult cr = new CalcResult(num1, num2);
				cr.setAdd(num1 + num2);
				cr.setSubtract(num1 - num2);
				cr.setMultiply(num1 * num2);
				cr.setDivide(num1 / (double)num2);
				return cr;
			}
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		CalcResult calcResult = mt.calc(50, 5);
		
		mt.setName("우빈 초이");
		System.out.println(mt.concat("우빈", "초이"));
		System.out.println(calcResult.getAdd());
		System.out.println(calcResult.getSubtract());
		System.out.println(calcResult.getMultiply());
		System.out.println(calcResult.getDivide());
		System.out.println(mt.add(5, 10));
	}
}
