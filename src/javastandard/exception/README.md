# Exception

## Exception Handling

- 예외처리
- 프로그램 작성 시 발생할 수 있는 가벼운 Error
- 개발자가 코딩할 때 반드시 예외상황을 예측하고 그에 대한 처리코드를 작성해야 한다.
- throw, throws, try~catch로 발생, 날림, 처리를 수행
- 예외가 발생하는 시점에 따라 Runtime Exception과 Compile Exception으로 구분된다.
- 예외처리 클래스의 가장 윗 부모는 java.lang.Throwable이다.

**Runtime Exception**

- Byte code는 제대로 만들어졌으나 (문법에는 전혀문제가 없음) 메모리를 점유함에 있어 문제가 발생했을 때 발생하는 예외

| 예외처리클래스                  | 발생상황                                                              | 사용 예                                                                         |
| ------------------------------- | --------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| ArithmeticException             | 수를 0으로 나눌때 발생                                                | try { 수 나누는 코드 }catch(ArithmeticException ae){ }                          |
| ArrayIndexOutOfBoundsException  | 배열에 또는 Collection계열에 존재하지 않는 index를 사용 할 때         | try{배열, List방에 값을 넣을 때}catch(ArrayIndexOutOfBoundsException aioobe){ } |
| NullPointerException            | 객체를 생성하지 않고 사용할 때                                        | try{ 객체가 제공하는 method를 호출할 때 }catch(NullPointerException npe){ }     |
| NumberFormatException           | 문자열이 숫자 형식이 아닐 때                                          | try{ 문자열을 숫자로 변환하는 일 }catch(NumberFormatException nfe){ }           |
| ClassCastException              | 객체를 Casting 할 때 객체는 상속관계에 있는 클래스로만 Casting이 가능 | try{ 객체를 casting하는 일 }catch(ClassCastException cce){                      |
| StringIndexOutOfBoundsException | 문자열을 자를 때                                                      | try{ 문자열을 자르는 일 }catch(StringIndexOutOfBoundsException sooe){           |

**Compile Exception**

- byte코드가 제대로 만들어지지 못하는 상황에서 Compile Exception이 발생
- 컴파일러가 Byte code를 제대로 만들어 낼 수 있도록 예외를 보여준다 → 만들지 못하는 상황에 대한 처리

### Try ~ catch

- 발생된 예외, 날라온 예외를 잡아서 처리할 때 사용 예외는 반드시 잡아서 처리해야한다.
- 컴파일예외는 반드시 try~chatch를 해야하지만, Runtime Exception은 코딩시 반드시 try~catch를 하지 않아도 된다.

**문법**

```java
try {
	//예외발생 예상코드들 ...;
} catch(예외클래스 객체명) {
	// 예외가 발생했을 때 사용자에게 제공할 코드
}catch(예외클래스 객체명) {
	// 예외가 발생했을 때 사용자에게 제공할 코드
} finally {
	// 예외가 발생하든, 발생하지 않든 반드시 실행되어야 할 코드;
}
```

### 예외 출력

- System.err.println(); method를 사용하여 예외 메시지를 출력한다.
- 예외 메시지
  1. 간단한 예외 메시지 (Throwable에 존재하는 method)

     1-1. 예외처리객체명.getMessage();

  2. 예외발생 클래스명과 메시지

     2-1. String msg = 예외처리객체명.toString(); // toString() 생략 가능

  3. 자세한 예외 메시지를 출력.

     3-1. 예외처리객체명.printStackTrace(); //출력까지 함께 수행

### Throws

- 예외던짐
- method안에서 발생한 예외를 호출한 곳에서 처리하도록 발생된 예외를 던지는 것.
- method를 정의할 때 가장 뒤에 붙여서 정의한다.
- 호출한 곳에서는 발생되 예외를 try~catch로 잡아서 처리한다.
- 예외발생코드와 예외처리코드를 분리하여 작성할 수 있다. (코드의 복잡도 낮출 수 있다.)
- method 호출 했을때 발생할 문제를 대략적으로 알 수 있다.

문법

- 접근지정자 반환형 method명(매개변수,,)throws 던질예외클래스명,,, {}

동작

```java
public void test() throws ClassNotFoundException {
	Class.forName("java.lang.String");
	System.out.println("로딩성공");
}
public void useTest(){
	try{
		test();
	} catch ( ClassNotFoundException cnfe) {
}
```

### throw( 예외 강제 발생 )

- 특정상황에서 예외를 강제로 발생시켜 업무를 처리할 때 사용.
- 사용자정의 예외클래스와 주로 같이 사용
- throw로 발생된 예외는 try~catch로 바로 처리하든, throws로 던지든 반드시 처리해야한다.

문법

```java
//throw new 예외처리 클래스( 예외발생시 출력할 메시지 );

// 아이디와 비밀번호를 입력받아 id가 "admin이고, 비밀번호가 "1234"라면
// 로그인 성공, 그렇지 않으면 로그인 실패를 예외로 처리

public void login(String id, String password) throws Exception { // 2. throws에 의해 던져지고
	if(!(id.equals("admin") && password.equals("1234")) ) {
// 1. throw로 발생된 예외는
	throw new Exception("로그인 실패, 아이디나 비번을 확인");
	}
	로그인 성공
}

public void useLogin() {
	try{
		login("admin","1234");
	} catch(Exception e) { // 3. 호출한 곳의 catch에서 잡는다.
		e.printStackTrace();
	}
}
```

### 사용자정의 예외처리 클래스 만들기

- java에서 제공하는 예외처리클래스가 구현하는 업무와 맞는 클래스가 없다면 구현하는 업무의 용어로 예외처리 클래스를 작성하는 것.
- 가독성 향상

작성법

```java
// 1. Exception class를 상속

// 컴파일 예외.
public class Test extends Exception {}
// 런타임 예외
public class Test extends RuntimeException{}
```
