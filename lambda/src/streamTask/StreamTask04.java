package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamTask04 {
	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<Member>();
		ArrayList<Member> memberTemp = new ArrayList<Member>();
		ArrayList<Integer> membersInt = new ArrayList<Integer>();
		ArrayList<String> membersString = new ArrayList<String>();
		ArrayList<Long> hobbyIds = new ArrayList<Long>();
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		Member[] membersArr = {member1, member2, member3, member4, member5, member6};
//		ArrayList<Member> members = new ArrayList<Member>(Arrays.asList(member1, member2, member3, member4, member5, member6));
		
		members.addAll(Arrays.asList(membersArr));
//		취미를 3개 이상 가진 사람의 id를 출력
//		members.stream().filter((member) -> member.getHobby().contains("개발")).map(member -> "개발자 " + member.getName()).forEach(System.out::println);
		
//		조건에 맞는 유저 객체 배열을 기존 객체 배열에 담아주고,
//		members = members.stream()
//				.filter((member) -> member.getHobby().split("_").length >= 3)
//				.collect(Collectors.toCollection(ArrayList::new));
//		id만 출력
//		members.stream().map((member) -> member.getId()).forEach(System.out::println);

//		한줄로 변경
//		members.stream().filter((member) -> member.getHobby().split("_").length >= 3).map((member) -> member.getId()).forEach(System.out::println);
		
//		취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds 변수에 담기
//		hobbyIds = members.stream()
//				.filter((member) -> member.getHobby().split("_").length >= 3)
//				.map((member) -> member.getId()) // Id로만 변경
//				.collect(Collectors.toCollection(ArrayList::new));
//		
//		System.out.println(hobbyIds);
		
//		5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기
//		intValue로 long 타입을 int 타입으로 형변환
//		hobbyIds.stream().mapToInt(Long::intValue).mapToObj(Integer::valueOf).map(n -> members.get(n).getInfo()).forEach(System.out::println);
		
//		6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
		membersInt = members.stream().map((member) -> member.getInfo().length()).sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
		membersInt.stream().map((i) -> members.stream().filter((n) -> n.getInfo().length() == i).collect(Collectors.toCollection(ArrayList::new)).get(0).getInfo()).collect(Collectors.toCollection(ArrayList::new));
//		membersInt = members.stream().map((member) -> member.getInfo().length()).sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
//		members.stream().filter((member) -> member.getInfo().length() == membersInt.get(0)).collect(Collectors.toCollection(ArrayList::new)).get(0);
		
		membersString = members.stream().map((member) -> member.getInfo()).sorted(Comparator.comparing(String::length)).collect(Collectors.toCollection(ArrayList::new));
		
//		.max = 최대값 찾기

//		
		
	}
}
