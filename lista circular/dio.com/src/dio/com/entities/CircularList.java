package dio.com.entities;

public class CircularList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int sizeList;
	
	public CircularList() {
		this.head = null;
		this.tail = null;
		this.sizeList = 0;
	}
	
	public int size() {
		return this.sizeList;
	}
	
	public boolean isEmpty() {
		return this.sizeList == 0 ? true : false;
	}

	private Node<T> getNode(int index){
		if(this.isEmpty()) 
			throw new IndexOutOfBoundsException("A lista esta vazia");
		if(index == 0) 
			return this.tail;
		
		Node<T> auxNode = this.tail;
		for(int i=0; (i < index) && (auxNode != null); i++) {
			auxNode = auxNode.getNextNode();
		}
		
		return auxNode;
	}
	
	public T get(int index){
		return this.getNode(index).getContent();
	}
	
	public void remove(int index) {
		if(index >= this.sizeList) 
			throw new IndexOutOfBoundsException("A lista esta vazia");
		
		Node<T> auxNode = tail;
		
		if(index == 0) {
			this.tail = this.tail.getNextNode();
			this.head.setNextNode(this.tail);
		}else if(index == 1) {
			this.tail.setNextNode(this.tail.getNextNode().getNextNode());
		}else {
			for(int i=0; i < index; i++) {
				auxNode = auxNode.getNextNode();
			}
			
			auxNode.setNextNode(auxNode.getNextNode().getNextNode());
		}
	}
}
