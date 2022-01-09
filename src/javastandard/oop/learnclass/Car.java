package javastandard.oop.learnclass;

/**
 * 차를 추상화하여 만든 클래스<br>
 * 차의 색상과 변속기, 문의 갯수만 객체화 한다.
 *
 */
public class Car {

	String color; // 색상
	String gearType; // 변속기 종류
	int door; // 문의 개수

	/**
	 * 차의 instance(member) variable에 아무런 값이 없으면 아래의 값으로 설정한다.
	 */
	Car() {
		this("white", "auto", 4);
	}
	
	/**
	 * 차의 instance(member) variable에 색상값만 들어오면 색상값은 매개변수의 값으로 설정한다.
	 * @param color 지정한 차의 색상
	 */
	Car(String color){
		this(color, "auto", 4);
	}

	/**
	 * 차의 instance(member) variable에 색상, 기어타입, 문의 갯수가 들어오면 매개변수의 값으로 설정한다.
	 * @param color
	 * @param gearType
	 * @param door
	 */
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	public static void main(String[] args) {
		
		Car c1 = new Car(); // 인스턴스 변수에 값을 넘기지 않았기에 Car()이 실행된다.
		System.out.println("c1의 색상 : " + c1.color + ", c1의 gearType : " + c1.gearType + ", c1의 문의 개수 : " + c1.door);

		Car c2 = new Car("gray"); // 객체를 생성하고 색상의 값만 설정했으므로 Car(String color)이 실행된다.
		System.out.println("c2의 색상 : " + c2.color + ", c2의 gearType : " + c2.gearType + ", c2의 문의 개수 : " + c2.door);
	
//		Car c3 = new Car("black", "manual", 2); 
		// 위의 코드 처럼 생성 후 바로 인자 값을 주는 방법도 있다.
		Car c3 = new Car();
		c3.color = "black";
		c3.gearType = "manual";
		c3.door = 2;
		System.out.println("c3의 색상 : " + c3.color + ", c3의 gearType : " + c3.gearType + ", c3의 문의 개수 : " + c3.door);
			
	}

}
