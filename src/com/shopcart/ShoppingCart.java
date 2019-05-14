package com.shopcart;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCart {
	private Map<Integer, ProductItem> map=new LinkedHashMap<Integer, ProductItem>();
	
	public void addProduct(Product p) {
		int productId=p.getProductId();
		if(map.containsKey(productId)) {
			ProductItem productItem=map.get(productId);
			ProductItem.setCount(productItem.getCount()+1);
		}else {
			map.put(productId, new ProductItem(p, 1));			
		}
	}
	
	public void showAll() {
		Collection<ProductItem> productItems = map.values();
		Iterator<ProductItem> iterator = productItems.iterator();
		while(iterator.hasNext()) {
			ProductItem productItem = iterator.next();
			Product product = productItem.getProduct();
			System.out.println("product ID: " + product.getProductId() + ", productName: "
					+ product.getProductName()+", price: " + product.getPrice()+", "
					+ "quantity: "+productItem.getCount() + ", total: " + productItem.totalMoney());
		}
	}
	
	public boolean deleteProduct(int productId) {
		if(map.containsKey(productId)) {
			map.remove(productId);
				return true;
		}
		return false;
	}
	
	public boolean modifyProduct(int productId, int count) {
		if(map.containsKey(productId)) {
			if(count >= 1) {
				ProductItem productItem = map.get(productId);
				productItem.setCount(count);
				return true;
			}else if(count==0) {
				deleteProduct(productId);
				return true;
			}			
		}
		return false;
	}
	
	public void clearCart() {
		map.clear();
	}
	
	public double totalAllMoney() {
		double total =0;
		Collection<ProductItem> productItems = map.values();
		Iterator<ProductItem> iterator = productItems.iterator();
		while(iterator.hasNext()) {
			ProductItem productItem = iterator.next();
			double money=productItem.totalMoney();
			total+=money;
		}
		return total;
	}
}
	

