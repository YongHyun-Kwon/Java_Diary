package javastandard.oop.learninterface;

/**
 * 눈,코,입,이름, 먹는 일은 부모클래스에서 정의된 코드를 사용하고(상속 : 코드의 재사용성) 자신만의 특징을 정의한 클래스<br>
 * 힘이 쎄다. 일반 성인의 힘은 평균 2 힘은 1 ~10까지
 * 
 * @author user
 */
public final class Clark extends Person implements Fly {
	public int power;

	/**
	 * 클락은 눈이 3개
	 */
	public Clark() {
		super(3, 1, 1); // 부모클래스의 오버로딩된 생성자를 불러서 일반인과 다르게 만듬
		power = 8;
	}

	public String power(String stone) {
		String result = " ";

		if (stone.equals("크립토나이트")) { // 힘이 빠지는돌
			result = "~(_-_)~ 힘이 빠진다....";
			power = 1;
		} else if (stone.equals("다이아몬드")) { // 기분이 좋은 돌
			result = "~(^^~)(~^^)~ 감사합니다.";
			power = 10;
		} else { // 기분이 나쁜 돌
			result = "(ㅡㅡ +) 기분나쁨.";
			power = 12;
		} // end else

		return result;
	}

	@Override
	public String eat() {
		return getName() + "이(가) 식당에서 집에서 빵과 오트밀을 먹는다.";
	} // eat

	@Override
	public String eat(String menu, int price) {
		return getName() + "이(가) 레스토랑에서 " + menu + "을 " + price + "원 내고 사먹는다.";
	} // eat

	
	//////////////////나는 기능을 interface로 부터 구현////////////////
	@Override
	public String upwardForce() {
		return getName() + "의 양력은 망토로 부터 얻는다.";
	} // upwardForce

	@Override
	public String drivingForce() {
		return getName() + "의 추진력은 무릎을 꿇어서 얻는다.";
	} // drivingForce

} // class
