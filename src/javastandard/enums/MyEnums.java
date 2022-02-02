package javastandard.enums;

abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
	static int id = 0;
	int ordinal;
	String name = "";

	public int ordinal() {
		return ordinal;
	} // ordinal

	MyEnum(String name) {
		this.name = name;
		ordinal = id++;
	} // MyEnum

	public int compareTo(T t) {
		return ordinal - t.ordinal();
	} // compareTo
} // class MyEnum

@SuppressWarnings("rawtypes")
abstract class Transportation extends MyEnum {

	static final Transportation BUS = new Transportation("BUS", 100) { // 익명 클래스
		int fare(int distance) {
			return distance * BASIC_FARE;
		} // fare
	};
	static final Transportation TRAIN = new Transportation("TRAIN", 150) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		} // fare
	};
	static final Transportation SHIP = new Transportation("SHIP", 100) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		} // fare
	};
	static final Transportation AIRPLANE = new Transportation("AIRPLANE", 00) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		} // fare
	};

	abstract int fare(int distance); // abstract method

	protected final int BASIC_FARE;

	Transportation(String name, int basicFare) {
		super(name);
		BASIC_FARE = basicFare;
	} // Transportation

	public String name() {
		return name;
	} // name

	@Override
	public String toString() {
		return name;
	} // toString

}

public class MyEnums {

	@SuppressWarnings("unchecked")
	public MyEnums() {
		
		Transportation t1 = Transportation.BUS;
		Transportation t2 = Transportation.BUS;
		Transportation t3 = Transportation.TRAIN;
		Transportation t4 = Transportation.SHIP;
		Transportation t5 = Transportation.AIRPLANE;
		
		System.out.printf("t1=%s, %d\n", t1.name(), t1.ordinal());
		System.out.printf("t2=%s, %d\n", t2.name(), t2.ordinal());
		System.out.printf("t3=%s, %d\n", t3.name(), t3.ordinal());
		System.out.printf("t4=%s, %d\n", t4.name(), t4.ordinal());
		System.out.printf("t5=%s, %d\n", t5.name(), t5.ordinal());
		System.out.println("t1 == t2 ? " + (t1==t2));
		System.out.println("t1.compareTo(t3) = " + t1.compareTo(t3));
		
	} // MyEnums

	public static void main(String[] args) {

		new MyEnums();

	} // main

} // class
