import javax.swing.plaf.nimbus.State;

import java.util.Stack;

public class LinkedList {
    private Node head;
    private int size;

    public Node getHead() {
        return head;
    }

    public LinkedList() {
        head = null;
    }

    public boolean insert(int data) {

        Node newNode = new Node(data);
        if (newNode == null) {
            return false;
        }

        if (head == null) {
            head = newNode;
            size++;
            return true;  
        }

        Node temp = head;
        if(head.getData() == data) {
            return false;
        }
        while (temp.getNext() != null) {
            temp = temp.getNext();
            if(temp.getData() == data) {
                return false;
            }
        }

        temp.setNext(newNode);
        size++;
        return true;
    }

    public boolean insert(int data, int position){
        if(position <= 0 || (head == null && position > 1)) {
            return false;
        }

        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(position == 1) {
            newNode.setNext(head);
            head = newNode;
            size++;
            return true;
        }
        
        //locate prev node
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false;
            }
        }
        newNode.setNext(prev.getNext());
        prev.setNext(newNode);
        size++;
        return true;
    }

    public void displayReverse() {
        Stack<Node> stack = new Stack<Node>();
        Node temp = head;

        while(temp != null) {
            stack.push(temp);
            temp = temp.getNext();
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().getData() + " ");
        }
        System.out.println();
    }

    public void displayReverse(Node temp) {
        if(temp == null) {
            System.out.println();
            return;
        }
        displayReverse(temp.getNext());
        System.out.print(temp.getData() + " ");
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void reverse() {
        if(head == null || head.getNext() == null) {
            return;
        }

        Node n1 = head;
        Node n2 = head.getNext();

        while(n2 != null) {
            Node n3 = n2.getNext();
            n2.setNext(n1);
            n1 = n2;
            n2 = n3;
        }

        head.setNext(null);
        head = n1;
    }

    public boolean deleteByVal(int data) {
        if(head == null) {
            return false;
        }

        if(head.getData() == data) {
            head = head.getNext();
            size--;
            return true;
        }

        Node prev = head, del = head;
        while(del.getData() != data) {
            prev = del;
            del = del.getNext();
            if(del == null) {
                return false;
            }
        }

        prev.setNext(del.getNext());
        size--;
        return true;
    }

    public boolean deleteByPosition(int position) {
        if(head == null || position <= 0) {
            return false;
        }

        if(position == 1) {
            head = head.getNext();
            size--;
            return true;
        }

        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev.getNext() == null) {
                return false;
            }
        }

        Node del = prev.getNext();
        prev.setNext(del.getNext());
        size--;
        return true;
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
    
    public void sort() {
    	for(int i = 0 ; i<size; i++) {
			for(int j = i+1 ; j < size ; j++) {
				if(this.get(i) > this.get(j)) {
					int temp = this.get(i);
					this.set(i, this.get(j));
					this.set(j, temp);
				}
			}
    	}
    }
    
    public void bubbleSort() {
    	for(int i=0;i<size;i++)
    	{
    		int flag=0;
    		for(int j=0;j<size-1-i;j++) 
    		{
    			if(this.get(j)>this.get(j+1)) 
    			{
    				int temp=this.get(j);
    				this.set(j, this.get(j+1));
    				this.set(j+1, temp);
    				flag=1;
    			}
    		}
    		if(flag == 0) {
    			break;
    		}
    	}
    }
    

    public void bubbleSortNode() {
    	boolean swapped;
    	if(head == null) {
    		return;
    	}
    	do {
    		swapped=false;
    		Node current=head;
    		Node next=head.getNext();
    		while(next != null) {
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
    
    public int LinearSearch(int key) {
    	if(head == null) {
    		return -1;
    	}
    	Node temp=head;
    	int a=0;
    	while(temp != null) {
    		if(temp.getData()==key) {
    			return a;
    		}
    		a++;
    		temp=temp.getNext();
    	}
    	return -1;
    }
    
    public int binarySearch(int key) {
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
    public int max() {
    	int max=head.getData();
    	Node temp=head;
    	while(temp != null) {
    		if(temp.getData()> max) {
    			max=temp.getData();
    			
    		}
    		temp=temp.getNext();
    	}
    	return max;
    }
    
    public int min() {
    	int min=head.getData();
    	Node temp=head;
    	while(temp!=null) {
    		if(temp.getData()<min) {
    			min=temp.getData();
    		}
    		temp=temp.getNext();
    	}
    	return min;
    }
    
    public int sum() {
    	Node temp = head;
		int sum = 0;
		int count = 1;
		
		while(temp != null) {
			int ele = temp.getData();
			if(count % 2 == 0) {
				sum = sum + ele;
			}
			count++;
			temp = temp.getNext();
		}
    	return sum;
    }
}



	
