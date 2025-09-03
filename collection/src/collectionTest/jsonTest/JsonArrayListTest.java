package collectionTest.jsonTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayListTest {
	public static void main(String[] args) {
		User user1 = new User(1L, "홍길동", "개발자", 17);
		User user2 = new User(2L, "장보고", "기획자", 17);
		User user3 = new User(3L, "이순신", "디자이너", 17);
		User user4 = new User(4L, "이성계", "개발자", 17);
		User user5 = new User(5L, "이태희", "사장", 22);
		
		ArrayList<User> users = new ArrayList<User>();
		User[] usersArr = {user1, user2, user3, user4, user5};
		JSONArray jsonArray = new JSONArray();
		
		for(User user: usersArr) {
			users.add(user);
		}
		
		
		users.stream().map((user) -> new JSONObject(user)).forEach((json) -> { jsonArray.put(json); }); 
		
		
		System.out.println(jsonArray);
		
	}
}
