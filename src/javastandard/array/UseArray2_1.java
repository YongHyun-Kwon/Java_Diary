package javastandard.array;

/**
 * ������ �迭�� �⺻�� ������ ���
 * 
 * @author user
 */
public class UseArray2_1 {

	public static final int JAVA_IDX = 0;
	public static final int ORACLE_IDX = 1;
	public static final int HTML_IDX = 2;

	private int javaTotal, oracleTotal, htmlTotal;
	private int javaTopScore;
	private int topNumber;
	private String topName;

	public void scoreProcess() {
		String[] names = { "������", "�ǿ���", "������", "������", "������" };
		int[][] score = { { 90, 94, 91 }, { 86, 84, 71 }, { 96, 99, 100 }, { 75, 76, 73 }, { 63, 69, 69 } };

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\tHTML\t����\t���");
		System.out.println("---------------------------------------------------------------------------------");

		int totalScore = 0;// �л� ����
		int allTotalScore = 0; // ��ü ����.

		for (int i = 0; i < score.length; i++) {// ��
			System.out.printf("%d\t%s\t", i + 1, names[i]);
			for (int j = 0; j < score[i].length; j++) {// ��
				System.out.printf("%d\t", score[i][j]);
				totalScore += score[i][j];// �� �л��� ������ ���� ��(+=)
			} // end for
			System.out.printf("%d\t%.2f\n", totalScore, (double) totalScore / score[0].length);
			allTotalScore += totalScore; // ��ü ����
			totalScore = 0; // �� �л��� ������ �ʱ�ȭ
		} // end for
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("�����ο� [ %d ]��\n", score.length);
		// ����. �ڵ带 ��������ؼ� ó��.
		System.out.printf("��ü ���� [ %d ]��,��ü ���[%.2f]\n", allTotalScore,
				(double) allTotalScore / (score.length * score[0].length));
		// ����. �Ʒ��� �۾��� instance variable�� method�� �ۼ��Ͽ� ó�� ����� ���.
		subjectTotalScore(score);
		System.out.printf("�ڹ� ���� [ %d ]��, ����Ŭ ����[ %d ], HTML ����[ %d ]\n", javaTotal, oracleTotal, htmlTotal);
		System.out.printf("�ڹ� ���� [ %d ]��, ����Ŭ ����[ %d ], HTML ����[ %d ]\n", subjectTotalScore(score, JAVA_IDX),
				subjectTotalScore(score, ORACLE_IDX), subjectTotalScore(score, HTML_IDX));

		javaTopScore(score);
		System.out.printf("�ڹ� �ְ����� [ %d ]��\n", javaTopScore);
		System.out.printf("�ڹ� �ְ����� [ %d ]��\n", javaTopScoreSec(score));
		topStudent(score, names);
		System.out.printf("1���л��� ��ȣ[ %d], �̸�[ %s ]\n", topNumber, topName);
		int topNum = topStudentNumber(score);
		System.out.printf("1���л��� ��ȣ[ %d], �̸�[ %s ]\n", topNum, topStudentName(names, topNumber));
	}// useArray2

	/**
	 * ���� ����
	 */
	public void subjectTotalScore(int[][] score) { // CallByReference
		// score �迭�� scoreProcess() method�ȿ� ����� �迭(��������).1. �ڵ��ʱ�ȭx 2.method�ȿ����� ���
		// subjectTotalcore���� �ٸ� method �ȿ� ���������� ����ҷ��� ���� �޾ƾ�(�Ű�����) �Ѵ�.
		for (int i = 0; i < score.length; i++) {
			javaTotal += score[i][JAVA_IDX];
			oracleTotal += score[i][ORACLE_IDX];
			htmlTotal += score[i][HTML_IDX];
		} // end for
	}

	public int subjectTotalScore(int[][] score, int subjectIdx) { // CallByReference
		// score �迭�� scoreProcess() method�ȿ� ����� �迭(��������).1. �ڵ��ʱ�ȭx 2.method�ȿ����� ���
		// subjectTotalcore���� �ٸ� method �ȿ� ���������� ����ҷ��� ���� �޾ƾ�(�Ű�����) �Ѵ�.
		int someTotal = 0;

		for (int i = 0; i < score.length; i++) {
			someTotal += score[i][subjectIdx];
		} // end for
		return someTotal;
	} // subjectTotalScore

	public void javaTopScore(int[][] score) {

		for (int i = 0; i < score.length; i++) {
			if (javaTopScore < score[i][JAVA_IDX]) {
				javaTopScore = score[i][JAVA_IDX];
			} // end if
		} // end for

	} // javaTopScore

	public int javaTopScoreSec(int[][] score) {
		int javaTopScore = 0;
		for (int i = 0; i < score.length; i++) {
			if (javaTopScore < score[i][JAVA_IDX]) {
				javaTopScore = score[i][JAVA_IDX];
			} // end if
		} // end for
		return javaTopScore;
	} // javaTopScore

	public void topStudent(int[][] score, String[] names) {
		int totalScore = 0;
		int topScore = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				totalScore += score[i][j]; // ���� ���� ���ϰ�
			} // end for
			if (topScore < totalScore) { // ������ ���� ������ �ְ� �������� ��
				topScore = totalScore; // ����
				topNumber = i; // �ְ� ��ȣ�� ���Ѵ�.
			} // end if
			totalScore = 0;
		} // end for
		topName = names[topNumber];
		topNumber++;
	} // topStudent

	public int topStudentNumber(int[][] score) {
		int totalScore = 0;
		int topScore = 0;

		int topNumber = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				totalScore += score[i][j]; // ���� ���� ���ϰ�
			} // end for
			if (topScore < totalScore) { // ������ ���� ������ �ְ� �������� ��
				topScore = totalScore; // ����
				topNumber = i; // �ְ� ��ȣ�� ���Ѵ�.
			} // end if
			totalScore = 0;
		} // end for
		return ++topNumber;

	} // topStudentNumber

	public String topStudentName(String[] names, int topNumber) {
		return names[topNumber - 1];
	} // topStudentName

	public static void main(String[] args) {
		new UseArray2_1().scoreProcess();
	}// main

}// class
