package streamTask;

import java.util.stream.IntStream;

public class StreamTask02 {
	public static void main(String[] args) {
//		
		int result = 0;
//		result = IntStream.rangeClosed(1, 6).map((n) -> n * 10).sum();
		result = IntStream.rangeClosed(1, 6).map((n) -> n * 10).reduce(0, (sum, n) -> sum + n);
		System.out.println(result);
	}
}
