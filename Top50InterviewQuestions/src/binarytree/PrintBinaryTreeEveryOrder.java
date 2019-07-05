package binarytree;

public class PrintBinaryTreeEveryOrder {
	
	public static void main(String args[]){
		
		BinaryTree tree = new BinaryTree();
		tree.add(5);
		tree.add(4);
		tree.add(6);
		tree.add(2);
		tree.add(4);
		tree.add(1);
		tree.add(8);
		tree.add(10);
		tree.add(7);
		tree.add(3);
		tree.add(9);
		tree.add(11);
		tree.add(15);
		tree.add(16);
		tree.add(13);
		/*System.out.println("IN Order");
		BinaryTree.inOrderPrint(tree.root);*/
		
		//BinaryTree.iterativeInOrderPrint(tree.root);
		
		/*System.out.println("Pre Order");
		BinaryTree.preOrderPrint(tree.root);
		System.out.println("BREAK");
		BinaryTree.iterativePreOrderPrint(tree.root);
		System.out.println("Post Order");
		
		BinaryTree.postOrderPrint(tree.root);
		System.out.println("BREAK");
		BinaryTree.iterativePostOrderPrint(tree.root);
		
		System.out.println("Level Order");
		
		BinaryTree.levelOrderPrint(tree.root);
		*/
		
		
		System.out.println("Print leaf nodes");
		BinaryTree.printLeafNodes(tree.root);
		System.out.println("Leaf Node Count: " + BinaryTree.countLeafNodes(tree.root));
		
	}

}
