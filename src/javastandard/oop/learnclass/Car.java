package javastandard.oop.learnclass;

/**
 * ���� �߻�ȭ�Ͽ� ���� Ŭ����<br>
 * ���� ����� ���ӱ�, ���� ������ ��üȭ �Ѵ�.
 *
 */
public class Car {

	static int count = 0; // ������ �ν��Ͻ� ���� ������ �����ϱ� ���� ����
	String color; // ����
	String gearType; // ���ӱ� ����
	int door; // ���� ����
	int lotNo; // �ν��Ͻ� ������ ��ȣ

	
	{
		++count;  // Car�� instance�� ������ ������ count�� ��ȣ�� �������� lot ��ȣ�� �����Ѵ�.
		lotNo = count;

	}

	/**
	 * ���� instance(member) variable�� �ƹ��� ���� ������ �Ʒ��� ������ �����Ѵ�.
	 */
	Car() {
		this("white", "auto", 4);
	}

	/**
	 * ���� instance(member) variable�� ���󰪸� ������ ������ �Ű������� ������ �����Ѵ�.
	 * 
	 * @param color ������ ���� ����
	 */
	Car(String color) {
		this(color, "auto", 4);
	}

	/**
	 * ���� instance(member) variable�� ����, ���Ÿ��, ���� ������ ������ �Ű������� ������ �����Ѵ�.
	 * 
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

		Car c1 = new Car(); // �ν��Ͻ� ������ ���� �ѱ��� �ʾұ⿡ Car()�� ����ȴ�.
		System.out.println("c1�� ���� : " + c1.color + ", c1�� gearType : " + c1.gearType + ", c1�� ���� ���� : " + c1.door
				+ ", c1�� lotNum : " + c1.lotNo);

		Car c2 = new Car("gray"); // ��ü�� �����ϰ� ������ ���� ���������Ƿ� Car(String color)�� ����ȴ�.
		System.out.println("c2�� ���� : " + c2.color + ", c2�� gearType : " + c2.gearType + ", c2�� ���� ���� : " + c2.door
				+ ", c2�� lotNum : " + c2.lotNo);

//		Car c3 = new Car("black", "manual", 2); 
		// ���� �ڵ� ó�� ���� �� �ٷ� ���� ���� �ִ� ����� �ִ�.
		Car c3 = new Car();
		c3.color = "black";
		c3.gearType = "manual";
		c3.door = 2;
		System.out.println("c3�� ���� : " + c3.color + ", c3�� gearType : " + c3.gearType + ", c3�� ���� ���� : " + c3.door
				+ ", c3�� lotNum : " + c3.lotNo);

	}

}