package javastandard.miniprj.stockmanagement;

public class Sales {

	private String productNo; // �ֹ���ȣ
	private String productInfo; // ��ǰ����
	private double productCost; // ��ǰ����
	private int amount; // ����
	private int logiticCost;

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmonut(int amount) {
		this.amount = amount;
	}

	public int getLogiticCost() {
		return logiticCost;
	}

	public void setLogiticCost(int logiticCost) {
		this.logiticCost = logiticCost;
	}
	
	@Override
	public String toString() {
		return "Stcok [no : " + productNo + ", productInfo : " + productInfo + ", productCost : " + productCost
				+ ", orderQuantity : " + amount + ", logiticCost : " + logiticCost + "]";
	}

}
