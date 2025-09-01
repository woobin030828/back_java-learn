package collection;

import java.util.ArrayList;

public class ArrayListTest02<T> {
	
	T data;
	
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		int[] dataInt = {10, 30, 50, 80, 20, 90};
		for(int num: dataInt) datas.add(num);	

		try {			
			System.out.println(datas.get(3)); // = datas[3]
			System.out.println(datas);
			if(datas.contains(50)) datas.add(datas.indexOf(50) + 1, 500);
			if(datas.contains(90)) datas.set(datas.indexOf(90), 9);
			if(datas.contains(80)) datas.remove(datas.indexOf(80));
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ArrayList02 예외 발생");
			System.out.println("인덱스 범위를 벗어났습니다!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(datas);
		
		
	}
}
