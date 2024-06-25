package com.product;

import com.product.Node;

public class LinkedList {
	public Node head;
	
	public Node getHead() {
		return head;
	}

	public LinkedList() {
		head = null;
	}
	
	@SuppressWarnings("unused")
	public boolean insert(Product data) {
		
		Node newNode = new Node(data);
		
		//if newnode is empty
		if(newNode == null) {
			return false;
		}
		
		//if head is null then newnode becomes head 
		if(head == null) {
			head = newNode;
			return true;
		}
		
		Node temp = head;
		
		//insert after head 
		while(temp.getNext() != null) {   //head is not null
			temp = temp.getNext();			//set head to next node 
			if(temp.getData()== data) {		//Duplicate data constraint 
				return false;
			}
		}
		temp.setNext(newNode);   //if data not present set head = newnode 
		return true;
		
		
	}
	
	public void display() {
		Node temp = head ;
		while(temp != null) {
			System.out.println(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	
}
