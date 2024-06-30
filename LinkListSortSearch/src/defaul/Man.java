package defaul;

public class Man {

	public static void main(String[] args) {
		
		LinkList list = new LinkList();
		System.out.println("Hello world");
		for (int a = 10; a >= 0; a--) {
			list.addFirst(a);
		}
		list.display();

		System.out.println("List when the data added last");
		list.addLast(11);
		list.display();
		System.out.println("inserAt  then display");
		list.inserAt(3, 33);
		list.display();
		System.out.println(list.get(3));
		list.set(3, 44);
		list.deleteFirst();
		list.display();

		list.deleteLast();

		list.display();
		System.out.println("For searching : ");
		System.out.println(list.linerSer(44));
		System.out.println("After Sorting ");
		list.sort();
		list.display();
		System.out.println(list.binSer(6));

	}

}
