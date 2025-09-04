package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest02 {
	public static void main(String[] args) {
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		ArrayList<String> datas3 = new ArrayList<String>();
		ArrayList<String> datas4 = new ArrayList<String>();
		ArrayList<String> datas5 = new ArrayList<String>();
//		1부터 10까지 추가
		IntStream.rangeClosed(1, 10).forEach(datas1::add);
//		1~5 삭제
		IntStream.rangeClosed(1, 5).forEach((n) -> {datas1.remove(0);});
		
//		10부터 1까지 추가
		IntStream.range(0, 10).forEach((n) -> datas2.add(10 - n));

		"ABCDEFGHIJK".chars().forEach((c) -> {datas3.add(String.valueOf((char)c));});
		"aBcDeFgHiJk".chars().forEach((c) -> {
			if(c >= 'a' && c <= 'z') {
				datas4.add(String.valueOf((char)c));				
			}
		});
//		datas4.forEach(System.out::println);
		
		"aBcDeFgHiJk".chars().forEach((c) -> {datas5.add(String.valueOf((char)c).toUpperCase());});
		datas5.forEach(System.out::println);
		
		System.out.println(datas1);		
		System.out.println(datas2);
		System.out.println(datas3);
		System.out.println(datas4);
		System.out.println(datas5);
	}
}
