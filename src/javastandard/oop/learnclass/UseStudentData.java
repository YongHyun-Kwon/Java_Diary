package javastandard.oop.learnclass;

/**
 * int, String, int, String,double로 구성된 사용자 정의자료형을 사용
 * 
 * @author user
 */
public class UseStudentData {

	public static void main(String[] args) {
		
		Student kyh = new Student(1,"권용현",25,"AB",180.1);
		Student kjb = new Student(2,"강주빈",25,"AB",176.8);
		
		System.out.printf("%s 학생은 %d번이고 %d살 혈액형은 %s형 입니다.\n",
				kyh.getName(), kyh.getNum(), kyh.getAge(), kyh.getBloodType());
		System.out.printf("%s 학생은 %d번이고 %d살 혈액형은 %s형 입니다.\n",
				kjb.getName(), kjb.getNum(), kjb.getAge(), kjb.getBloodType());
		
		// 1년이 지난 후
		kyh.setAge(kyh.getAge()+1);
		kjb.setAge(kjb.getAge()+1);
		
		System.out.printf("%s 학생은 %d번이고 %d살 혈액형은 %s형 입니다.\n",
				kyh.getName(), kyh.getNum(), kyh.getAge(), kyh.getBloodType());
		System.out.printf("%s 학생은 %d번이고 %d살 혈액형은 %s형 입니다.\n",
				kjb.getName(), kjb.getNum(), kjb.getAge(), kjb.getBloodType());
		
		// 객체배열
		// 선언 + 생성
		Student[] students = new Student[3];
		// 값 할당.
		students[0] = new Student (1,"윤찬희",25,"B", 175.6);
		students[1] = new Student (2,"이규열",25,"B", 179.3);
		students[2] = new Student (3,"박민규",25,"O", 178.8);
		
		System.out.println(students[0] + "/" +students[1]);
		
		Student temp = null;
		for(int i = 0; i <students.length; i++) {
//			System.out.println(students[i].getName());
			temp = students[i];
			System.out.println(temp.getName()+"/" + temp.getAge());
		}
		System.out.println("--------------------------------------------");
		//개선된 for문으로 students 배열의 모든 방의 값을 출력.
		// 출력 값 : 이름, 나이, 키, 태어난 해
		
		for(Student value: students) {
			System.out.printf("이름 : %s, 나이 : %d, 키 : %.2f, 태어난 해 : %d \n",
					value.getName(), value.getAge(), value.getHeight(), (2022 - value.getAge())+1);
		}
		
	} // main

} // class
