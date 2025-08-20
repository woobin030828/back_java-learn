package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arData1 = {1, 2, 3, 4}; // [I@75412c2f 해시 == 배열의 주소 , 값을 모두 알고 있을 때
		int[] arData2 = new int[5]; // new = 배열을 메모리를 할당 시킬 때, hip메모리에 int 5칸 배열을 할당시키고, 그 할당된 주소값을 들고오는 역할
//		어디에 할당해야할지 알려주는 역할 , 메모리에 할당 되어있음. // 칸수를 알고 있을 때
//		동적 메모리 할당 // new 할당된 주소값을 들고오는 
//		자바는 정적 메모리 할당이기 때문에, 메모리 낭비를 하게 두지 않는다.
		int[] arData3 = null; // 주소의 초기값(대체값), 값도 모르고 칸수도 모를 때, null은 언젠가 나중에 선언할 때 그 주소로 대체하기 위해서 정의해두는 초기값
		
		for (int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
	}
}