package javastandard.miniprj.stockmanagement;

import java.util.Scanner;

public class ServiceUI {

	Scanner sc = new Scanner(System.in);
//	StockManager sm = StockManager.getInstance();

	int seller, buyer, quit;

	public void StartScreen() {
		while (true) {
			System.out.println("-------------부서 선택-------------");
			System.out.print("[1]영업부, [2]구매부, [0]프로그램 종료 \n");
			System.out.println("---------------------------------");
			System.out.print(">");
			int user = sc.nextInt();

			switch (user) {
			case 1:
				sellesTeamService();
			case 2:
				buyerTeamService();
			case 0:
				quit();

			}
		}
	}

	public void quit() {
		System.out.println("-------------종료되었습니다-------------");
		System.exit(0);
	}

	public void sellesTeamService() {
		do {
			System.out.println("--------------------영업관리 시스템입니다.------------------");
			System.out.println("-------------사용하실 서비스의 번호를 선택해주세요.-------------");
			System.out.print("[1] 상품등록  [2] 상품삭제  [3] 상품목록  [4]  상품검색  [0]뒤로가기\n");
			System.out.println("-----------------------------------------------------");
			System.out.print(">");

			seller = sc.nextInt();

			
			if(seller==1) {
				// 상품 등록
				System.out.println("------------------------------------------");
				System.out.println("-------------상품정보를 입력해주세요-------------");
				System.out.print("상품번호 : ");
				String productNo = sc.next();

				System.out.print("상품정보 : ");

				String productInfo = sc.next();

				System.out.print("상품가격 : ");
				double productCost = sc.nextDouble();

				System.out.print("상품수량 : ");
				int amount = sc.nextInt();

				System.out.print("배송비용 : ");
				int logiticCost = sc.nextInt();
				System.out.println("------------------------------------------");

//				sm.add(productNo, productInfo, productCost, amount, logiticCost);
				
			} else if(seller == 2) {
			
				// 상품 삭제
				System.out.println("------------------------------------------");
				System.out.println("-----------삭제할 상품번호를 입력해주세요----------");
				System.out.print(">");
				sc.nextLine();
				String deleteNo = sc.nextLine();
				System.out.println("------------------------------------------");
//				sm.delete(deleteNo);
				
			} else if(seller == 3) {
				// 상품 목록
//				sm.list();
				
			} else if(seller == 4) {
				System.out.println("------------------------------------------");
				System.out.println("-----------검색할 상품번호를 입력해주세요----------");
				String searchInfo = sc.nextLine();
				System.out.println("------------------------------------------");
//				sm.search(searchInfo);
				
			} else if(seller == 0) {
				StartScreen();
			}

		}while(seller!=0);

	}

	public void buyerTeamService() {
		do {
			System.out.println("--------------------구매관리 시스템입니다.------------------");
			System.out.println("-------------사용하실 서비스의 번호를 선택해주세요.-------------");
			System.out.print("[1] 구매발주  [0] 뒤로가기\n");
			System.out.println("-----------------------------------------------------");
			System.out.print(">");
			
			buyer = sc.nextInt();
			
			if(buyer == 1) {
				System.out.println("------------발주하실 상품번호를 입력해주세요------------");
				System.out.print("ProductNo : ");
				sc.nextLine();
				String orderInfo = sc.nextLine();
//				sm.search(orderInfo); 
				
				System.out.println("---------------발주수량을 입력해주세요---------------");
				int orderQuantity = sc.nextInt();
				
//				sm.update(orderInfo, orderQuantity);
			}
				
			if(buyer == 0) {
				StartScreen();	
			}
			
		
		}while(buyer!=0);
	}
}
