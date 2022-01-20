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
	 * 1�� ���� 0,1,2,3,4�� �Է� �޾� �Ʒ��� ǥ�� �ش��ϴ� �������� ����ϴ� ��¥�������� ��ȯ�ϴ� ���� �ϴ� method.
	 * 
	 * ��ȯ�Ǵ� ���� ������ ����-��-�� ���� �ð�:�С� �� ���� ��ȿ��) 0,1,2,3,4�� �ƴ� ���� �ԷµǸ� ���ѱ����� �����ش�.
	 * 
	 * 
	 * @param
	 * @return
	 */
	public String nationDate(int nation) {

		String formatDate = "�ѱ�";

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
			System.out.println("0~4��������");
			break;
		} // end switch

		return formatDate;

	} // nationDate

	/**
	 * 2������ ����,��,�� �� instance ������ ���� Ŭ�������� �ۼ��ϰ�, �� Ŭ������ �Ű������� ������ method�� �ۼ��Ѵ�.
	 * method������ �Էµ� ��ü�� ��,��,�Ͽ� ���� �����ϡ��� ��ȯ�Ѵ�.
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
		System.out.println("--------------�� ������ �ð�--------------");
		System.out.println("[0] �ѱ� [1] �̱� [2] �߱� [3] �Ϻ� [4] ����");
		System.out.println("---------------------------------------");
		System.out.print(">");
		int nation = sc.nextInt();

		System.out.println(udc.nationDate(nation));

		System.out.println("------------------------------");

		System.out.println("----�Ѵ� �� �������� �˰���� �⵵�� ���� ��---- ");
		System.out.print("�⵵ : ");
		int year = sc.nextInt();
		System.out.print("�� : ");
		int month = sc.nextInt();
		System.out.print("�� : ");
		int day = sc.nextInt();

		UseDateFormatEntity udfe = new UseDateFormatEntity(year, month, day);

		System.out.println(udc.getMaximumDay(udfe));

		sc.close();

	}

}
