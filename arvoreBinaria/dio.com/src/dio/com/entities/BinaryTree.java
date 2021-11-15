package dio.com.entities;

public class BinaryTree<T extends Comparable<T>> {
	
	private BinaryNode<T> root;
	
	public BinaryTree() {
		this.root = null;

	}

	private BinaryNode<T> insert(BinaryNode<T> currentNode, BinaryNode<T> newNode){
		if(currentNode == null) {
			return newNode;
		}else if(newNode.getContent().compareTo(currentNode.getContent()) < 0){
			currentNode.setLeftNode(insert(currentNode.getLeftNode(), newNode));
		}else {
			currentNode.setLeftNode(insert(currentNode.getRightNode(), newNode));
		}
		
		return currentNode;
	}

	public void insert(T content) {
		BinaryNode<T> newNode = new BinaryNode(content);
	    root = insert(root, newNode);
	}
	
	private void showInOrder(BinaryNode<T> currentNode) {
		if(currentNode != null) {
			showInOrder(currentNode.getLeftNode());
			System.out.println(currentNode.getContent()+ ", ");
			showInOrder(currentNode.getRightNode());
		}
	}
	
	public void showInOrder() {
		System.out.println("\n Exibindo em ordem ");
		showInOrder(this.root);
	}

	private void showPosOrder(BinaryNode<T> currentNode) {
		if(currentNode != null) {
			showPosOrder(currentNode.getLeftNode());
			showPosOrder(currentNode.getRightNode());
			System.out.println(currentNode.getContent()+ ", ");
		}
	}
	
	public void showPosOrder() {
		System.out.println("\n Exibindo pos ordem ");
		showPosOrder(this.root);
	}
	
	private void showPreOrder(BinaryNode<T> currentNode) {
		if(currentNode != null) {
			System.out.println(currentNode.getContent()+ ", ");
			showPreOrder(currentNode.getLeftNode());
			showPreOrder(currentNode.getRightNode());
			
		}
	}
	
	public void showPreOrder() {
		System.out.println("\n Exibindo pre ordem ");
		showPreOrder(this.root);
	}
	@Override
	public String toString() {
		return "BinaryNode ";
	}
	
	

}
