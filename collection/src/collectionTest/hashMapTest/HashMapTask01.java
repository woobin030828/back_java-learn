package collectionTest.hashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

// HashMap 자료구조
//HashMap 자료구조
//"street", "Victor Plains",
//"suite", "Suite 879",
//"city", "Wisokyburgh",
//"zipcode", "90566-7771",
//"lat", -43.9509,
//"lng", -34.4618

public class HashMapTask01 {
	public static void main(String[] args) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		
		hashMap.put("street", "VictorPlains");
		hashMap.put("suite", "Suite 879");
		hashMap.put("city", "Wisokyburgh");
		hashMap.put("zipcode", "90566-7771");
		hashMap.put("lat", -43.9509);
		hashMap.put("lng", -34.4618);
		
		
//		1. 인터렉터 / 엔트리에 담아 순차적으로 while문을 톨해 뿌려주기
		ArrayList<Object> resultValues1 = new ArrayList<Object>();
		Iterator<Entry<String, Object>> hashInterator = hashMap.entrySet().iterator();
		
		while(hashInterator.hasNext()) {
			Entry<String, Object> entry = hashInterator.next();
			resultValues1.add(entry.getValue());
		}
//		2. values 메서드를 이용해 한번에 담아버리기
		ArrayList<Object> resultValues2 = new ArrayList<Object>(hashMap.values());
//		ArrayList resultValues6 = new ArrayList(hashMap.values()); //타입 생략 가능
		
//		3. values 메서드 및 빠른 for문을 이용해 담아버리기
		ArrayList<Object> resultValues3 = new ArrayList<Object>();
		for(Object value: hashMap.values()) {
			resultValues3.add(value);
		}
//		4. 
		ArrayList<Object> resultValues4 = new ArrayList<Object>();
		for(Object key: hashMap.keySet()) {
			resultValues4.add(hashMap.get(key));
		}
		ArrayList<String> resultValues5 = new ArrayList<String>();
		
		for(Object value: hashMap.values()) {
			resultValues5.add(String.valueOf(value));
		}
		
		
		
		System.out.println(resultValues1);
		System.out.println(resultValues2);
		System.out.println(resultValues3);
		System.out.println(resultValues4);
		System.out.println(resultValues5);
	}
}
