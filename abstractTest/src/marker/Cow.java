package marker;

public class Cow extends Animal implements HerviboreMarker {
	public Cow() {;}
	public Cow(String name, int age, String feed) {
		super(name, feed, age);
	}
}
