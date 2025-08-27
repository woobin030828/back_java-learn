package innerTest;

public class InnerTest {
	
//	내부 클래스
	public class Test {
		int value;
		
		public Test() {
			this.value = 20;
		}
		
		public void printValue() {
			System.out.println(this.value);
		}
	}
	public static void main(String[] args) {
		InnerTest it = new InnerTest();
		Test itt = it.new Test();
		
		itt.printValue();
	}
}
