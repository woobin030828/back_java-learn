package castingTest;

public class CastingTask02 {
	public static void main(String[] args) {
		String num2 ="", num3;
		int num1 = 0, num2Int = 0, num3Int = 0;
		double num2Double = 0.0, num3Double = 0.0;
		String num1String = "", result = "";
		
		num1 = 1;
		num2 = "8.24";
		num3 = "7.8";
		
		num1String = num1 + "";
		num2Double = Double.parseDouble(num2);
		num3Double = Double.parseDouble(num3);
		num2Int = (int)num2Double;
		num3Int = (int)num3Double;
		
		result = num1String + (num2Int + num3Int);
		
		System.out.println(result);
		
	}
}
