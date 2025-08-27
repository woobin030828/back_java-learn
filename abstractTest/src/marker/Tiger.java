package marker;

public class Tiger extends Animal implements CarnivoreMarker {
	public Tiger() {;}
	public Tiger(String name, int age, String feed) {
		super(name, feed, age);
	}
}
