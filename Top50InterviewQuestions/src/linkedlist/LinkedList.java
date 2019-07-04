package linkedlist;

import java.util.HashMap;
import java.util.Stack;

public class LinkedList {
	Node head;
	
	
	
	public static Node add(Node head, int number){
		Node root = head;
		if(root == null){
			root = new Node(number);
			return root;
		}else{
			Node temp = null;
			while(root!=null){
				temp = root;
				root = root.next;
			}
			temp.next = new Node(number);
			return head;
		}
		
	}
	
	public static void printLinkedList(Node head){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static Node reverseLinkedList(Node curr, Node prev){
		if(curr == null)
			return prev;
		Node temp = curr.next;
		curr.next = prev;
		return reverseLinkedList(temp, curr);
	}
	
	public static Node reverseIteratively(Node head){
		Node next = null;
		Node prev = null;
		Node curr = head;
		
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
	
	
	public static Node removeDuplicates(Node head){
		int count = 0;
		Node point1 = head;
		while(point1!=null && point1.next!=null){
			Node point2 = point1.next;
			while(point2.next!=null){
				if(point1.data == point2.data){
					point1.next = point2.next;
				}
				count++;
				point2 = point2.next;
			}
			point1 = point1.next;
		}
		
		
		
		System.out.println("Solving with 2 loops lead to iterations: " + count);
		return head;
	}
	
	
	public static Node removeDuplicatesWithHashMap(Node head){
		int count = 0;
		Node point1 = head;
		HashMap<Integer,Integer> nodeCount = new HashMap<Integer,Integer>();
		while(point1!=null){
			if(nodeCount.containsKey(point1.data)){
				point1.next = point1.next.next;
			}
			nodeCount.put(point1.data, 1);
			point1 = point1.next;
			count++;
		}
		
		System.out.println("Solving with 1 loop leads to iteration: "+ count);
		return head;
	}
	
	
	public static int getSizeLinkedList(Node head){
		if(head == null) return 0;
		else return getSizeLinkedList(head.next)+1;
	}
	
	
	public static int getNthNode(Node head, int n){
		int data = -1;
		int count = 0;
		boolean reachedN = false;
		Node temp=head;
		while(head!=null){
			if(reachedN) temp=temp.next;
			head = head.next;
			count++;
			if(reachedN == false && count >= n) reachedN = true;
		}
		if(temp!=null) return temp.data;
		return data;
	}
	
	public static java.util.LinkedList<Integer> calculateSum(Node list1, Node list2){
		Stack<Integer> s1 = new Stack();
		Stack<Integer> s2 = new Stack();
		while(list1!=null){
			s1.add(list1.data);
			list1=list1.next;
		}
		while(list2!=null){
			s2.add(list2.data);
			list2=list2.next;
		}
		
		int carry = 0;
		int sum = 0;
		
		Stack<Integer> s3 = new Stack();
		while(!s1.isEmpty() || !s2.isEmpty()){
			int s1Num = s1.isEmpty() ? 0 : s1.pop();
			int s2Num = s2.isEmpty() ? 0 : s2.pop();
			sum = (s1Num + s2Num + carry) % 10;
			carry = (s1Num + s2Num + carry) / 10;
			s3.add(sum);
		}
		java.util.LinkedList<Integer> newList = new java.util.LinkedList<Integer>();
		while(!s3.isEmpty()){
			newList.add(s3.pop());
		}
		
		return newList;
		
	}
}
