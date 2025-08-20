package controlStatement;

import java.util.Scanner;

// 5번
// HP: (0/5)

// 밥을 안주면 죽는다.
// 밥을 주면 HP 5가 된다.
// 행동 1번당 HP가 1씩 줄어든다.
// 1. 놀아주기
// 2. 씻겨주기
// 3. 노래하기
// 5. 밥주기
// 0. 게임종료

// 만족도 10
// 타마고치 키우기 성공!


public class Tamagotchi {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int tamago = 0, like = 0, hp = 5, action = 0;
      boolean flag = false;
	  String message = "어서오세요~ 타마고치 키우기\n(*￣3￣)╭",
            exampleMessage = "캐릭터를 선택하세요.",
            charSelectMessage = "나의 캐릭터 : %s %s",
            myChar = "",
            myCharName = "",
            th = "(╬▔皿▔)╯",
            hm = "(～￣(OO)￣)ブ",
            js = "(っ °Д °;)っ",
            sc = "（；´д｀）ゞ";
      
      System.out.println(message);
      
      while (tamago == 0 || tamago >= 5) {
    	  
    	  System.out.println(exampleMessage);
    	  System.out.println("1. 태히 " + th);
    	  System.out.println("2. 안민 " + hm);
    	  System.out.println("3. 준섬 " + js);
    	  System.out.println("4. 승창 " + sc);
    	  
    	  System.out.print("캐릭터 번호 입력 : ");
    	  tamago = scanner.nextInt();
          
          switch (tamago) {
          case 0:
        	  System.out.println("지정되지 않은 캐릭터입니다.");
        	  break;
          case 1:
        	  myChar = th;
        	  break;
          case 2:
        	  myChar = hm;
        	  break;
          case 3:
        	  myChar = js;
        	  break;
          case 4:
        	  myChar = sc;
        	  break;
    	  default:
    		 System.out.println("예외 발생, 다시 선택하세요."); 
          }
      }
      
      System.out.print("캐릭터의 이름을 입력해주세요 : ");
      myCharName = scanner.next();
      System.out.printf(charSelectMessage, myCharName, myChar);
      
      while(true) {
    	  System.out.println("행동을 입력하세요 \n" 
    			  + "1. 놀아주기 \n" + "2. 씻겨주기 \n" 
    			  + "3. 노래하기 \n"
    			  + "4. 잠자기 \n"
    			  + "5. 밥주기 \n"
    			  + "0. 게임종료");
    	  action = scanner.nextInt();
    	  switch(action) {
    	  case 1:
    		  hp--;
    		  like++;
    		  System.out.printf("%s (이)가 즐거워합니다. \n", myCharName);
    		  break;
    	  case 2:
    		  hp--;
    		  like++;
    		  System.out.printf("%s (이)가 노래를 부릅니다. \n", myCharName);
    		  break;
    	  case 3:
    		  hp = 5;
    		  System.out.printf("%s (이)가 밥을 먹습니다. \n", myCharName);
    		  break;
    	  case 0:
    		  flag = true;
    		  break;
    	  default:
    		  System.out.println("다시 입력해주세요.");
    		  break;
    	  }
    	  
    	  System.out.printf("남은 체력: (%d / %d), 만족감: (%d / %d)", hp, 5, like, 10);
          if(flag) { break; }
            
    	  if(hp == 0) {
    		  System.out.println("타마가 좋은 곳으로 갔습니다.");
    		  break;
    	  }
    	  if(like == 10 ) {
    		  System.out.println("클리어! \n 타마가 이세계로 보내졌습니다.");
    		  break;
    	  }
      }
      
   }
}












