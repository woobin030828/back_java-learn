package anonymousTask02;

public class AnonymousTask02 {
	public static void main(String[] args) {
		MyInter myInter = new MyInter() {
//			람다식 문법
			@Override
			public void deleteC(String str) {
				String result = "";
				for(int i = 0; i < str.length(); i++) {
					if (i != 2) result += str.charAt(i);	
				}
				System.out.println(result);
			}
//			public void deleteC(String str) {
//				String result = "";
//				for(int i = 0; i < str.length(); i++) {
//					if (str.charAt(i) != 'C') result += str.charAt(i);	
//				}
//				System.out.println(result);
//			}			
			@Override
			public String changeLetter(String str) {
				int asciiKey = 'a' - 'A';
				boolean isBigger = false;
				String result = "";
				char resultChar = ' ';
				
				for(int i = 0; i < str.length(); i++) {
					if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
						isBigger = true;
					} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
						isBigger = false;
					}
					resultChar = isBigger ? (char)(str.charAt(i) - asciiKey) : (char)(str.charAt(i) + asciiKey);
					
					result += resultChar;
				}
				return result;
			}
		};
		myInter.deleteC("ABCD");
		System.out.println(myInter.changeLetter("asdadsDSDDaasdaDSDDA"));
	}
}
