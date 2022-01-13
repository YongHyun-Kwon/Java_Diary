package javastandard.oop.learnclass;

/**
 * int, String, int, String,double�� ������ ����� �����ڷ����� ���
 * 
 * @author user
 */
public class UseStudentData {

	public static void main(String[] args) {
		
		Student kyh = new Student(1,"�ǿ���",25,"AB",180.1);
		Student kjb = new Student(2,"���ֺ�",25,"AB",176.8);
		
		System.out.printf("%s �л��� %d���̰� %d�� �������� %s�� �Դϴ�.\n",
				kyh.getName(), kyh.getNum(), kyh.getAge(), kyh.getBloodType());
		System.out.printf("%s �л��� %d���̰� %d�� �������� %s�� �Դϴ�.\n",
				kjb.getName(), kjb.getNum(), kjb.getAge(), kjb.getBloodType());
		
		// 1���� ���� ��
		kyh.setAge(kyh.getAge()+1);
		kjb.setAge(kjb.getAge()+1);
		
		System.out.printf("%s �л��� %d���̰� %d�� �������� %s�� �Դϴ�.\n",
				kyh.getName(), kyh.getNum(), kyh.getAge(), kyh.getBloodType());
		System.out.printf("%s �л��� %d���̰� %d�� �������� %s�� �Դϴ�.\n",
				kjb.getName(), kjb.getNum(), kjb.getAge(), kjb.getBloodType());
		
		// ��ü�迭
		// ���� + ����
		Student[] students = new Student[3];
		// �� �Ҵ�.
		students[0] = new Student (1,"������",25,"B", 175.6);
		students[1] = new Student (2,"�̱Կ�",25,"B", 179.3);
		students[2] = new Student (3,"�ڹα�",25,"O", 178.8);
		
		System.out.println(students[0] + "/" +students[1]);
		
		Student temp = null;
		for(int i = 0; i <students.length; i++) {
//			System.out.println(students[i].getName());
			temp = students[i];
			System.out.println(temp.getName()+"/" + temp.getAge());
		}
		System.out.println("--------------------------------------------");
		//������ for������ students �迭�� ��� ���� ���� ���.
		// ��� �� : �̸�, ����, Ű, �¾ ��
		
		for(Student value: students) {
			System.out.printf("�̸� : %s, ���� : %d, Ű : %.2f, �¾ �� : %d \n",
					value.getName(), value.getAge(), value.getHeight(), (2022 - value.getAge())+1);
		}
		
	} // main

} // class
