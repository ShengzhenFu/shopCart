package com.shopcart;

public class ProductItem {
	private Product product; // purchased product
	private int count; // product number
	
	public double totalMoney() {
		double price=product.getPrice(); // get product price
		return price*count;
		}
	
	public ProductItem() {
		super();
	}

	public ProductItem(Product product, int count) {
		super();
		this.product=product;
		this.count=count;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public int getCount() {
		return count;
	}
	
	public static int setCount(int count) {
		return count;
	}
	
}
