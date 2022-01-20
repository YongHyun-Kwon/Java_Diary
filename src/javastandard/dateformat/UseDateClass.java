package javastandard.dateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class UseDateClass {

	final static int KOREA = 0;
	final static int US = 1;
	final static int CHINA = 2;
	final static int JAPAN = 3;
	final static int UK = 4;

	private Date date = new Date();
	SimpleDateFormat sdf = null;

	/**
	 * 1번 문제 0,1,2,3,4를 입력 받아 아래의 표에 해당하는 국가에서 사용하는 날짜형식으로 반환하는 일을 하는 method.
	 * 
	 * 반환되는 날자 형식은 “월-일-년 요일 시간:분” 의 형식 유효성) 0,1,2,3,4가 아닌 수가 입력되면 “한국”을 보여준다.
	 * 
	 * 
	 * @param
	 * @return
	 */
	public String nationDate(int nation) {

		String formatDate = "한국";

		switch (nation) {
		case KOREA:
			sdf = new SimpleDateFormat("yyyy-MM-dd EEEE a HH: mm ", Locale.KOREA);
			formatDate = sdf.format(date);
			break;
		case US:
			sdf = new SimpleDateFormat("yyyy-MM-dd EEEE a HH: mm ", Locale.US);
			formatDate = sdf.format(date);
			break;
		case CHINA:
			sdf = new SimpleDateFormat("yyyy-MM-dd EEEE a HH: mm ", Locale.CHINA);
			formatDate = sdf.format(date);
			break;
		case JAPAN:
			sdf = new SimpleDateFormat("yyyy-MM-dd EEEE a HH: mm ", Locale.JAPAN);
			formatDate = sdf.format(date);
			break;
		case UK:
			sdf = new SimpleDateFormat("yyyy-MM-dd EEEE a HH: mm ", Locale.UK);
			formatDate = sdf.format(date);
			break;
		default:
			System.out.println("0~4까지만요");
			break;
		} // end switch

		return formatDate;

	} // nationDate

	/**
	 * 2번문제 “년,월,일 을 instance 변수로 가진 클래스”를 작성하고, 그 클래스를 매개변수로 정의한 method를 작성한다.
	 * method에서는 입력된 객체의 년,월,일에 대한 “요일”을 반환한다.
	 * 
	 * @param w01
	 * @return
	 */
	public int getMaximumDay(UseDateFormatEntity w01) {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, w01.getYear());
		cal.set(Calendar.MONTH, w01.getMonth() - 1);
		cal.set(Calendar.DAY_OF_MONTH, w01.getDay());
		int maximum = cal.getActualMaximum(Calendar.DATE);

		return maximum;
	} // getMaximumDay

	public static void main(String[] args) {

		UseDateClass udc = new UseDateClass();

		Scanner sc = new Scanner(System.in);
		System.out.println("--------------각 나라의 시간--------------");
		System.out.println("[0] 한국 [1] 미국 [2] 중국 [3] 일본 [4] 영국");
		System.out.println("---------------------------------------");
		System.out.print(">");
		int nation = sc.nextInt();

		System.out.println(udc.nationDate(nation));

		System.out.println("------------------------------");

		System.out.println("----한달 총 몇일인지 알고싶은 년도의 월과 일---- ");
		System.out.print("년도 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();

		UseDateFormatEntity udfe = new UseDateFormatEntity(year, month, day);

		System.out.println(udc.getMaximumDay(udfe));

		sc.close();

	}

}
