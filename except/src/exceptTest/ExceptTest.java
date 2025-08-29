package exceptTest;

public class ExceptTest {
	public static void main(String[] args) {
		int[] arData = new int[5];
		try {
			arData[5] = 10;
		} catch(ArithmeticException e) {
			System.err.println("0으로 나눌 수 없다");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("좋은 말로 할 때 인덱스 확인하지 못할까!");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("알 수 없는 오류가 발생했습니다.");
			e.printStackTrace();
		}
		
		
	}
}
