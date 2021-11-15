package dio.com.entities;

public class CircularList<T> {
	
	private Node<T> head;
	private Node<T> syrup;
	private int sizeList;
	
	public CircularList() {
		this.head = null;
		this.syrup = null;
		this.sizeList = 0;
	}
	
	public int size() {
		return this.sizeList;
	}
	
	public boolean isEmpty() {
		return this.sizeList == 0 ? true : false;
	}

}
