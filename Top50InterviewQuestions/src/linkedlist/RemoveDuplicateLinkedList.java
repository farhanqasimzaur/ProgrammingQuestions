package linkedlist;

public class RemoveDuplicateLinkedList {

	
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		
		list.head = new Node(5);
		list.head.next = new Node(4);
		list.head.next.next = new Node(8);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next = new Node(9);
		list.head.next.next.next.next.next = new Node(9);
		list.head.next.next.next.next.next.next = new Node(15);
		list.head.next.next.next.next.next.next.next = new Node(12);
		
		LinkedList newList = new LinkedList();
		
		newList.head = new Node(5);
		newList.head.next = new Node(4);
		newList.head.next.next = new Node(8);
		newList.head.next.next.next = new Node(2);
		newList.head.next.next.next.next = new Node(9);
		newList.head.next.next.next.next.next = new Node(9);
		newList.head.next.next.next.next.next.next = new Node(15);
		newList.head.next.next.next.next.next.next.next = new Node(12);
		newList.head.next.next.next.next.next.next.next.next = new Node(9);
		newList.head.next.next.next.next.next.next.next.next.next = new Node(9);
		newList.head.next.next.next.next.next.next.next.next.next.next = new Node(9);
		newList.head.next.next.next.next.next.next.next.next.next.next.next = new Node(9);
		
		
		LinkedList.removeDuplicates(list.head);
		
		LinkedList.printLinkedList(list.head);
		
		LinkedList.removeDuplicatesWithHashMap(list.head);
		
		LinkedList.printLinkedList(list.head);

	}	
}
