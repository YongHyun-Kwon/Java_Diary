## Lambda식

- functional interace를 쉽게 사용하기 위해 제공하는 문법
  - functional interface : 추상 method를 하나만 가지고 있는 인터페이스
- 구현 클래스를 만들지 않고 인터페이스를 사용할 수 있다
- 람다식의 코드는 인터페이스에 할당할 수 있다.

문법

```java
// () -> { }; 추상 method
// 인터페이스명 객체명 = (값,,)->{코드};

// @Functionalinterface를 인터페이스위에 정의하면
// 인터페이스는 추상 method를 하나만 정의할 수 있다.

Test t = () -> { System.out.println("hello"); };
t.test(); // 인터페이스의 추상 method를 호출하면 람다식으로 구현된 코드가 실행

```
