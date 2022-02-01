package javastandard.generics;

import java.util.ArrayList;

class Fruit implements EatTable {

	@Override
	public String toString() {
		return "Fruit";
	} // toString
} // Fruit

class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	} // toString
} // Apple

class Lemon extends Fruit {
	@Override
	public String toString() {
		return "Lemon";
	} // toString
} // Lemon

class Chiken {
	@Override
	public String toString() {
		return "Chiken";
	}
}

interface EatTable {
} // EatTable

public class UseGenerics {

	public UseGenerics() {

		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
//		Box<Lemon> lemonBox = new Box<Apple>(); // Type Error
		Box<Chiken> chikenBox = new Box<Chiken>();

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // Fruit�� ��ӹ޾ұ⿡ �����ϴ�.
		fruitBox.add(new Lemon());

		appleBox.add(new Apple());
//		appleBox.add(new Lemon()); // Error : Box<Apple> ������ Apple �� ���� �� �ִ�.

		chikenBox.add(new Chiken());
//		chikenBox.add(new Lemon()); // Error : Box<Chiken>���� Chiken���� Type�� ���� �� ����.

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(chikenBox);

	} // UseGenerics

	public void LimitGenric() {

		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Lemon> lemonBox = new FruitBox<Lemon>();
//		FruitBox<Chiken> chikenBox = new FruitBox<Chiken>(); // Error : Fruit Box���� Fruit�̳� �ڼյ鸸 type ������ �����ϴ�.

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Lemon());

		appleBox.add(new Apple());
//		appleBox.add(new Lemon()); // Error : appleBox������ Apple type�� �����ϴ�. �� Lemon�� Apple�� �ڼ��� �ƴϴ�.

		lemonBox.add(new Lemon());

		System.out.println("fruitBox : " + fruitBox);
		System.out.println("appleBox : " + appleBox);
		System.out.println("lemonBox : " + lemonBox);

	} // LimitGenric

	public static void main(String[] args) {

		new UseGenerics().LimitGenric();

	} // main

	class FruitBox<T extends Fruit & EatTable> extends Box<T> {
	}

	class Box<T> {
		ArrayList<T> list = new ArrayList<T>();

		void add(T item) {
			list.add(item);
		} // add

		T get(int i) {
			return list.get(i);
		} // get

		int size() {
			return list.size();
		} // size

		@Override
		public String toString() {
			return list.toString();
		} // toString

	} // Box

} // class
