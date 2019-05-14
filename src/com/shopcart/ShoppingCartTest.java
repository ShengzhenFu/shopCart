package com.shopcart;

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product p1 = new Product(101, "Lenovo laptop", "laptop", 4599);
		Product p2 = new Product(102, "Apple", "Fruite", 5.9);
		Product p3 = new Product(103, "TV", "CES", 2799);
		Product p4 = new Product(104, "Pants", "Cloth", 128);
		Product p5 = new Product(105, "Mi 9", "mobile phone", 2998);
		Product p6 = new Product(101, "Lenovo laptop", "laptop", 4599); // test duplicated situation
		
		cart.addProduct(p1);
		cart.addProduct(p2);
		cart.addProduct(p3);
		cart.addProduct(p4);
		cart.addProduct(p5);
		cart.addProduct(p6);
		cart.showAll();
		
		System.out.println("#################");
		boolean flag=cart.deleteProduct(p2.getProductId());
		if(flag) {
			System.out.println("product ID :" + p2.getProductId() + " removed success !");
		}else {
			System.out.println("remove failed");
		}
		
		cart.showAll();
		System.out.println("###################");
		boolean flag2=cart.modifyProduct(p3.getProductId(), 2);
		if(flag2) {
			System.out.println("product id: " + p3.getProductId() + " modified success !");
		}else {
			System.out.println("modify failed");
		}
		
		cart.showAll();
		
		System.out.println("product total amount is " + cart.totalAllMoney());

	}
}
