package staticTest;

class Data {
	int data = 10;
	static int data_s = 10;
	
	void increase() {
		System.out.println(++data);
	}
	void increase_s() {
		System.out.println(++data_s);
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Data data1 = new Data();
		
		System.out.println("noStatic시작");
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		System.out.println("새로호출");
		data1 = new Data();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
//		System.out.println("Static시작");
//		data1.increase_s();
//		data1.increase_s();
//		data1.increase_s();
//		data1.increase_s();
//		data1.increase_s();
//		data1.increase_s();
//		System.out.println("새로호출");
//		data1 = new Data();
//		data1.increase_s();
//		data1.increase_s();
//		data1.increase_s();
//		data1.increase_s();
//		data1.increase_s();
//		data1.increase_s();
		
	}
}
