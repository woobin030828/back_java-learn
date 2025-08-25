package inheritanceTest;
// 상속도 추상화였다(상속도... 우리 민족이었어!)
// 기존에 있던 것에서 +a 된 것

// 부모
class A {
	String name;
	int data;
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
	
	
	void walk() {
		System.out.println("부모꺼");
		System.out.println("네발로 걷기");
	}
	
}

// 자식
class B extends A {
	public B () {
		super(); // 부모를 호출하는 키워드 - 부모의 생성자
		System.out.println(this);
		System.out.println("자식 생성자 호출");
	}
	void printData() {
		System.out.println(data);
	}
	
//	오버라이딩 상속에서 사용되는 메서드는 저장공간이다. 
//	덮어쓰기 X, 오버라이딩, 자식의 메서드와 부모의 메서드의 이름을 공유하는 것, 자식에서 덮어쓰기 X, 부모에서 끌어다 쓰고 있는 것 O
//	부모의 저장공간에 자식의 코드를 집어넣은 것, 부모의 공간을 빌려쓰는 느낌
	@Override
	void walk() { 
		System.out.println("두발로 걷기");
	}
}

class C extends B {
	public C() {
		super();
		System.out.println(this);
		System.out.println("손자 생성자 호출");		
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		C c = new C();
		c.walk();
	}
}
