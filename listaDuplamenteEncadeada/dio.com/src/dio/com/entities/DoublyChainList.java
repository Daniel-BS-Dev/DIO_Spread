package dio.com.entities;

public class DoublyChainList<T> {
	
	private DoubleNode<T> firstNode;
	private DoubleNode<T> lastNode;
	
	private int sizeList;
	
	public DoublyChainList() {
		this.firstNode = null;
		this.lastNode = null;
		this.sizeList = 0;
	}
	
	public void add(int index, T element) {
		DoubleNode<T> auxNode = getNode(index);
		DoubleNode<T> newNode = new DoubleNode<>(element);
		newNode.setNextNode(auxNode);
		
		if(newNode.getNextNode() != null) {
			newNode.setPreviousNode(auxNode.getPreviousNode());
			newNode.getNextNode().setPreviousNode(newNode);
		}else {
			newNode.setPreviousNode(lastNode);
			lastNode = newNode;
		}
		
		if(index == 0) {
			firstNode = newNode;
		}else {
			newNode.getPreviousNode().setNextNode(newNode);;
			
		}
		sizeList++;
	}
	
	public void add(T element) {
		DoubleNode<T> newNode = new DoubleNode<>(element);
		newNode.setNextNode(null);
		newNode.setPreviousNode(lastNode);
		
		if(lastNode == null) {
			firstNode = newNode;
		}
		if(lastNode != null) {
			lastNode.setNextNode(newNode);
		}
		
		lastNode = newNode;
		sizeList++;
	}
	
	public int size() {
		return this.sizeList;
	}
	
	public T get(int index) {
		return this.getNode(index).getContent();
	}
	
	private DoubleNode<T> getNode(int index){
		DoubleNode<T> auxNode = firstNode;
		
		for(int i=0; (i < index) && (auxNode != null); i++) {
			auxNode = auxNode.getNextNode();
		}
		
		return auxNode;
	}

}
