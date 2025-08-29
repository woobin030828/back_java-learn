package lambdaTask;

//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

//		알고리즘
//		1. 문자열을 받는다.
//		2. 문자열을 순회한다.
//		3. 출력 결과를 순회한다.
//		4. 만약 같은 문자가 없다면, false를 반환하고 계속 순회한다.
//		5. 만약 같은 문자가 있다면, true를 반환하고 반복문에서 빠져나온다.
//		6. 출력 결과 반복을 빠져나오고, 만약 순회가 다 끝나도 false라면, result에 해당 문자를 집어넣는다(중복되는 값이 없었다는 의미)


public class LambdaTask02 {
	public static void main(String[] args) {
//		객체화이자, 메서드의 선언, 추상 메서드를 채움
		PrintNum printNum = () -> {
			for (int i = 0; i < 10; i++) {				
				System.out.println(i + 1);
			}
		};
		PrintString printString = (str, ch) -> {
			int count = 0;
			char[] charArr = str.toCharArray();
			for(char c: charArr) {
				if (c == ch) count++;
			}
			return count;
		};
		Reverse reverse = str -> {
			String result = "";
			
			for(int i = 0; i < str.length(); i++) {
				int reverseIndex = (str.length() - 1) - i;
				result += str.charAt(reverseIndex);
			}
			
			return result;
		};
		Remove remove = (str, ch) -> {
			String result = "";
			char[] charArr = str.toCharArray();
			for (char c: charArr) {
				if (c != ch) result += c;
			}
			
			return result;
		};
		
		Dedupe dedupe = str -> { 
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				if(!result.contains(String.valueOf(str.charAt(i)))) result += str.charAt(i);
			}
			return result;
		};
		
		int result2 = 0;
		String result3 = "", result4 = "", result5 = "";
		
		printNum.printUpTo10();
		result2 = printString.strCount("가나다가나다라가나다라마바사", '나');
		System.out.println(result2);
		result3 = reverse.reverseString("ABCDEFG");
		System.out.println(result3);
		result4 = remove.removeStr("가나다가나다라가나다라마바사", '나');
		System.out.println(result4);
		result5 = dedupe.getDedupe("가나다가나다라가나다라마바사");
		System.out.println(result5);
		
	}
}
