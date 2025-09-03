package collectionTest.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("id", "fpqk33");
		hashmap.put("password", "1234");
		hashmap.put("name", "최우빈");
		hashmap.put("age", 23);
		hashmap.put("isRich", true);

		System.out.println(hashmap);
		Iterator<Entry<String, Object>> userMapEntrySet = hashmap.entrySet().iterator();
		
		while(userMapEntrySet.hasNext()) {
			Entry<String, Object> entry = userMapEntrySet.next();
			System.out.println(entry.getKey());
		}
		
	}
}
