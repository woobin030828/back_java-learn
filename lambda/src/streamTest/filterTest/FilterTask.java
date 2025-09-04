package streamTest.filterTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streamTest.mapTest.User;

public class FilterTask {
	
	public boolean userContainsJobLast (User user, String endWord) {
		return user.getJob().endsWith(endWord);
	}
	
	public boolean userContainsFirstName (User user, String firstName) {
		return user.getName().startsWith(firstName);
	}
	
	public Stream<User> filteredListFirstName(ArrayList<User> users, String str) {
		return users.stream().filter((user) -> userContainsFirstName(user, str));
	}
	public Stream<User> filteredListJobLast(ArrayList<User> users ,String str) {
		return users.stream().filter((user) -> userContainsJobLast(user, str));
	}
	
	public static void main(String[] args) {
		User user1 = new User(1L, "홍길동", "개발자", 17);
		User user2 = new User(2L, "장보고", "기획자", 17);
		User user3 = new User(3L, "이순신", "디자이너", 30);
		User user4 = new User(4L, "이성계", "개발자", 17);
		User user5 = new User(5L, "이태희", "사장", 22);
		FilterTask ft01 = new FilterTask();
		ArrayList<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4, user5));
		
//		출력
//		1번
//		users.stream().filter((user) -> user.getAge() < 20).forEach(System.out::println);
//		2번
//		ft01.filteredList(users).forEach(System.out::println);
//		3번
		ft01.filteredListJobLast(users, "자").forEach(System.out::println);
//		다시 담기
//		1번
//		users = ft01.filteredListFirstName(users).collect(Collectors.toCollection(ArrayList::new));
//		2번
//		users = ft01.filteredListFirstName(users).collect(Collectors.toCollection(ArrayList::new));
//		3번
		users = ft01.filteredListJobLast(users, "자").collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println(users);
	}
}
