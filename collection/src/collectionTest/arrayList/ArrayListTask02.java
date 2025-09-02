package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask02 {
	public static void main(String[] args) {
		ArrayList<String> stringArr = new ArrayList<String>();
		
		for(int i = 0; i <= 25; i++) {
			String word = String.valueOf((char)('a' + i));
			stringArr.add(word);
		}
		
		System.out.println(stringArr);
		
		for(int i = 0; i < stringArr.size(); i++) {			
			if (i % 2 != 0) {
				stringArr.set(i, stringArr.get(i).toUpperCase());
			}
		}
		
		System.out.println(stringArr);
	}
}
