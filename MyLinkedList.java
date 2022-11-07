
import java.util.NoSuchElementException;

public class MyLinkedList {
	int size = 0;
	Node first = null;

	public MyLinkedList() {
		
	}
	
	int getSize() {
		return size;
	}
	void print() {
		if (size == 0) {
			System.out.println("size = 0");
		}
		else{
			System.out.println(first);                        
		}						
	}	
	Node getNode(int index) {
		Node currentNode = first;
		if (index != 1) {
		    for (int i = 1; i < size; i++) {
		    	if (index == i) {
		    		break;
		    	}
		    	currentNode = currentNode.next;
			}		
		}
		return currentNode;
	}
	
	private boolean checkNotNullNotFirst(int index) {
		if ((size == 0) || (index == 1)) {
			return false;
		}
		return true;  
	}
	
	//push-------------------------------------------------------------------------
	void pushToIndex(int index, int data) {
		if (checkNotNullNotFirst(index)) {
		   final Node сurrentNode = getNode(index);
		   final Node newNode = new Node(data, сurrentNode);
		   Node previousCurrentNode = getNode(index-1);
		   
		   previousCurrentNode.next = newNode;			
		}
		
		if (size == 0) {
			final Node newNode = new Node(data, null);
			first = newNode;
		}
		
		if ((size == 1) || (index ==1)) {
			final Node newNode = new Node(data, first);
			first = newNode;
		}
	
		size++;	
	}
	void pushToTail(int data) {
		if (size == 0) {
			first = new Node(data, null);
		}
		else {
			final Node newNode = new Node(data, null);
			Node  сurrentNode = getNode(size);
			сurrentNode.next = newNode;
		}	
		size++;	
	}
	void pushToHead(int data) {
		 pushToIndex(1, data);
	}
	//push-------------------------------------------------------------------------
	
	//remove-----------------------------------------------------------------------
	void remove(int index) {
		if (checkNotNullNotFirst(index)) {
           //Node сurrentNode = getNode(index);
 		   Node previousCurrentNode = getNode(index-1);
 		   
 		   if (index != size) {    //not last Node
 		      Node AfterCurrentNode = getNode(index+1);
 		      previousCurrentNode.next = AfterCurrentNode;	  
 		   }else {
 			  previousCurrentNode.next = null; 
 		   }
        }
		
		if (size == 0) {
			 throw new NoSuchElementException();
		}
			
		if (size == 1)  {
		   first = null;
		}else if (index == 1){
			Node AfterCurrentNode = getNode(index+1);
			first = AfterCurrentNode;
		}
		
        size--;	
 
    }
	void removeFirst() {
		 remove(1);
	}
    void removeLast() {
    	 remove(size);	
	}
	
	//remove-----------------------------------------------------------------------
	
}
