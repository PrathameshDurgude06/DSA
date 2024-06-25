public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        LinkedList l2= new LinkedList();
        LinkedList l3= new LinkedList();

        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        System.out.println("First List:");
        l1.display();
        System.out.println();
        l2.insert(60);
        l2.insert(70);
        l2.insert(80);
        l2.insert(90);
        l2.insert(100);
        System.out.println("Second List");
        l2.display();
        System.out.println();
        System.out.println("Merge:");
        LinkedList.merge(l1,l2);
        System.out.println();
        l1.findMiddleElement();
        System.out.println();
        System.out.println("Reverse:");
        l1.reverse();
        System.out.println();
        
        l3.insert(10);
        l3.insert(20);
        l3.insert(20);
        l3.insert(40);
        l3.insert(50);
        l3.removeDuplicate();
        l3.display();
        

    }
}
