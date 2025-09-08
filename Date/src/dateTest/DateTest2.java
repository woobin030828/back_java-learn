package dateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTest2 {
	public static void main(String[] args) {
//		객체가 아닌, 캘린더가 가지고있는 getInstance를 가져와 사용해야한다.
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");
		System.err.println(calendar.getTime());
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
//		프로젝트에 이거 써야해요 ㅠㅠ
		LocalDate now = LocalDate.now();
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		
	}
}
