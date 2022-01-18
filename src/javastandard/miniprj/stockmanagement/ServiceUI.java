package javastandard.miniprj.stockmanagement;

import java.util.Scanner;

public class ServiceUI {

	Scanner sc = new Scanner(System.in);
//	StockManager sm = StockManager.getInstance();

	int seller, buyer, quit;

	public void StartScreen() {
		while (true) {
			System.out.println("-------------�μ� ����-------------");
			System.out.print("[1]������, [2]���ź�, [0]���α׷� ���� \n");
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
		System.out.println("-------------����Ǿ����ϴ�-------------");
		System.exit(0);
	}

	public void sellesTeamService() {
		do {
			System.out.println("--------------------�������� �ý����Դϴ�.------------------");
			System.out.println("-------------����Ͻ� ������ ��ȣ�� �������ּ���.-------------");
			System.out.print("[1] ��ǰ���  [2] ��ǰ����  [3] ��ǰ���  [4]  ��ǰ�˻�  [0]�ڷΰ���\n");
			System.out.println("-----------------------------------------------------");
			System.out.print(">");

			seller = sc.nextInt();

			
			if(seller==1) {
				// ��ǰ ���
				System.out.println("------------------------------------------");
				System.out.println("-------------��ǰ������ �Է����ּ���-------------");
				System.out.print("��ǰ��ȣ : ");
				String productNo = sc.next();

				System.out.print("��ǰ���� : ");

				String productInfo = sc.next();

				System.out.print("��ǰ���� : ");
				double productCost = sc.nextDouble();

				System.out.print("��ǰ���� : ");
				int amount = sc.nextInt();

				System.out.print("��ۺ�� : ");
				int logiticCost = sc.nextInt();
				System.out.println("------------------------------------------");

//				sm.add(productNo, productInfo, productCost, amount, logiticCost);
				
			} else if(seller == 2) {
			
				// ��ǰ ����
				System.out.println("------------------------------------------");
				System.out.println("-----------������ ��ǰ��ȣ�� �Է����ּ���----------");
				System.out.print(">");
				sc.nextLine();
				String deleteNo = sc.nextLine();
				System.out.println("------------------------------------------");
//				sm.delete(deleteNo);
				
			} else if(seller == 3) {
				// ��ǰ ���
//				sm.list();
				
			} else if(seller == 4) {
				System.out.println("------------------------------------------");
				System.out.println("-----------�˻��� ��ǰ��ȣ�� �Է����ּ���----------");
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
			System.out.println("--------------------���Ű��� �ý����Դϴ�.------------------");
			System.out.println("-------------����Ͻ� ������ ��ȣ�� �������ּ���.-------------");
			System.out.print("[1] ���Ź���  [0] �ڷΰ���\n");
			System.out.println("-----------------------------------------------------");
			System.out.print(">");
			
			buyer = sc.nextInt();
			
			if(buyer == 1) {
				System.out.println("------------�����Ͻ� ��ǰ��ȣ�� �Է����ּ���------------");
				System.out.print("ProductNo : ");
				sc.nextLine();
				String orderInfo = sc.nextLine();
//				sm.search(orderInfo); 
				
				System.out.println("---------------���ּ����� �Է����ּ���---------------");
				int orderQuantity = sc.nextInt();
				
//				sm.update(orderInfo, orderQuantity);
			}
				
			if(buyer == 0) {
				StartScreen();	
			}
			
		
		}while(buyer!=0);
	}
}
