package javastandard.miniprj.gradecalculator;

import java.util.ArrayList;

public class GradeCalculator {

	@SuppressWarnings("unused")
	private String name; 
	private double grade;
	private int score;

	// Course[] arr = new Course[10]; // �迭���ٴ� ArrayList�� ȿ���� index ���� ������ ������ �����
	ArrayList<Course> courseList = new ArrayList<>();

	public GradeCalculator(String name, double grade, int score) {
		this.name = name;
		this.grade = grade;
		this.score = score;
	} // GradeCalculator

	public void addCourse(Course co) {
		courseList.add(co);
	} // addSubject

	public int getScore(ArrayList<Course> co) {
		int result = 0;
		for (Course val : courseList) {
			result += val.getCredit();
		} // end for

		return result;
	} // sumGrade
	
	public double getGPA(ArrayList<Course> co) {
		double result = 0.0;
		
		for( Course val : courseList) {
			result += val.getCredit() * val.getGpa();
		} // end for
		result /= getScore(courseList);
		
		return result;
	} // end avgGrade
	
	public double getTotalGPA(ArrayList<Course> co) {
		double result = 0;
		for(Course val : courseList) {
			result += val.getCredit() * val.getGpa();
		} // end for
		result += this.grade * this.score;
		result = result / (getScore(co) + this.score);
		return result;
	} // totalAvgGrade
	
	public void print() {
		System.out.printf("���� �б� ����: %f (�� %d����)\n", this.grade, this.score);
		System.out.printf("�̹� �б� ����: %f (�� %d����)\n", getGPA(courseList), getScore(courseList));
		System.out.printf("��ü ���� ����: %f (�� %d����)\n", getTotalGPA(courseList), (getScore(courseList) + this.score));
	} // print

} // class
