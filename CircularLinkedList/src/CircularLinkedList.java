public class CircularLinkedList {
    private Node head;
    private int size=0;

    public CircularLinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (newNode == null) {
            return false;
        }

        if (head == null) {
            head = newNode;
            head.setNext(head);
            size++;
            return true;
        }

        Node last = head;
        while (last.getNext() != head) {
            last = last.getNext();
        }

        last.setNext(newNode);
        newNode.setNext(head);
        size++;
        return true;
    }

    public boolean insert(int data, int position) {
        if ((head == null && position > 1) || position <= 0) {
            return false;
        }

        Node newNode = new Node(data);

        if (position == 1) {
            if (head == null) {
                head = newNode;
                head.setNext(head);
                size++;
                return true;
            }

            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }

            newNode.setNext(head);
            head = newNode;
            last.setNext(newNode);
            size++;
            return true;
        }

        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if (prev == head) {
                return false;
            }
        }

        newNode.setNext(prev.getNext());
        prev.setNext(newNode);
        size++;
        return true;
    }

    public boolean deleteByVal(int data) {
        if (head == null) {
            return false;
        }

        if (head.getData() == data) {
            if (head.getNext() == head) {
                head = null;
                size--;
                return true;
            }

            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }
            head = head.getNext();
            last.setNext(head);
            size--;
            return true;
        
        }

        Node prev = head, del = head;
        while (del.getData() != data) {
            prev = del;
            del = del.getNext();
            if (del == head) {
                return false;
            }
        }

        prev.setNext(del.getNext());
        size--;
        return true;
    }

    public boolean deleteByPosition(int position) {
        if (head == null || position <= 0) {
            return false;
        }

        if (position == 1) {
            if (head.getNext() == head) {
                head = null;
                size--;
                return true;
            }
            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }

            head = head.getNext();
            last.setNext(head);
            size--;
            return true;
        }

        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            //check if prev referring to last node
            if(prev.getNext() == head) {
                return false;
            }
        }

        Node del = prev.getNext();
        prev.setNext(del.getNext());
        size--;
        return true;
    }

    public void display() {
       
    	if (head == null) {
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        } while (temp != head);

        System.out.println();
    }
    
    public void sort() {
    	boolean swapped;
    	if(head == null) {
    		return;
    	}
    	do {
    		swapped=false;
    		Node current=head;
    		Node next=head.getNext();
    		while(next != head) {
    			if(current.getData()>next.getData()) {
    				int temp=next.getData();
    				next.setData(current.getData());
    				current.setData(temp);
    				swapped=true;
    			}
    			current=next;
    			next=next.getNext();
    		}
    	}while(swapped);    
    }
    
    public int binarySearchByGetSet(int key) {
		if(head == null) {
			return -1;
		}
		int start = 0;
		int end =size;
		while(start <= end) {
			int mid = (start + end)/2;
			if(this.get(mid) == key) {
				return mid;
			}
			else if (this.get(mid) < key) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}	
		}
		return -1;
	}
    public Node binarySearch(int key) {
        if (head == null) {
            return null;
        }
        Node start = head;
        Node end = null;
        while (end == null || end.getNext() != start);{
            Node mid = getMiddle(start, end);
            if (mid == null) {
                return null;
            }
            if (mid.getData() == key) {
                return mid;
            } else if (mid.getData() < key) {
                start = mid.getNext();
            } else {
                end = mid;
            }
        } 

        return null;
    }

    private Node getMiddle(Node start, Node end) {
        if (start == null) {
            return null;
        }

        Node slow = start;
        Node fast = start;

        while (fast != end && fast.getNext() != end && fast.getNext().getNext() != end) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow;
    }
    
    public int get(int index) {
    	if(index > size) {
    		return 0;
    	}
    	Node temp=head;
    	for(int i=0;i<index;i++) {
    		temp=temp.getNext();
    	}
    	return temp.getData();
    }
    
    public void set(int index, int data) {
		if (index > size) {
			return;
		}
		Node temp = head;
		for (int a = 0; a < index; a++) {
			temp = temp.getNext();
		}
		temp.setData(data);
	}
}
