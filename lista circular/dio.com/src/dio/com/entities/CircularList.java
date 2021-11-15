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
		
		this.sizeList--;
	}
	
	public void add(T content) {
		Node<T> newNode = new Node<>(content);
		if(this.sizeList == 0) {
			this.head = newNode;
			this.tail = this.head;
			this.head.setNextNode(tail);
		}else {
			newNode.setNextNode(this.tail);
			this.head.setNextNode(newNode);
			this.tail = newNode;
		}
		
		this.sizeList++;
	}

	@Override
	public String toString() {
		String strReturn = " ";
		
		Node<T> auxNode = this.tail;
		
		for(int i=0; i < this.size(); i++) {
			strReturn += "Node "+ auxNode.getContent() + " -->";
			auxNode = auxNode.getNextNode();
		}
		strReturn += this.size() != 0 ? "(Retorn ao inicio)" : "[]";
		return strReturn;
	}
	
	
}
