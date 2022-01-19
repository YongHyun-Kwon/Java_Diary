package javastandard.miniprj.bank;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("[1] 계좌생성 | [2] 계좌목록 | [3] 예금 | [4] 출금 | [5] 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택>");

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
		System.out.println("프로그램 종료");

	} // main

	// 계좌생성하기
	private static void createAccount() {

		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		System.out.print("계좌번호:");
		String ano = sc.next();
		System.out.print("계좌주:");
		String owner = sc.next();
		System.out.print("초기입금액:");
		int balance = sc.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			} // end if
		} // end for
	} // createAccount

	// 계좌목록보기
	private static void accountList() {
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			} // end if
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		} // end for
	} // accountList

	// 예금하기
	private static void deposit() {

		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");
		System.out.print("계좌번호:");
		String ano = sc.next();
		System.out.print("예금액:");
		int dps = sc.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("계좌를 찾을 수 없습니다.");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + dps);
			System.out.println("결과 : 입금이 완료 되었습니다.");
		} // end if else

	} // deposit

	// 출금하기
	private static void withdraw() {

		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");
		System.out.print("계좌번호:");
		String ano = sc.next();
		System.out.print("출금액:");
		int wdr = sc.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("계좌를 찾을 수 없습니다.");
		} else {
			if (findAccount(ano).getBalance() == 0 || findAccount(ano).getBalance() - wdr < 0) {
				System.out.println("출금액이 부족합니다.");
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - wdr);
				System.out.println("결과: 출금이 성공되었습니다.");
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
