package javastandard.oop.learnclass;

/**
 * 학생의 정보를 저장할 수 있는 데이터 형
 * 학생의 정보는 학번, 이름, 나이, 혈액형, 키 가 저장됨
 * @author user
 */
public class Student {
	
	private int num;
	private String name;
	private int age;
	private String bloodType;
	private double height;
	
	public Student() {
	} // Student



	public Student(int num, String name, int age, String bloodType, double height) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
		this.height = height;
	}

	

	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getBloodType() {
		return bloodType;
	}



	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}


}
