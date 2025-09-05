package streamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask03 {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = IntStream // IntStream
				.rangeClosed(1, 10) // IntStream 
				.filter((n) -> n % 2 != 0) // IntStream
				.map((n) -> n * 10) // Stream<Integer>
				.mapToObj(Integer::valueOf) // Stream<Integer>
				.collect(Collectors.toCollection(ArrayList::new)); // ArrayList<Integer>
		
		List<Integer> list = arrList;
 		System.out.println(arrList);
 		System.out.println(list);
	}
}
