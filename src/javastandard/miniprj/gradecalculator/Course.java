package javastandard.miniprj.gradecalculator;

public class Course {
	public static final int CREDIT_MAJOR = 3;
	public static final int CREDIT_GENERAL = 2;

	@SuppressWarnings("unused")
	private String subject;
	private double credit;
	private String grade;

	public Course(String subject, double credit, String grade) {
		this.subject = subject;
		this.credit = credit;
		this.grade = grade;
	} // Course
	
	// 
	public double getCredit() {
		return this.credit;
	} // getCredit
	
	
	public double getGpa() {
		double score = 0;
		// switch 문자열 비교 가능
		switch (this.grade) {
		case "A+":
			score = 4.5;
			break;
		case "A":
			score = 4.0;
			break;
		case "B+":
			score = 3.5;
			break;
		case "B":
			score = 3.0;
			break;
		case "C+":
			score = 2.5;
			break;
		case "C":
			score = 2.0;
			break;
		case "D+":
			score = 1.5;
			break;
		case "D":
			score = 1.0;
			break;
		default:
			break;
		} // end switch

		return score;

	} // parseGrade

} // class
