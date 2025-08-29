package classTask;

// 클래스로 리턴
// 2개의 값을 전달하면 최솟값과 최대값을 구해주는 메서드
// 메인 메서드에서 사용



// 방법1, 하나의 클래스에서 연산
class Biggersmaller {
	int num1, num2, minBg, maxBg;
	
	public Biggersmaller() {;}
	
	public Biggersmaller(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	MinMax minmax() {		
		MinMax mmBg = new MinMax(minBg, maxBg);
		return mmBg;
	}
	
	int minBg() {
		return num1 < num2 ? num1 : num1 == num2 ? num1 : num2;
	}
	int maxBg() {
		return num1 > num2 ? num1 : num1 == num2 ? num1 : num2;		
	}
	
}
// 방법2, 하나의 클래스에서 연산 후, 다음 클래스에서 반환
class MinMax {
	int min, max;
	
	public MinMax() {;}
	public MinMax(int min, int max) {
		this.min = min;
		this.max = max;
	}
}

public class ClassTask03 {
	public static void main(String[] args) {
		
		Biggersmaller bs = new Biggersmaller(66, 42);
		MinMax mm = bs.minmax();
		
//		MinMax mm = new MinMax(bs);
		
		System.out.printf("최대값: %d, 최소값: %d", mm.min, mm.max);
	}
}


// 강사님 풀이
//package classTask;
//
////1. 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
////2. 클래스로 리턴
////3. 메인 메서드에서 메서드 사용
//public class ClassTask3 {
//Result getMaxAndMin(int[] arData) {
//   Result result = new Result(arData[0], arData[0]);
//   for(int i = 0; i < arData.length; i++) {
//      if(result.min > arData[i]) { result.min = arData[i]; };
//      if(result.max < arData[i]) { result.max = arData[i]; };
//   }
//   return result;
//}
//
//public static void main(String[] args) {
//   ClassTask3 ct3 = new ClassTask3();
//   int[] arData = {1, 3, 5, 9, 0};
//   Result result = ct3.getMaxAndMin(arData);
//   System.out.println(result.min);
//   System.out.println(result.max);
//}
//
//}


