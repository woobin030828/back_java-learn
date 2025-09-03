package collectionTest.jsonTest;

import java.util.HashMap;

import org.json.JSONObject;

//	포맷을 바꿀 때, 초기값을 잘 이용해야한다.

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
				
		hashMap.put("street", "VictorPlains");
		hashMap.put("suite", "Suite 879");
		hashMap.put("city", "Wisokyburgh");
		hashMap.put("zipcode", "90566-7771");
		hashMap.put("lat", -43.9509);
		hashMap.put("lng", -34.4618);
		
		JSONObject json = new JSONObject(hashMap);
		
		System.out.println(json);
		
	}
}
