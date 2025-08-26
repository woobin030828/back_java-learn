package castingTask02;

import java.util.Scanner;

// 캐릭터(Character)
// 사냥 메서드

// 오크(Orc) 클래스 - 도끼
// 콜록! 을 출력
// 요정(Fairy) 클래스 - 팬던트
// ㄴr는ㄱr끔 눈물을 흘린ㄷr... 을 출력
// 휴먼(Humen) 클래스 - 골드
// 해치웟나...? 를 출력

public class CastingTask02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputMessage1 = "이름을 입력하십시오.(ex. 냐뮤) : ", inputMessage2 = "직업을 선택하십시오 (1: 용기사, 2: 리퍼, 3: 아이스메이지): ",
				characterName = "";
		int myJob = 0;
		
		characterName = sc.next();
		myJob = sc.nextInt();
		
		Character character = new Character(characterName, myJob);
		
		Innocence innocence = new Innocence();
		
		character.huntrix(innocence);
	}
}
