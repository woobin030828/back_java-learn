package abstractTest;

//	필요하긴한데, 당장 사용하지 않을 때, 다른 곳에서 사용하기 위해 추상할 때
//	abstract
public abstract class Electronics {
//	클래스 안에 있기 때문에, 선언이 있는 것이다.
//	추상 메서드는 추상 클래스에서만 선언할 수 있다.
//	추상 메서드도 만들 수 있으나, 일반 메서드도 만들 수 있다.
//	추상 메서드와 일반 메서드를 같이 가질 수 있음
	
//	추상 메서드
	public abstract void safe(); // 중괄호가 없어도 클래스 내부에 있기 때문에, '선언'으로 보는 것이 맞다.
//	일반 메서드
	public void on() {
		System.out.println("전원 킴");
	}
}
