import javax.swing.plaf.nimbus.State;
import java.util.Stack;

public class LinkedList {
    private Node head;
    private int size=0;

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

    public boolean insert(int data, int position) {
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
    
    //Q.1 Java Program To Merge A Linked List Into Another Linked List At Alternate Positions
    public static void merge(LinkedList l1,LinkedList l2) {
    	LinkedList l = new LinkedList();
    	Node n1=l1.getHead();
    	Node n2=l2.getHead();
    	while(n1 != null || n2 != null) {
    	if(n1 != null) {
    		l.insert(n1.getData());
    	}
    	n1=n1.getNext();
    	if(n2 != null) {
    		l.insert(n2.getData());
    	}
    	n2=n2.getNext();
    	}
    	l.display();
    }
    
    //Q.2 How do you find the middle element of a singly linked list in one pass? 
    public void findMiddleElement() {
    	Node n1=head;
    	Node n2=head;
    	if(head == null) {
    		System.out.println("List is Empty");
    	}
    	
    	if(head.getNext()==null) {
    		System.out.println("Middle element of list is "+head.getData());
    	}
    	
    	while(n2.getNext() != null && n2 != null) {
    		n1=n1.getNext();
    		n2=n2.getNext().getNext();
    	}
    	System.out.println("Middle Element of list is "+n1.getData());
    	
    }
    
    //Q.3 How do you reverse a singly linked list without recursion?
    public void reverse() {
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
    
    //Q.4 How are duplicate nodes removed in an unsorted linked list?
    public void removeDuplicate() {
    	Node temp=head;
    	while(temp != null && temp.getNext() != null) {
    		if(temp.getData()==temp.getNext().getData()) {
    			temp=temp.getNext().getNext();
    		}
    		else {
    			if(temp.getNext() != null) {
    			temp=temp.getNext();
    		}
    		}
    	}
    	return;
    }
}
