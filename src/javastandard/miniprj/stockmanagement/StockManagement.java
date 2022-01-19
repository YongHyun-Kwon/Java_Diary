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

	// 상품등록
	public void add(String productNo, String productInfo, double productCost, int amount, int logiticCost) {
		Sales s = new Sales();
		s.setProductNo(productNo);
		s.setProductInfo(productInfo);
		s.setProductCost(productCost);
		s.setAmonut(amount);
		s.setLogiticCost(logiticCost);

		sa[idx++] = s;
	}

	//상품 삭제
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
	
	//상품 목록
	public void list() {
		System.out.println("------------------------------------");
		for(int i = 0; i <idx; i++) {
			System.out.println(sa[i]);
		}System.out.println("------------------------------------");
	}
	
	// 상품검색
	public void search(String searchInfo) {
		for(int i = 0; i < idx; i ++) {
			if(sa[i].getProductInfo().equals(searchInfo)) {
				System.out.println(sa[i]);
			}
		}
	}
	
	//수량 업데이트
	public void update(String orderInfo, int orderQuantity) {
		for(int i = 0; i < idx; i ++) {
			if(sa[i].getProductInfo().equals(orderInfo)) {
				// sa배열에서 수량이 0이거나 수량에서 발주수량을 뺀 값이 음수이면
				if((sa[i].getAmount() == 0) || (sa[i].getAmount()-orderQuantity)<0) {
					System.out.println("재고가 부족합니다.");
				}
				else {
					sa[i].setAmonut((sa[i].getAmount()-orderQuantity));
					System.out.println("구매가 완료되었습니다.");
				}
			}
		}
	}

}
