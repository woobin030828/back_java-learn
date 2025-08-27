package marker;

public class Rabbit extends Animal implements HerviboreMarker {
	public Rabbit() {;}
	public Rabbit(String name, int age, String feed) {
		super(name, feed, age);
	}
}
