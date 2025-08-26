package castingTest;
// 캐스팅을 알기 위해서는, 넘치는 것은 가능하지만, 부족하면 안된다.
// 자식은 부모 타입이다.

// 자식의 객체를 부모 타입으로 선언한 상태, 메모리에 할당 시킬 때, 부모에 해당하는 영역만 선언하고, +@의 영역은 모두 사용할 수 없는 상태.
// 부모가 가지고 있는 메서드 외 자신의 메서드는 사용할 수 없는 상태

// 자식이 만들어놓은 

class A {
	public A() {;}
	void test() {
		System.out.println("A");
	}
}

class B extends A {
	public B() {;}
	void test() {
		System.out.println("B");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		A b = new B(); //업캐스팅
		B bb = (B)b; //다운캐스팅
		b.test();
		bb.test();
	}
}
