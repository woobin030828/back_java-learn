package streamTest.mapTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MapTest {
	public static void main(String[] args) {
		User user1 = new User(1L, "홍길동", "개발자", 17);
		User user2 = new User(2L, "장보고", "기획자", 17);
		User user3 = new User(3L, "이순신", "디자이너", 17);
		User user4 = new User(4L, "이성계", "개발자", 17);
		User user5 = new User(5L, "이태희", "사장", 22);
		
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<String> result = new ArrayList<String>();
		ArrayList<Integer> datas1 = new ArrayList<Integer>(); 
		ArrayList<String> datas2 = new ArrayList<String>(); 
		User[] usersArr = {user1, user2, user3, user4, user5};
		
		for(User user: usersArr) {
			users.add(user);
		}
		
		users.stream().map((user) -> user.getName()).forEach(result::add);
		
		System.out.println(result);
		
//		1부터 10까지 datas1에 추가한다
		IntStream.rangeClosed(1, 10).forEach(datas1::add);
//		datas1의 모든 값을 10배로 변경한다.
////		datas1의 모든 값을 출력한다
//		datas1.stream().map((n) -> {return n * 10;}).forEach((n) -> {
//			System.out.println(n);
//		});
		
//      2. .map()
//      ArrayList의 값을 알파벳으로 바꿔서 출력하기
//      ex)원본 [1, 2, 3, 4, 5, ..., 10]
//      ex)변경 ['A', 'B', 'C', ... 'J']
		System.out.println(datas1);

		datas1.stream().map((n) -> n + 'A' -1).forEach((n) -> {System.out.println(String.valueOf((char)((int)n)));});
		
		System.out.println(datas1);
		
	}
}
