package dio.com.entities;

public class Node {
	
	private Object object;
	private Node referenceNode;
	
	public Node() {
	
	}

	public Node(Object object) {
		this.object = object;
		this.referenceNode = null;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Node getReferenceNode() {
		return referenceNode;
	}

	public void setReferenceNode(Node referenceNode) {
		this.referenceNode = referenceNode;
	}

	@Override
	public String toString() {
		return "Node: " + object;
	}
	
	
	
	

}
