package com.queue;



public class Main {
	
	public static void main(String[] args) {
		
		Queue q = new Queue(5);
		q.insert(10);
		q.insert(50);
		q.insert(60);
		q.insert(90);
		System.out.println();
		q.display();
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		q.insert(100);
		q.display();
		
		q.update(0,200);
		q.insert(300);
		q.insert(400);
		q.insert(400);
		q.insert(400);
		q.display();
		q.updateByData(300,500);
		q.display();
		System.out.println(q.count());
		System.out.println(q.countDuplicate(400));

		
	}

}
