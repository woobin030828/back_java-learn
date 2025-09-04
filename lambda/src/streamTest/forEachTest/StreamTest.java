package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		ArrayList<Integer> newDatas1 = new ArrayList<Integer>();
		ArrayList<Integer> newDatas2 = new ArrayList<Integer>();
		ArrayList<Integer> newDatas3 = new ArrayList<Integer>();
		
//		IntStream - 정수 

//		.range(시작, 끝): 마지막을 포함하지 않음
//		.rangeClosed(시작, 끝): 마지막을 포함한다
		IntStream.rangeClosed(1, 10).forEach((n) -> {datas.add(n);});
		
//		1~5까지 스트림 문법으로 출력하기
//		IntStream.rangeClosed(1, 5).forEach((n) -> {System.out.println(n);});
		
//		참조형 문법 .(소속::메서드명)
//		IntStream.rangeClosed(1, 5).forEach(System.out::println);

//		datas 짝수만 출력하기
		System.out.println(datas);
		
//		1. stream 써보기
		datas.stream().filter((n) -> {return n % 2 == 0;}).forEach(System.out::println);
//		2. stream 써보기 + 새 배열에 담아 출력하기
 		datas.stream().filter((n) -> {return n % 2 == 0;}).forEach((n) -> {newDatas1.add(n);});
//		3. 그냥 ArrayList.forEach 써보기 // 람다식 사랑해
 		datas.forEach((n) -> { 
			if (n % 2 == 0) {
				newDatas2.add(n);
			}
		});
 		System.out.println(newDatas2);
 		
// 		홀수만 출력하기
// 		forEach 쓰기
// 		datas.forEach((n) -> {
// 			if (n % 2 != 0) {
// 				System.out.println(n);
// 			}
// 		});
 		datas.stream().filter((n) -> {return n % 2 != 0;}).forEach(System.out::println);
 		datas.stream().filter((n) -> {return n % 2 != 0;}).forEach(newDatas3::add);
 		
// 		.stream(): 컬렉션을 stream 객체로 변경
// 		.chars() : 문자열을 stream 객체로 변경
  		"ABCD".chars().forEach((c) -> {System.out.println((char)c);});
		
		System.out.println(newDatas3);
	}
}
