package com.product;

public class Node {
	private Product data;
	private Node next;
	
	public Node(Product data) {
		this.data = data;
		next = null;
	}

	public Product getData() {
		return data;
	}

	public void setData(Product data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
