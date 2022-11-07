
public class MyTestLinkedList {
	public static void main(String[] args) {
	
	//push test------------------------------------------------
	MyLinkedList MyLL1 = new MyLinkedList();
	MyLL1.pushToTail(2);
	MyLL1.pushToIndex(1, 44);
	
	MyLL1.pushToTail(5);
	MyLL1.pushToTail(3);
	MyLL1.pushToTail(17);
	MyLL1.pushToTail(21);
	
	MyLL1.pushToIndex(2, 55);	
	MyLL1.pushToIndex(1,75);

	MyLL1.print();
	System.out.println("push test END.");
	//push test------------------------------------------------
	
	//remove test----------------------------------------------
	MyLinkedList MyLL2 = new MyLinkedList();
	MyLL2.pushToTail(2);
	MyLL2.pushToTail(8);
	MyLL2.print();
	MyLL2.removeFirst();
	MyLL2.print();
	System.out.println("-----------------");
	
	MyLL2.pushToTail(5);
	MyLL2.pushToTail(3);
	MyLL2.pushToTail(44);
	MyLL2.print();
	MyLL2.remove(2);
	MyLL2.print();
	System.out.println("-----------------");
	
	MyLL2.removeFirst();
	MyLL2.print();
	
	System.out.println("-----------------");
	MyLL2.removeLast();
	MyLL2.print();
	

	System.out.println("remove test END.");
	
	//remove test----------------------------------------------
	
	
	
	//size test------------------------------------------------	
	System.out.println("size = " + MyLL1.getSize()); 
	//size test------------------------------------------------

	
	
		
	}
	
	
}
