package javastandard.oop.learnclass;

public class UseMaker {

	public static void main(String[] args) {

		// 4. ��ī�� Ŭ������ ����Ͽ� ������ ��ī�� ����.
		Maker black = new Maker(); // ���� �� ������ ���� ����
		System.out.println(black);
		// black��ü�� �Ѱ� 1��, ��ü 1��, �������� �����غ���
		// black.cap = 1; // instance ������ private ���������ڰ� ����Ǿ� �־� �ܺο��� ����� ������ �� ����.

		// ���� �ڵ� ó�� instance������ ���� �ʱ�ȭ �������� ������ �ڵ� �ʱ�ȭ�� ������ �����Ǳ� ������ ����� �����.
//		black.setCap(1);
//		black.setBody(1);
//		black.setColor("����");
		
		// �����ڸ� �߰��� �� ���� �ʱ�ȭ ���� �ʰ� ��ü
		
		System.out.println(black.getColor() + "���� ��ī���� �Ѳ� :" + black.getCap() + "��, ��ü :"
				+ black.getBody()+ "��");
		
		// 5. ��ī�� Ŭ������ �����ϴ� ��� ���
		System.out.println(black.write());
		
		// ������ ��ī���� �����Ͽ� ���� �ְ� ���
		Maker red = new Maker();
		red.setCap(2);
		red.setBody(2);
		red.setColor("����");
		System.out.println(red.getColor() + "���� ��ī���� �Ѳ� :" + red.getCap() + "��, ��ü :"
				+ red.getBody()+ "��");
		System.out.println(red.write("�ȳ�"));

	} // main

} // class
