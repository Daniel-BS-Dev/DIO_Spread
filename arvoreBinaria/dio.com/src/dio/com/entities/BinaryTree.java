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

	@Override
	public String toString() {
		return "BinaryNode " + content;
	}
	
	

}
