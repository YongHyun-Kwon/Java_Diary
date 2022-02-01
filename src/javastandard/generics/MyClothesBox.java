package javastandard.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Clothes {
	String kind;
	int quantity;

	public Clothes(String kind, int quantity) {
		this.kind = kind;
		this.quantity = quantity;
	} // Clothes

	@Override
	public String toString() {
		return kind + "(" + quantity + ")";
	} // toString

} // class Clothes

class Coat extends Clothes {

	public Coat(String kind, int quantity) {
		super(kind, quantity);
	} // Coat
} // class Coat

class Shirt extends Clothes {
	public Shirt(String kind, int quantity) {
		super(kind, quantity);
	} // Shirt
} // class Shirt

class CoatComp implements Comparator<Coat> {
	@Override
	public int compare(Coat o1, Coat o2) {
		return o2.quantity - o1.quantity;
	} // compare
} // class CoatComp

class ShirtComp implements Comparator<Shirt> {

	@Override
	public int compare(Shirt o1, Shirt o2) {
		return o2.quantity - o1.quantity;
	} // compare

} // class ShirtComp

class ClothesComp implements Comparator<Clothes> {

	@Override
	public int compare(Clothes o1, Clothes o2) {
		return o1.quantity - o2.quantity;
	} // compare

} // class ClothesComp

/**
 * Collections.sort() �� �̿��� �� Box�� ��� ���� ������ ����
 * 
 * �� Comp�� ù��° Parameter�� ������ ��� �ι�° Parameter�� ������ ����� ���� �� Comparator�̴�.
 * 
 * Collections.sort()�� static <T> void sort(List<T> list, Comparator<? super T> c)
 * Wild Card�� �̷�����ֱ⿡ Parameter�� ��ü�� �� ������ �����ϴ�.
 * @author 82109
 */
public class MyClothesBox {

	public MyClothesBox() {

		ClothesBox<Coat> coatBox = new ClothesBox<Coat>();
		ClothesBox<Shirt> shirtBox = new ClothesBox<Shirt>();

		coatBox.add(new Coat("Long Coat", 500));
		coatBox.add(new Coat("Long Coat", 150));
		coatBox.add(new Coat("Long Coat", 200));
		
		shirtBox.add(new Shirt("White Shirt", 600));
		shirtBox.add(new Shirt("White Shirt", 400));
		shirtBox.add(new Shirt("White Shirt", 200));

		Collections.sort(coatBox.getList(), new CoatComp());
		Collections.sort(shirtBox.getList(), new ShirtComp());
		
		System.out.println(coatBox);
		System.out.println(shirtBox);
		
		System.out.println();
		
		Collections.sort(coatBox.getList(), new ClothesComp());
		Collections.sort(shirtBox.getList(), new ClothesComp());
		System.out.println(coatBox);
		System.out.println(shirtBox);
		
		
	} // MyClothesBox

	public static void main(String[] args) {

		new MyClothesBox();

	} // main

	class ClothesBox<T extends Clothes> extends Box<T> {
	} // class ClothesBox

	class Box<T> {
		ArrayList<T> list = new ArrayList<T>();

		void add(T item) {
			list.add(item);
		} // add

		T get(int i) {
			return list.get(i);
		} // get

		ArrayList<T> getList() {
			return list;
		} // getList

		int size() {
			return list.size();
		} // size

		@Override
		public String toString() {
			return list.toString();
		} // toString
	} // class Box

} // class
