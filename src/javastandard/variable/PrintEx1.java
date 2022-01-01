package javastandard.variable;

public class PrintEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 1;
		short s = 2;
		char c = 'A';

		int finger = 10;
		long big = 100_000_000_000L; // long big = 100000000L Java 1.7 ���� _�� ���� ���� ����
		long hex = 0xFFFF_FFFF_FFFFL; // 0x�� ���۽� 16���� x�� ��,�ҹ��� ���о��� ��� ����

		int octNum = 010; // �տ� 0���� ���۽� 8����
		int hexNum = 0x10;
		int binNum = 0b10; // b�� 2�� ���ͷ� Java 1.7���� �߰��Ǿ���.

		// printf�� c�� printf�� ���� ���� ���� �����ڸ� ����ϰ�, Ư�����ڴ� ���� ���ͷ� ��� �ʿ�

		System.out.printf("b = %d\n", b);
		System.out.printf("s = %d\n", s);
		System.out.printf("c = %c, %d\n", c, (int)c);
		System.out.printf("finger = [%5d]\n", finger);
		System.out.printf("finger = [%-5d]\n", finger);
		System.out.printf("finger = [%05d]\n", finger);
		System.out.printf("big = %d\n", big);
		System.out.printf("hex = %#x\n", hex); //#�� ���λ� 16����0x 8����0
		System.out.printf("octNum = %o, %d\n", octNum, octNum); 
		System.out.printf("hexNum = %x, %d\n", hexNum, hexNum); 
		// 10������ 2������ ����ϴ� �����ڰ� ���� ������ toBinaryString ��� ���� %s ���ڿ��� ǥ������
		System.out.printf("binNum = %s, %d\n", Integer.toBinaryString(binNum), binNum); 
		
		

	}

}
