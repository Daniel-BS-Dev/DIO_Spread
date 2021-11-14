package dio.com.entities;

public class Node<T> {
	
	private T content;
	private Node<T> nextNode;
	
	public Node() {
	
	}
	
	public Node(T content) {
		this.content = content;
		this.nextNode = null;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "content=" + content;
	}
	
	public String toStringEncadeado() {
		String str = "->" + content;
		
		if(nextNode != null) {
			str += "-> "+ nextNode.toString();
		}else {
			str += "-> null";
		}
		
		return str;
	}

	
	

}
