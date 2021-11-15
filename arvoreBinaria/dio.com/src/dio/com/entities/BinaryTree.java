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
			System.out.print(currentNode.getContent()+ ", ");
			showInOrder(currentNode.getRightNode());
		}
	}
	
	public void showInOrder() {
		System.out.print("\n Exibindo em ordem ");
		showInOrder(this.root);
	}

	private void showPosOrder(BinaryNode<T> currentNode) {
		if(currentNode != null) {
			showPosOrder(currentNode.getLeftNode());
			showPosOrder(currentNode.getRightNode());
			System.out.print(currentNode.getContent()+ ", ");
		}
	}
	
	public void showPosOrder() {
		System.out.print("\n Exibindo pos ordem ");
		showPosOrder(this.root);
	}
	
	private void showPreOrder(BinaryNode<T> currentNode) {
		if(currentNode != null) {
			System.out.print(currentNode.getContent()+ ", ");
			showPreOrder(currentNode.getLeftNode());
			showPreOrder(currentNode.getRightNode());
			
		}
	}
	
	public void showPreOrder() {
		System.out.println("\n Exibindo pre ordem ");
		showPreOrder(this.root);
	}
	
	public void remove(T content) {
		try {
			BinaryNode<T> currentNode = this.root;
			BinaryNode<T> fatherNode = null;
			BinaryNode<T> childNode = null;
			BinaryNode<T> temporaryNode = null;
			
			while(currentNode != null && !currentNode.getContent().equals(content)) {
				fatherNode = currentNode;
				if(content.compareTo(currentNode.getContent()) < 0) {
					currentNode = currentNode.getLeftNode();
				}else {
					currentNode = currentNode.getRightNode();
				}
			}
			
			if(currentNode == null) {
				System.out.println("Conteudo não encontrado. bloco try");
			}
			
			if(fatherNode == null) {
				if(currentNode.getRightNode() == null) {
					this.root = currentNode.getLeftNode();
				}else if(currentNode.getLeftNode() == null){
					this.root = currentNode.getRightNode();
				}else {
					for(temporaryNode = currentNode, childNode = currentNode.getLeftNode();
							childNode.getRightNode() != null;
							temporaryNode =childNode, childNode = childNode.getLeftNode()
							) {
						
						if(childNode != currentNode.getLeftNode()) {
							temporaryNode.setRightNode(childNode.getLeftNode());
							childNode.setLeftNode(root.getLeftNode());
						}
						
					}
					childNode.setRightNode(root.getRightNode());
					root = childNode;
				}
				
			}else if(currentNode.getRightNode() == null) {
				if(fatherNode.getLeftNode() == currentNode) {
					fatherNode.setLeftNode(currentNode.getLeftNode());
				}else {
					fatherNode.setRightNode(currentNode.getLeftNode());
				}
				
			}else if(currentNode.getLeftNode() == null) {
				if(fatherNode.getLeftNode() == currentNode) {
					fatherNode.setLeftNode(currentNode.getRightNode());
				}else {
					fatherNode.setRightNode(currentNode.getRightNode());
				}
				
			}else {
				for(
						temporaryNode = currentNode, childNode = currentNode.getLeftNode();
						childNode.getRightNode() != null;
						temporaryNode = childNode, childNode = childNode.getRightNode()
						) {
					
					if(childNode != currentNode.getLeftNode()) {
						temporaryNode.setRightNode(childNode.getLeftNode());
						childNode.setLeftNode(currentNode.getLeftNode());
					}
					childNode.setRightNode(currentNode.getRightNode());
					if(fatherNode.getLeftNode() == currentNode) {
						fatherNode.setLeftNode(childNode);
					}else {
						fatherNode.setRightNode(childNode);
					}
				}
				
			}
			
		}catch(NullPointerException erro) {
			System.out.println("Conteudo não encontardoBloco Catch");
		}
	}
	
	@Override
	public String toString() {
		return "BinaryNode ";
	}
	
	

}
