package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask01 {
	public static void main(String[] args) {
		ArrayList<Integer> arList1 = new ArrayList<Integer>();
		ArrayList<Character> arList2 = new ArrayList<Character>();
		ArrayList<Integer> arList3 = new ArrayList<Integer>();
		ArrayList<Character> arList4 = new ArrayList<Character>();
		ArrayList<String> arList5 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
		ArrayList<String> arList6 = new ArrayList<String>(Arrays.asList("Apple","banana","Melon","orange"));
		String inputString = "공칠이삼";
		ArrayList<String> arList7 = new ArrayList<String>(Arrays.asList(inputString.split("")));
		String hangleArr = "공일이삼사오육칠팔구";
		
		String tt = "0723";
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> arList8 = new ArrayList<String>(Arrays.asList(tt.split("")));
		
//		1번 문제
		IntStream.rangeClosed(1, 10).forEach(arList1::add);
		System.out.println("1번 문제: " + arList1);
//		2번 문제
		arList2 = arList1.stream().map((n) -> (char)(n + 'A' - 1)).collect(Collectors.toCollection(ArrayList::new));
//		arList2.forEach(System.out::println);
		System.out.println("2번 문제: " + arList2);
//		3번 문제
		IntStream.rangeClosed(1, 100).filter((n) -> n % 2 != 0).forEach(arList3::add);
		System.out.println("3번 문제: " + arList3);		
//		4번 문제
		arList4 = arList2.stream().filter((c) -> c != 'c').collect(Collectors.toCollection(ArrayList::new));
		System.out.println("4번 문제: " + arList4);
//		5번 문제
		arList5 = arList5.stream().map((str) -> str.toLowerCase()).collect(Collectors.toCollection(ArrayList::new));
		System.out.println("5번 문제: " + arList5);
//		6번 문제
		arList6 = arList6.stream().filter((str) -> str.charAt(0) >= 'A' && str.charAt(0) <= 'Z').collect(Collectors.toCollection(ArrayList::new));
		System.out.println("6번 문제: " + arList6);
//		7번 문제
		arList7 = arList7.stream().map((h) -> String.valueOf(hangleArr.indexOf(h))).collect(Collectors.toCollection(ArrayList::new));
		System.out.println("7번 문제: " + arList7);
//		8번 문제
		arList8.forEach((n) -> intList.add(Integer.parseInt(n)));
		arList8 = intList.stream().map((n) -> String.valueOf(hangleArr.charAt(n))).collect(Collectors.toCollection(ArrayList::new));
		System.out.println("8번 문제: " + arList8);
	}
}
