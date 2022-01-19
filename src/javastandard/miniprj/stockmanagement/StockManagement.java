package javastandard.miniprj.stockmanagement;

public class StockManagement {

	private static StockManagement instance;

	public static StockManagement getInstance() {

		if (instance == null)
			instance = new StockManagement();
		return instance;
	}

	private Sales[] sa;
	private static int MAX_SIZE = 100;
	private int idx;

	private StockManagement() {
		sa = new Sales[MAX_SIZE];
		idx = 0;
	}

	// ��ǰ���
	public void add(String productNo, String productInfo, double productCost, int amount, int logiticCost) {
		Sales s = new Sales();
		s.setProductNo(productNo);
		s.setProductInfo(productInfo);
		s.setProductCost(productCost);
		s.setAmonut(amount);
		s.setLogiticCost(logiticCost);

		sa[idx++] = s;
	}

	//��ǰ ����
	public void delete(String deleteInfo) {
		for (int i = 0; i < idx; i++) {
			if(sa[i].getProductNo().equals(deleteInfo)) {
				for(;i<idx;i++) {
					sa[i] = sa[i+1];
				}
				idx --;
			}
		}
	}
	
	//��ǰ ���
	public void list() {
		System.out.println("------------------------------------");
		for(int i = 0; i <idx; i++) {
			System.out.println(sa[i]);
		}System.out.println("------------------------------------");
	}
	
	// ��ǰ�˻�
	public void search(String searchInfo) {
		for(int i = 0; i < idx; i ++) {
			if(sa[i].getProductInfo().equals(searchInfo)) {
				System.out.println(sa[i]);
			}
		}
	}
	
	//���� ������Ʈ
	public void update(String orderInfo, int orderQuantity) {
		for(int i = 0; i < idx; i ++) {
			if(sa[i].getProductInfo().equals(orderInfo)) {
				// sa�迭���� ������ 0�̰ų� �������� ���ּ����� �� ���� �����̸�
				if((sa[i].getAmount() == 0) || (sa[i].getAmount()-orderQuantity)<0) {
					System.out.println("��� �����մϴ�.");
				}
				else {
					sa[i].setAmonut((sa[i].getAmount()-orderQuantity));
					System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
				}
			}
		}
	}

}
