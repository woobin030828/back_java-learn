package marker;

public class Bear extends Animal implements CarnivoreMarker {
	public Bear() {;}
	public Bear(String name, int age, String feed) {
		super(name, feed, age);
	}
}
