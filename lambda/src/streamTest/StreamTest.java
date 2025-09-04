package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		ArrayList<Integer> number2 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		ArrayList<Integer> number3 = new ArrayList<Integer>();
		List<Integer> number4 = number2.stream().map((n) -> n * 10).collect(Collectors.toList());
		String string1 = null;
//		Collections.reverseOrder() - 정렬기준이 들어있는 collection을 반환
		number.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		.collect(): 결과를 다양한 타입으로 리턴
//		다운캐스팅 - 잘 안 쓰는 방식
//		number3 = (ArrayList<Integer>)number2.stream().map((n) -> n * 10).collect(Collectors.toList());
		string1 = number2.stream().map((n) -> n * 10).map(String::valueOf).collect(Collectors.joining(","));
		
		System.out.println(string1); 
		
	}
}
