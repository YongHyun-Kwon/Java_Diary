package javastandard.oop.learninterface;

/**
 * ����� ���� Ư¡(��,��,��, �̸�, �Դ���)�� Person Ŭ�������� ������ ����ϰ�, �ڽ��� Ư¡�� �����ϴ� �ڽ�Ŭ���� <br>
 * ȫ�浿�� �ο��� ���ϴ� Ư¡�� ������ �ִ�.<br>
 * �ο� ������ 1~10���� ����
 * 
 * @author user
 */
public class HongGilDong extends Person {
	private int myLevel;

	public HongGilDong() {
		super();
		myLevel = 5;
	}// HongGilDong

	public String fight(int yourLevel) {
		String resultMsg = "";

		if (myLevel < yourLevel) { // ���� ���
			resultMsg = "Orz �ο򿡼� ����.";
			myLevel--;
			if (myLevel < 1) {
				myLevel = 1;
			} // end if
		} else if (myLevel > yourLevel) { // �̱�� ���
			resultMsg = "s('. ^)V �ο򿡼� �̰���.";
			myLevel++;
			if (myLevel > 10) {
				myLevel = 10;
			} // end if
		} else { // ���� ���
			resultMsg = "(�Ѥ� +) �ο򿡼� �����.";
		} // end else
		return resultMsg;
	} // fight
	
	@Override
	public String eat() {
		return getName() + "�� ������ ���� �Դ´�.";
	} // ear

	@Override
	public String eat(String menu, int price) {
		// name�� �θ�Ŭ�������� private ���������ڷ� �Ǿ������Ƿ� �ܺο��� ���� ������ �� �� ����.
//		return name + "��(��) �Ĵ翡�� " + menu + "�� ������ " + price + "�� ���� ��Դ´�.";
		return getName() + "��(��) �ָ����� " + menu + "�� ������ " + price + "�� ���� ��Դ´�.";
	} // eat

}// class
