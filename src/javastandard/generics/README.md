# Grenerics

## Generic

- 다양한 타입의 객체들을 다루는 method나 컬렌션 클래스에 컴파일시의 타입 체크를 해주는 기능
- 객체의 타입을 컴파일 시 체크하기 타입안정성을 높이고 형변환의 번거로움이 줄어든다.
- Generics의 장점
  - 타입 안정성을 제공한다.
  - 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.

## Generic Class의 선언

- Generic Type은 Class와 method에 선언 가능하다.
  아래와 같이 Class Box가 정의 되어있을 때를 가정한다.

### 예시 코드

```java
Class Box {
	Object item;

	void setItem(Object item) { this.item = item; }
		Object getItem() { return item }
}
// 위의 Box Class를 Generic Class로 변경
Class Box<T> { // Genric type 선언
	T item;
	void setItem(T item) { this.item = item; }
	T getItem() { return item; } // Generic Instance Method
}

/*
* Generic 용어
* Box<T> : Genric Class 'T의 Box' 또는 'T Box'라고 읽는다.
* T : Type Variable 또는 Parameter(T는 Type 문자)
* Box : 원시 타입(raw type)
```

- 예시 코드의 Box<T>에서 T를 Type Variable이라고 부르며 “Type”의 첫 글자에서 따온 것이다.
- T가 아닌 다른 것을 사용해도 가능하다.
- **기호의 종류만 다를 뿐 ‘임의의 참조형 타입’을 의미한다는 것은 모두 같다.**
- 기존에는 다양한 종류의 Type을 다루는 method의 Parameter나 return type으로 Object타입의 참조 변수를 많이 사용하였고 그로인해 형변환이 불가피했지만 이젠 Object타입이 아닌 원하는 Type을 지정할 수 있게 된 것이다.
- 모든 객체에 동일하게 동작해야하는 static member에 타입 변수를 사용할 수 없다.( T는 Instace Variable로 간주되기 때문)

## Generic 제한자

- Generic 제한자는 Actual Type Parameter을 모든 타입이 아니라 한정된 타입만 사용할 수 있도록 Formal Type Parameter을 제한하는 것이다.
- Generic Type에 ‘extends’를 사용하면 자기 자신과 자신을 상속하는 Actual Type만 가능하다.
- Generic Type에 ‘super’을 사용하면 자기 자신과 부모의 Actual Type만 가능하다.
- 만약 Class가 아닌 Interface를 구현해야한다면 implements를 사용해야한다.

### 예시 코드

```java
class FruitBox<T extends Fruit> { // Fruit의 자손만 Type으로 지정가능
	ArrayList<T> list = new ArrayList<T>();
	// ...
}
// 여전히 한 종류의 Type만 담을 수 있지만, Fruit클래스의 자손들만 담을 수 있다.
// 만약 T에 Object를 대입하면 모든 종류의 객체를 저장할 수 있게 된다.

// Fruit의 자손이면서 Eatable Interface도 구현해야할때 '&'기호를 사용

class FruitBox<T extends Fruit & Eatable { ... }
```

## Wild Card

- Parameter에 FruitBox를 대입하면 Jice를 만들어 반환하는 Juicer이라는 Class가 있고 반환하는 makeJuice라는 static method 가 있을 때 Juicer Class는 Genric Class도 아니고 static method에선 타입 매개변수 T를 매개변수에 사용 불가하기 때문에 타입 매개변수가 아닌 특정 타입을 지정해줘야 한다.

### 예시 코드

```java
class Juicer {
	static Juice makeJuice(FruitBox<Fruit> box) { // <Fruit>으로 지정
		String tmp = "";
		for(Fruit val : box.getList()) tmp += f + " ";
		return new Juice(tmp);

	static Juice makeJuice(FruitBox<Apple> box) { // <Fruit>으로 지정
			String tmp = "";
			for(Fruit val : box.getList()) tmp += f + " ";
			return new Juice(tmp);
}

// 이렇게 Generic Type을 FruitBox<Fruit>으로 고정해놓으면 FruitBox<Apple>은 사용 불가
// 따라서 여러 타입의 Parameter을 받는 makeJuice를 만들어야 한다.
// 하지만 위 코드처럼 Overloading 하면 컴파일 에러가 발생한다.
// 위 코드는 Method의 중복 정의이다.
```

- **Generic Type이 다른 것만으로는 Overloading이 성립하지 않는다.**
- 이럴 때 사용하는 것이 Wild Card이다.
- **사용법**
  | <? extends T> | Wild card의 상한 제한. T와 그 자손들만 가능 |
  | ------------- | ----------------------------------------------------- |
  | <? super T> | Wild card의 하한 제한. T와 그 조상들만 가능 |
  | <?> | 제한 없음 모든 타입이 가능 <? extends Object>와 같다. |
