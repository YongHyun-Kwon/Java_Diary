## Enum

- 서로 관련된 상수를 편리하게 선언하기 위한 것 여러 상수를 정의할 때 사용하면 유용하다.
- 값 뿐이아니라 타입도 관리하기에 논리적인 오류를 줄일 수 있다.
- 상수의 값이 바뀌면 모든 소스를 다시 컴파일 해야하나 Enum상수를 사용하면 다시 컴파일 하지 않아도 된다.

### 사용법

1. enum 열거형명 { 상수명1, 상수명2, ....}

## Enum형에 멤버 추가하기

- Enum Class에 정의된 ordinal()이 열거형 상수가 정의된 순서를 반환하지만 이 값은 사용하지 않는 것이 좋다.
- 열거형의 instance variable은 반드시 final이어야 하는 제약은 없다.
- 열거형의 생성자를 만들 순 있지만 객체생성은 할 수 없다. 묵시적 제어자가 private이기 때문이다.
- 추상 method도 추가할 수 있다.

### 예시 코드

```java
enum Direction {
	// 값이 불연속적인 경우에는 상수의 이름 옆에 원하는 값을 ()에 적는다
	EAST(1), SOUTH(5), WEST(-1), NORTH(10); // 끝에 ; 추가 할 것
	private final int value; // 정수를 저장할 Instanec Variable 추가
	public int getValue() { return value; } // 생성자 추가
}
```

- 하나의 열거형 상수에 여러 값을 지정할 수 있지만 그에 맞는 Instace Variable과 생성자 등을 새로 추가해야 한다.

### 예시 코드

```java
enum Direction {
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");
	private final int value; // 정수를 저장할 Instanec Variable 추가
	private final String symbol; // 문자열을 저장할 Instance Variable 추가
	Direction(int value, String symbol) { // 접근제어자 private가 생략
		this.value = value;
		this.symbol = symbol;
	}
	public int getValue() { return value; }
	public String getSymbol() { return symbol; }
}
```
