package javastandard.miniprj.gradecalculator;

import java.util.ArrayList;

public class GradeCalculator {

	@SuppressWarnings("unused")
	private String name; 
	private double grade;
	private int score;

	// Course[] arr = new Course[10]; // 배열보다는 ArrayList가 효율적 index 갯수 설정과 변경이 어려움
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
		System.out.printf("직전 학기 성적: %f (총 %d학점)\n", this.grade, this.score);
		System.out.printf("이번 학기 성적: %f (총 %d학점)\n", getGPA(courseList), getScore(courseList));
		System.out.printf("전체 예상 학점: %f (총 %d학점)\n", getTotalGPA(courseList), (getScore(courseList) + this.score));
	} // print

} // class
