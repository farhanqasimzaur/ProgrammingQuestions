package linkedlist;

public class ReverseLinkedList {

	
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
		
		//LinkedList.printLinkedList(list.head);
		
		System.out.println("Linked List Size = "+ LinkedList.getSizeLinkedList(list.head));
		
		list.head = LinkedList.reverseLinkedList(list.head, null);
		
		LinkedList.printLinkedList(list.head);
		
		System.out.println("*******************************");
		
		list.head = LinkedList.reverseIteratively(list.head);
		
		LinkedList.printLinkedList(list.head);
		
		
	}
}
