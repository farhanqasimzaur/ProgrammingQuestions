package linkedlist;

public class SumUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		
		
		LinkedList list2 = new LinkedList();
		list2.head = new Node(6);
		
		LinkedList list3 = new LinkedList();
		java.util.LinkedList<Integer> newList = LinkedList.calculateSum(list1.head, list2.head);
		for(Integer intr : newList){
			System.out.print(intr);
		}
	}

}
