package streamTest.mapTest;

import java.util.ArrayList;
import java.util.Arrays;

public class MapTask01 {
	
	public String addRoot(String url) {
		return "/app" + url;
	}
	
	public static void main(String[] args) {
		
		MapTask01 mt = new MapTask01();
		
		ArrayList<String> arList = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		arList.stream().map(mt::addRoot).forEach(System.out::println);
	}
}
