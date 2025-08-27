package marker;

public class MarkerTest {
//	오버로딩
	public void checkKind(Animal animal) {
		String group = "";
		group = animal instanceof HerviboreMarker ? "초식" : animal instanceof CarnivoreMarker ? "육식" : "잡식";
		System.out.printf("%s은(는) %s 동물이며, 먹이는 %s입니다. \n", animal.getName(), group, animal.getFeed());
		}
//	원본
	public void checkKinds(Animal[] animals) {
		for (Animal animal: animals) {
			checkKind(animal);
		}
	}
//	사용
	public static void main(String[] args) {
		Animal[] animals = {new Bear("곰", 3, "고기"), new Cat("고양이", 2, "생선"), new Cow("소", 2, "풀")
				, new Dog("멍멍이", 2, "고기"), new Rabbit("토끼", 2, "당근"), new Tiger("호랑이", 2, "고기")};
		MarkerTest mt = new MarkerTest();
		mt.checkKinds(animals);
	}
}
