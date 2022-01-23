package javastandard.oop.learninterface;

/**
 * ��,��,��,�̸�, �Դ� ���� �θ�Ŭ�������� ���ǵ� �ڵ带 ����ϰ�(��� : �ڵ��� ���뼺) �ڽŸ��� Ư¡�� ������ Ŭ����<br>
 * ���� ���. �Ϲ� ������ ���� ��� 2 ���� 1 ~10����
 * 
 * @author user
 */
public final class Clark extends Person implements Fly {
	public int power;

	/**
	 * Ŭ���� ���� 3��
	 */
	public Clark() {
		super(3, 1, 1); // �θ�Ŭ������ �����ε��� �����ڸ� �ҷ��� �Ϲ��ΰ� �ٸ��� ����
		power = 8;
	}

	public String power(String stone) {
		String result = " ";

		if (stone.equals("ũ���䳪��Ʈ")) { // ���� �����µ�
			result = "~(_-_)~ ���� ������....";
			power = 1;
		} else if (stone.equals("���̾Ƹ��")) { // ����� ���� ��
			result = "~(^^~)(~^^)~ �����մϴ�.";
			power = 10;
		} else { // ����� ���� ��
			result = "(�Ѥ� +) ��г���.";
			power = 12;
		} // end else

		return result;
	}

	@Override
	public String eat() {
		return getName() + "��(��) �Ĵ翡�� ������ ���� ��Ʈ���� �Դ´�.";
	} // eat

	@Override
	public String eat(String menu, int price) {
		return getName() + "��(��) ����������� " + menu + "�� " + price + "�� ���� ��Դ´�.";
	} // eat

	
	//////////////////���� ����� interface�� ���� ����////////////////
	@Override
	public String upwardForce() {
		return getName() + "�� ����� ����� ���� ��´�.";
	} // upwardForce

	@Override
	public String drivingForce() {
		return getName() + "�� �������� ������ �ݾ ��´�.";
	} // drivingForce

} // class
