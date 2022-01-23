package javastandard.oop.learninterface;

/**
 * Person Ŭ������ ��üȭ�Ͽ� ����� �������� ����� Ŭ����.
 * 
 * @author user
 */
public class UsePerson {

	/**
	 * Java Application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		HongGilDong hgd = new HongGilDong();
		// �ڵ��� ���뼺 : �θ�Ŭ������ �ڿ��� �ڽ�Ŭ������ �����ϴ� ��ó�� ����Ѵ�.
		hgd.setName("ȫ�浿");
		System.out.printf("%s �� �� %d��, �� %d��, �� %d��\n", hgd.getName(), hgd.getEye(), hgd.getNose(), hgd.getMouth());
		System.out.println(hgd.eat());
		System.out.println(hgd.eat("�߲��� ����", 1));
		// �ڽŸ��� Ư¡�� ������ method ȣ��.
		System.out.println(hgd.fight(4)); // 5 -> 6
		System.out.println(hgd.fight(5)); // 6 -> 7
		System.out.println(hgd.fight(7)); // 7 -> 7
		System.out.println(hgd.fight(10)); // 7 -> 6
		System.out.println(hgd.fight(6)); // 6 -> 6

		System.out.println("=============================================");

		Clark superman = new Clark();
		// �ڵ��� ���뼺.
		superman.setName("Ŭ�� ��Ʈ");
		System.out.printf("%s �� �� %d��, �� %d��, �� %d��\n", superman.getName(), superman.getEye(), superman.getNose(),
				superman.getMouth());
		System.out.println(superman.eat());
		System.out.println(superman.eat("������ũ", 10));

		// �ڽŸ��� Ư¡�� ����
		String stone = "¯��";
		System.out.println(superman.power(stone));
		stone = "���̾Ƹ��";
		System.out.println(superman.power(stone));
		stone = "ũ���䳪��Ʈ";
		System.out.println(superman.power(stone));

		// �������� �۾�
		System.out.println(superman.drivingForce());
		System.out.println(superman.upwardForce());
		
	} // main

} // class
