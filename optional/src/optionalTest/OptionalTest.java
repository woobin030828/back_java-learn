package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("최우빈", "cwb", "1234"),
			new User("최우빈", "cwb", "1234"),
			new User("최우빈", "cwb", "1234"),
			new User("최우빈", "cwb", "1234")
			));
	public Optional<User> findById(Long id) {
		User user = null;
		for(User userInDb: users) {
			if(userInDb.getId() == id) {
				user = userInDb;
			}
		}
		return Optional.ofNullable(user);
	}
	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
		Optional<User> foundUser = optionalTest.findById(200L);
		
		try {
			User user = foundUser.orElseThrow(() -> {
				throw new NoSearchUserException("유저를 찾을 수 없습니다.");
			});
			System.out.println(user);
		} catch(NoSearchUserException e) {
			System.out.println("유저를 찾을 수 없습니다.");
		}
		
		System.out.println(foundUser.map(User::getId).isPresent());
		
		optionalTest.findById(100L).map(User::getUserEmail).ifPresent(System.out::println);
		optionalTest.findById(100L)
		.map(User::getUserEmail)
		.ifPresentOrElse(System.out::println,
				() -> {System.out.println("존재하지 않는 유저입니다.");});
		
	}
}
