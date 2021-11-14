package one.digital.innovation;

public class Node {
	
	private int data;
	private Node referenceNodeNext;
	
	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getReferenceNodeNext() {
		return referenceNodeNext;
	}

	public void setReferenceNodeNext(Node referenceNodeNext) {
		this.referenceNodeNext = referenceNodeNext;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

	
	
	

}
