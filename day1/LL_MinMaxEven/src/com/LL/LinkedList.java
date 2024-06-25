package com.LL;

public class LinkedList {
	
	private Node head ;
	
	public Node getHead() {
		return head;
	}

	public LinkedList() {
		head = null;
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		
		Node newNode = new Node(data);
		
		if(newNode == null) {
			return false;
		}
		
		if(head == null) {
			head = newNode;
			return true;
		}
		
		Node temp = head;
		
		while(temp.getNext() != null) {
			temp = temp.getNext();
			if(temp.getData() == data) {
				return false;
			}
		}
		temp.setNext(newNode);
		return true;
			
	}
	
	public void maxele() {
		Node temp = head;
		int max = temp.getData();
		while(temp != null) {
			if(temp.getData() > max) {
				max = temp.getData();
			}
			temp = temp.getNext();
		}
		System.out.println("Max Element in LL:"+ max);
	}
	
	public void minele() {
		Node temp = head;
		int min = temp.getData();
		while(temp != null) {
			if(temp.getData() < min) {
				min = temp.getData();
			}
			temp = temp.getNext();
		}
		System.out.println("Min Element in LL:"+ min);
	}
	
	public void evenele() {
		Node temp = head;
		int sum = 0;
		
		while(temp != null) {
			int ele = temp.getData();
			if(ele % 2 == 0) {
				sum = sum + ele;
			}
			temp = temp.getNext();
		}
		System.out.println("Sum of even element :"+sum);
	}
	
	public void display() {
		Node temp = head;
		System.out.println("Elements in Linked List :");
		while(temp != null) {
			System.out.println(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	

}
