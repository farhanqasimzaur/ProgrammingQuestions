package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class BinaryTree {

	Node root;
	
	public void add(int data){
		root = addNode(this.root, data);
	}
	
	private Node addNode(Node head, int data){
		if(head == null){
			head = new Node(data);
			return head;
		}
		if(data < head.data){
			head.left = addNode(head.left, data);
		}else if(data > head.data){
			head.right = addNode(head.right, data);
		}else{
			return head;
		}
		return head;
	}
	
	public static void inOrderPrint(Node root){
		if(root == null) return;
		inOrderPrint(root.left);
		System.out.println(root.data);
		inOrderPrint(root.right);
		
		return;
	}
	
	public static void preOrderPrint(Node root){
		if(root == null) return;
		System.out.println(root.data);
		preOrderPrint(root.left);
		preOrderPrint(root.right);
		
		
		return;
	}
	
	public static void postOrderPrint(Node root){
		if(root == null) return;
		
		postOrderPrint(root.left);
		postOrderPrint(root.right);
		System.out.println(root.data);
		
		
		return;
	}
	
	public static void levelOrderPrint(Node root){
		Queue<Node> nodeQueue = new LinkedList<Node>();
		if(root!=null){
			nodeQueue.add(root);
			while(!nodeQueue.isEmpty()){
				Node temp = nodeQueue.poll();
				System.out.println(temp.data);
				if(temp.left!=null) nodeQueue.add(temp.left);
				if(temp.right!=null) nodeQueue.add(temp.right);
			}
		}
	}
	
	public static void iterativeInOrderPrint(Node root){
		Stack<Node> nodeStack = new Stack<Node>();
		if(root!=null){
			nodeStack.add(root);
			while(!nodeStack.isEmpty()){
				Node temp = nodeStack.peek();
				Node leftTemp = temp;
				while(leftTemp!=null){
					nodeStack.add(leftTemp.left);
					leftTemp = leftTemp.left;
				}
				System.out.println();
				Node rightTemp = temp;
				while(rightTemp!=null){
					nodeStack.add(rightTemp.right);
					rightTemp = rightTemp.right;
				}
				
			}
		}
	}
	
	public static void iterativePreOrderPrint(Node root){
		Stack<Node> nodeStack = new Stack<Node>();
		if(root!=null){
			nodeStack.add(root);
			Node temp = root;
			while(!nodeStack.isEmpty()){
				System.out.println(nodeStack.peek().data);
				temp = nodeStack.pop();
				if(temp.right!=null) nodeStack.add(temp.right);
				if(temp.left!=null) nodeStack.add(temp.left);
				
			}
		}
	}
	
	public static void iterativePostOrderPrint(Node root){
		Stack<Node> nodeStack = new Stack<Node>();
		if(root!=null){
			nodeStack.add(root);
			Node temp = root;
			while(!nodeStack.isEmpty()){
				
				temp = nodeStack.pop();
				if(temp.right!=null) nodeStack.add(temp.right);
				if(temp.left!=null) nodeStack.add(temp.left);
				System.out.println(temp.data);
				
			}
		}
	}
	
	public static void printLeafNodes(Node root){
		if(root == null) return;
		if(root.left == null && root.right == null){
			System.out.println(root.data);
		}
		if(root.left!=null) printLeafNodes(root.left);
		if(root.right!=null) printLeafNodes(root.right);
	}
	
	public static int countLeafNodes(Node root){
		if(root == null) return 0;
		if(root.left == null && root.right == null){
			return 1;
		}else return countLeafNodes(root.left) + countLeafNodes(root.right);
	}
}
