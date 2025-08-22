# 안녕하세요! JAVA 공부 프로젝트입니다!
자바를 공부하는 목적의 git 프로젝트입니다.

# 이건 제가 이해하기 쉬우려고 정리한 과정인데요...

클래스와 객체가 만들어지는 과정

클래스
있을 것 같은 값들을 공통 요소로 묶어 요소들을 모아놓는 과정(추상화) 후 나오는 결과물

객체
추상화되어진 결과물(클래스)에 구체적으로 값들을 집어넣는 과정(객체화) 후 나오는 결과


원래 자바스크립트를 공부했었기 때문에 제가 이해한 대로 자바스크립트로 따지면 이런 느낌이지 않을까 싶어 한번 정리해보았습니다.
(ex - javaScript)

추상화(클래스)
```javascript
function Ex1 (name = "", age = 0) {
    this.name = name;
    this.age = age;
}
```

객체화(객체)
```javascript
const user1 = new Ex1("최우빈", 23);

console.log(user1);
```

결과
```c
Ex1 { name: '최우빈', age: 23 }
```

자바 코드로 넘어온다면 이렇게 이해할 수 있을 것 같아요.
```java
package classTest;
// 추상되어진 결과물 = 클래스
// 현재 추상화가 되었다.
public class ClassTest {
	
	String name = "";
	int age = 0;
	
// 기본 생성자
  public ClassTest () {;}
// 초기화 생성자
	public ClassTest (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
//		객체화
		ClassTest ct = new ClassTest("최우빈", 23); // new는 heap에 올려달라는 주소만 알려주는 역할
//		ct - 객체
		
	}
}
```

ClassTest ct = new ClassTest(); 는 통째로 **객체화** 이구요!
ClassTest() 자체는 **생성자**라고 정리할 수 있겠네요.
그렇다면 new ClassTest() 는 전체가 **주소값**입니다.