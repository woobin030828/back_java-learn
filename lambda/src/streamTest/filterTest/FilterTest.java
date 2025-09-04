package streamTest.filterTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterTest {
	public static void main(String[] args) {
		List<Integer> numbers = IntStream.rangeClosed(1, 10).filter((n) -> n % 2 == 0).boxed().collect(Collectors.toList());
	}
}
