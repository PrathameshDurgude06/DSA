package com.queue;


public class Queue {
	private int size;
	private int front,rear;
	private int[] arr;
	
	public Queue(int size) {
		this.size=size;
		front=rear=-1;
		arr=new int[size];
	}
	
	public boolean isEmpty() {
		return (front == -1 && rear == -1);
	}
	
	public boolean isFull() {
		return (rear==(size-1));
	}
	
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		arr[++rear]=data;
		if(front==-1) {
			front=0;
		}
		return true;
	}
	
	public int delete() {
		int element;
	    if (isEmpty()) {
	      System.out.println("Queue is empty");
	      return -1;
	    } else {
	      element = arr[front];
	      if (front >= rear) {
	        front = -1;
	        rear = -1;
	      } 
	      else {
	        front++;
	      }
	      System.out.println("Deleted -> " + element);
	      return element;
	    }    
    }
		
	
	void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void update(int u,int data) {
		for(int i=0;i<arr.length;i++) {
			if(i==u) {
				arr[i]=data;
			}
		}
	}
	
	public void updateByData(int data, int newData) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == data) {
	            arr[i] = newData;
	        }
	    }
	}
	
	public int count() {
		int count=0;
		for(int i=front;i<=rear;i++) {
			count++;
		}
		return count;
	}
	
	public int countDuplicate(int key) {
		int count=0;
		for(int i : arr) {
			if(i == key) {
				count++;
			}
		}
		return count;
	}
}
