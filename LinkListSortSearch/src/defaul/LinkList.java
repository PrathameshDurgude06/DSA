package defaul;

public class LinkList {

	Node head;
	int length;

	public LinkList() {

		this.head = null;
		this.length = 0;
	}

	public void addFirst(int a) {
		length++;
		Node x = new Node(a);

		if (head == null) {
			head = x;
			return;
		}
		x.next = head;
		head = x;

	}

	public void addLast(int a) {
		length++;
		Node x = new Node(a);
		if (head == null) {
			head = x;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = x;
	}

	public void display() {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");

	}

	public void inserAt(int index, int data) {
		if (length < index + 1) {
			System.out.println("index out bound ");
			return;
		}
		length++;
		Node x = new Node(data);
		Node prev = head;
		Node curr = head.next;
		for (int a = 0; a < index - 1; a++) {
			prev = prev.next;
			curr = curr.next;
		}
		prev.next = x;
		x.next = curr;

	}

	public int get(int index) {
		if (index > length) {

			return 0;
		}
		Node temp = head;
		for (int a = 0; a < index; a++) {
			temp = temp.next;
		}

		return temp.data;

	}

	public void set(int index, int data) {
		if (index > length) {

			return;
		}
		Node temp = head;
		for (int a = 0; a < index; a++) {
			temp = temp.next;
		}

		temp.data = data;

	}

	public void deleteFirst() {

		if (head == null) {
			System.out.println("Empty linkList");
			return;
		}
		length--;
		head = head.next;

	}

	public void deleteLast() {
		if (head == null) {

			return;
		}
		Node temp = head;
		length--;

		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;

	}
	public int linerSer(int key) {
		if(head == null) {
		return -1;
		}
		int a = 0;
		Node temp = head;
		while(temp != null) {
		if(temp.data == key) {
			return  a;
		}
		a++;
		temp = temp.next;
				
		}
		
		
		return -1;
	}
	
	public void sort() {
		
		for(int a = 0 ; a< this.length -1 ; a++) {
			for(int b = a+1 ; b < this.length ; b++) {
				if(this.get(a) > this.get(b)) {
					int temp = this.get(a);
					this.set(a, this.get(b));
					this.set(b, temp);
				}
			}
		}
		
		
	}
	
	public int binSer(int key ) {
		if(head == null) {
			return -1;
		}
		
		int start = 0;
		int end = this.length;
		while(start <= end) {
			int mid = (start + end)/2;
			if(this.get(mid) == key) {
				return mid;
			}
			else if (this.get(mid) > key) {
				end = mid -1;
			}
			else {
				start = mid +1;
			}
			
			
			
		}
		
		
		return -1;
	}
	


}
