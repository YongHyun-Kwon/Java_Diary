package javastandard.miniprj.bank;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("[1] ���»��� | [2] ���¸�� | [3] ���� | [4] ��� | [5] ����");
			System.out.println("---------------------------------------------------");
			System.out.print("����>");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} // end if else

		} // end while
		System.out.println("���α׷� ����");

	} // main

	// ���»����ϱ�
	private static void createAccount() {

		System.out.println("------------");
		System.out.println("���»���");
		System.out.println("------------");
		System.out.print("���¹�ȣ:");
		String ano = sc.next();
		System.out.print("������:");
		String owner = sc.next();
		System.out.print("�ʱ��Աݾ�:");
		int balance = sc.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			} // end if
		} // end for
	} // createAccount

	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("------------");
		System.out.println("���¸��");
		System.out.println("------------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			} // end if
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		} // end for
	} // accountList

	// �����ϱ�
	private static void deposit() {

		System.out.println("------------");
		System.out.println("����");
		System.out.println("------------");
		System.out.print("���¹�ȣ:");
		String ano = sc.next();
		System.out.print("���ݾ�:");
		int dps = sc.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("���¸� ã�� �� �����ϴ�.");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + dps);
			System.out.println("��� : �Ա��� �Ϸ� �Ǿ����ϴ�.");
		} // end if else

	} // deposit

	// ����ϱ�
	private static void withdraw() {

		System.out.println("------------");
		System.out.println("���");
		System.out.println("------------");
		System.out.print("���¹�ȣ:");
		String ano = sc.next();
		System.out.print("��ݾ�:");
		int wdr = sc.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("���¸� ã�� �� �����ϴ�.");
		} else {
			if (findAccount(ano).getBalance() == 0 || findAccount(ano).getBalance() - wdr < 0) {
				System.out.println("��ݾ��� �����մϴ�.");
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - wdr);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
			}
		} // end if else

	} // withdraw

	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			} // end if
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			} // end if
		} // end for
		return null;
	} // findAccount

} // class
