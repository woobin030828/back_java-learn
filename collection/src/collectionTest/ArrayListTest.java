package collectionTest;

import java.util.ArrayList;

public class ArrayListTest<T> {
//	<?>: 제네릭 - 포괄적인 즉, 이름이 없는 이라는 뜻
//	지금 당장 무슨 타입인지 알 수 없을 때 사용하는 타입이다
//	사용자가 어떤 타입의 데이터를 넣을지 모르기에 객체화할 때 타입을 결정해준다.
	
//	T 타입으로 있는 것, 뭐가 들어올지 모르니까 임의로 넣어놓은 것
	T data;
	
	
	public static void main(String[] args) {
//		기본 자료형은 들어올 수 없다
		ArrayList<String> datas = new ArrayList<String>();
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		datas.add("10");
//		toString이 이미 지정이 되어있다.
		System.out.println(datas); // datas.toString()
		
	}
}
