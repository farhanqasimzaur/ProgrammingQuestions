package linkedlist;

public class FindNthNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.head = new Node(5);
		list.head.next = new Node(4);
		list.head.next.next = new Node(8);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next = new Node(9);
		list.head.next.next.next.next.next = new Node(9);
		list.head.next.next.next.next.next.next = new Node(15);
		list.head.next.next.next.next.next.next.next = new Node(12);
		
		System.out.println(LinkedList.getNthNode(list.head, 3));
	}

}
