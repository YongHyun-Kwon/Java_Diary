package javastandard.oop.learninterface;

/**
 * Interface<br>
 * �߻�Ŭ������ ����� ����� ������ �ش����� ����̴�.<br>
 * 
 * abstract method�� ����θ� �̷�����ִ�.(�� logic�� �ۼ��� �� ����.)<br>
 * 
 * ���� ����� �����ϴ�.<br>
 * 
 * interface�� ��ӹ޴� class�� �ݵ�� interface�� �ִ� method�� �����ؾ�������<br>
 * abstract class�� ��ӹ޴� class�� abstract method�� �����ϰ� �Ϲ�method�� ������� �ʾƵ� ������
 * ����.<br>
 * 
 * �������� ���� ������ �����ϸ� interface�� �� ��Ȯ�ϰ� �� �� �ִ�.<br>
 * 
 * interface : ����<br>
 * method : �Դ´�. �ȴ´�. �ܴ�. (��) <br>
 * implements(����ü) : �����, ������, ��<br>
 * 
 * interface �������̽��� [extends ��ӹ��� �������̽���,,,,]
 * 
 * @author 82109
 *
 */
interface animals {
	public void eat(String feed);

	public void work(String move);

	public void sleep(String dreamland);

	public void animalCrying(String cry);

}

class Cat implements animals {

	@Override
	public void eat(String feed) {
		System.out.println("����̴� " + feed + "�� �Դ´�.");
	}

	@Override
	public void work(String move) {
		System.out.println("����̴� " + move + "�ȴ´�.");
	}

	@Override
	public void sleep(String dreamland) {
		System.out.println("����̴� " + dreamland + "�ܴ�.");
	}

	@Override
	public void animalCrying(String cry) {
		System.out.println("����̴� " + cry);
	}
}

class Dog implements animals {

	@Override
	public void eat(String feed) {
		System.out.println("�������� " + feed + "�� �Դ´�.");
	}

	@Override
	public void work(String move) {
		System.out.println("�������� " + move + "�ȴ´�.");
	}

	@Override
	public void sleep(String dreamland) {
		System.out.println("�������� " + dreamland + "�ܴ�.");
	}

	@Override
	public void animalCrying(String cry) {
		System.out.println("�������� " + cry);
	}
}

class Tiger implements animals {

	@Override
	public void eat(String feed) {
		System.out.println("ȣ���̴� " + feed + "�� �Դ´�.");
	}

	@Override
	public void work(String move) {
		System.out.println("ȣ���̴� " + move + "�ȴ´�.");
	}

	@Override
	public void sleep(String dreamland) {
		System.out.println("ȣ���̴� " + dreamland + "�ܴ�.");
	}

	@Override
	public void animalCrying(String cry) {
		System.out.println("������ " + cry);
	}
}

public class InterfaceTest{
	public static void main(String[] args) {
		
		/*
		 * interface�� ���������� ������ �԰� ��� �Ȱ� �ڰ� ����� �����ϵ��� �Ǿ��ִ�.
		 * �׷��⿡ class�� animals��� interface�� ��ӹ��� �� eat, work, move, animalCrying
		 * �� Override �Ͽ� �����Ͽ��� �Ѵ�. �� class(Cat)�� ���� �ڴ¹� ��¹��� �޶�������
		 * �ٸ� class Dog, Tiger���� �ƹ��� ������ ����.
		 */
		
		Cat mimi = new Cat();
		Dog coco = new Dog();
		Tiger Tiger = new Tiger();
		
		mimi.eat("����");
		coco.eat("���");
		Tiger.eat("���");
		
		mimi.work("�׹߷�");
		coco.work("�ι� �Ǵ� �׹߷�");
		Tiger.work("�ι� �Ǵ� �׹߷�");
		
		mimi.animalCrying("�߿�");
		coco.animalCrying("�п�");
		Tiger.animalCrying("����");
		
		mimi.sleep("�������");
		coco.sleep("������");
		Tiger.sleep("�̺��� ����");
		
	}
	
}
