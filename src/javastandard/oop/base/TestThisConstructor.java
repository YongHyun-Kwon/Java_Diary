package javastandard.oop.base;

/**
 * this()�� ����� ������ ȣ��
 * @author user
 */
public class TestThisConstructor {
	
	public TestThisConstructor() {
		this(1); 
		System.out.println("default ������");
	} //TestThisConstructor
	public TestThisConstructor(int i) {
//		this();
		System.out.println("Overload�� ������");
		// this()//�������� ù��° �ٿ����� ����� �� �ִ�.
	} // TestThisConstructor
	

	public static void main(String[] args) {
		
//		new TestThisConstructor();
		new TestThisConstructor(13);

	} // main

} //class
