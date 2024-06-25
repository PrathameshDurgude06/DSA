/*
 * A) Find the follwing from given singly linked list
 * 	1. find max ele from given sll
	2. find min ele from given sll
	3. find sum of all even numbers from given sll

	LL should be a 8->1->2->5->7->4->null

 */

package com.LL;

public class Main {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.insert(8);
		l1.insert(1);
		l1.insert(2);
		l1.insert(5);
		l1.insert(7);
		l1.insert(4);
		
		l1.display();
		
		l1.maxele();
		
		l1.minele();
		
		l1.evenele();
		

	}

}
