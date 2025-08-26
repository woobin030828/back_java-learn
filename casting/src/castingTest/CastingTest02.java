package castingTest;

class Car {
	public Car() {;}
	void engineStart() {
		System.out.println("열쇠로 시동 켬");
	}
}

class SuperCar extends Car {
	public SuperCar() {;}
	void engineStart() {
		System.out.println("음성으로 시동 켬");
	}
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
}

public class CastingTest02 {
	public static void main(String[] args) {
//		부모는 자식 타입이 아니다. 자식은 부모 타입이다.
		Car matiz = new Car(); //객체화
//		SuperCar ferrari = new Car(); // 그 무엇도 아닌 오류, 
		Car ferrari = new SuperCar(); // 업캐스팅 - 자식이 부모로 선언된게 업캐스팅이다.
		SuperCar ferrari2 = new SuperCar(); // 객체화
		Car matiz2 = (Car)new SuperCar(); // 업캐스팅
		Car matiz3 = (Car)new SuperCar(); // 업캐스팅 <- 부모의 그릇에 자식을 넣었기 때문에
		SuperCar matiz4 = (SuperCar)matiz3; // 다운캐스팅 - 업케이스팅 된 객체를 자식의 객체로 올려, +@를 다시 구현시키기 위해 자식의 객체로 선언시키는 방법
		SuperCar[] superCars = {new SuperCar(), (SuperCar)new Car()}; // 그냥 객체화
		Car[] cars = {new Car(), (SuperCar)new SuperCar()}; // 객체화, 업캐스팅(SuperCar)은 무시해도 된다.
		
		
		
	}
}
