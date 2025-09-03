package collectionTest.arrayList2;

public class Login {
	public static void main(String[] args) {
		UserField uf = new UserField();
		
//		회원가입
		User user = new User("fpqk33", "최우빈", "1q2w3e4r!", "01072557854");
		uf.join(user);
		
		System.out.println(DBConnecter.users);
		
//		로그인
		User userForLogin = new User("fpqk33", "최우빈", "1q2w3e4r!", "01072557854");
		
		if(uf.login(userForLogin)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		System.out.println(uf.loginUser);
		
//		비밀번호 변경
		userForLogin.setPassword("1q2w3e4r!");
		uf.update(userForLogin);
		
//		로그아웃
		uf.logout();
		System.out.println(uf.loginUser);
		
	}
}
