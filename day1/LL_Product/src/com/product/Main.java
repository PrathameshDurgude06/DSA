/*
 * B)
	Create LL of product(id,name,qty,price)
 */


package com.product;

import com.product.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList productList = new LinkedList();

		Product prod1 = new Product("p1", "Product1", 10, 99.99);
		Product prod2 = new Product("p2", "Product2", 20, 199.99);
		Product prod3 = new Product("p3", "Product3", 30, 299.99);

		productList.insert(prod1);
		productList.insert(prod2);
		productList.insert(prod3);

		productList.display();
	}
}

