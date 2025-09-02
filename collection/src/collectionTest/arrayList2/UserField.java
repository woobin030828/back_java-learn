package collectionTest.arrayList2;

import java.util.ArrayList;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	public static User loginUser = null;
	
//	아이디검사
	public User checkId(String id) {
		for(User user: users) {
			if(!user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	
//	회원가입
	public void join(User user) {
		User userInDb = checkId(user.getId());
		
		if(userInDb == null) {
			users.add(user);
		}
	}
//	로그인
	public void login(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb == null) {
			System.out.println("아이디가 일치하지 않습니다.");
			loginUser = null;
		} else {
			if(userInDb.getPassword().equals(user.getPassword())) {
				System.out.printf("로그인 성공, 환영합니다 %s 님", userInDb.getName());
				loginUser = userInDb;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				loginUser = null;
			}
		}
	}

	
//	로그아웃
	public void logout(User user) {
		loginUser = null;
	}
//	암호화
	public String passwordEncryption(String str){
		String encryptionPassword = "";
		if(str != null) {
			for(char c: str.toCharArray()) {
				encryptionPassword += (char)(c + '!' + (Math.random() * 10) * (Math.random() * 10));
			}
			return encryptionPassword;
		} else {
			return null;
		}
	}
//	비밀번호 변경(마이페이지)
//	비밀번호 변경(비밀번호 변경 30일)
//	인증번호 전송
//	인증번호 생성
//	인증번호 확인
}
