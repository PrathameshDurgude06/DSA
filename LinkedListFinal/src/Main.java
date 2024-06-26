public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.display();
        System.out.println("Sum of all elements:"+l1.sum());

        l1.insert(60, 1);
        l1.display();
        l1.insert(70, 4);
        l1.display();
        l1.insert(80, 8);
        l1.display();
        boolean isInserted =l1.insert(90, 10);
        System.out.println(isInserted);
        l1.display();

        l1.displayReverse();
        l1.displayReverse(l1.getHead());
       
        //l1.sort();
        //l1.bubbleSort();
        l1.bubbleSortNode();
        System.out.println();
        l1.display();
        l1.reverse();
        l1.display();

        l1.deleteByPosition(1);
        l1.display();
        l1.deleteByPosition(4);
        l1.display();
        l1.deleteByPosition(6);
        l1.display();
        l1.deleteByPosition(6);
        l1.display();

        /*l1.deleteByVal(80);
        l1.display();
        l1.deleteByVal(70);
        l1.display();
        l1.deleteByVal(60);
        l1.display();
        l1.deleteByVal(80);
        l1.display();*/

        /*l1.insert(80, 4);
        l1.insert(80, 6);
        l1.display();

        while( l1.deleteByVal(80) )
            ;

        l1.display();*/
        System.out.println();
        l1.sort();
        System.out.println("Max element of list:"+l1.max());
        System.out.println("Min element of list:"+l1.min());
       
        System.out.println("Index of given key:"+l1.LinearSearch(70));
        System.out.println("Index of given key:"+l1.LinearSearch(60));
        System.out.println("Index of given key using BS:"+l1.binarySearch(70));
        System.out.println("Index of given key using BS:"+l1.binarySearch(60));
        l1.display();
        l1.displayReverse();

    }
}
