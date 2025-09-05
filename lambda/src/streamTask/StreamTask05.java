package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamTask05 {
	
	public ArrayList<String> hobbyList(String[] strArr){
		return new ArrayList<String>(Arrays.asList(strArr));
	}
	
	
 	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<Member>();
		ArrayList<String> twoHobbys = new ArrayList<String>();
		ArrayList<String> twoHobbysTemp = new ArrayList<String>();
		StreamTask05 st05 = new StreamTask05();
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		Member member7 = new Member("흰둥이", "개발_놀기", "개발도 운동도 다 잘해요!");
		Member[] membersArr = {member1, member2, member3, member4, member5, member6, member7};
//		ArrayList<Member> members = new ArrayList<Member>(Arrays.asList(member1, member2, member3, member4, member5, member6));
		
		members.addAll(Arrays.asList(membersArr));
		
		members.stream().map((member) -> member.getHobby().split("_")).filter((strArr) -> strArr.length == 2)
		.forEach((strArr) -> twoHobbys.addAll(st05.hobbyList(strArr)));
		
		String[] strArrs = members.stream().map((member) -> member.getHobby()).filter((hobby) -> hobby.split("_").length == 2).collect(Collectors.joining("_")).split("_");
		twoHobbysTemp.addAll(Arrays.asList(strArrs));
		
		System.out.println(twoHobbysTemp);
		System.out.println(twoHobbys);
		System.out.println(twoHobbys.size());
	}
}
