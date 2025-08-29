package exceptTask;

import java.util.Scanner;

public class exceptionTask02 {	
	
	private static void extracted() {
		throw new EmojiException("특수문자는 사용할 수 없습니다.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputMessage = "문자열을 입력해주세요 : ", inputString = "";
		SymbolInter symbolInter = (str) -> {			
			String[] emojis = {"!", "@", "#"};
			boolean isCheck = false;
			
			for(String c: emojis) {			
				isCheck = str.contains(c);				
				if (isCheck) break;
			}
			return isCheck;
		};
		
		System.out.print(inputMessage);
		inputString = sc.nextLine();
		
		try {	
			
			if (symbolInter.checkSymbol(inputString)) {
				extracted();
			} else {
				System.out.println(inputMessage);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println(e.getClass());
		}
		
		sc.close();
	}
}
