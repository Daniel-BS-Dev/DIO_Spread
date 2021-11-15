package dio.com.entities;

public class ChainList<T> {

	private Node<T> inputReference;

	public ChainList() {
		this.inputReference = null;
	}
	
	public void add(T content) {
		Node<T> newNode = new Node<>(content);
		if(this.isEmpty()) {
			inputReference = newNode;
			return;
		}
		
		Node<T> noAux = inputReference;
		for(int i=0;i< this.size()-1; i++) {
			noAux = noAux.getNextNode();
		}
		noAux.setNextNode(newNode);
	}
	
	public T remove(int index) {
		Node<T> nodePivor = this.getNodeList(index);
		if(index == 0) {
			inputReference = nodePivor.getNextNode();
			return nodePivor.getContent();
		}
		
		Node<T> nodeBefore = getNodeList(index - 1);
		nodeBefore.setNextNode(nodePivor.getNextNode());
		return nodePivor.getContent();
		
	}
	
	public T get(int index) {
		return getNodeList(index).getContent();
	}
	
	private Node<T> getNodeList(int index){
		
		validIndex(index);
		
		Node<T> nodeAux = inputReference;
		Node<T> nodeReturn = null;
		
		for(int i=0; i< this.size()-1; i++) {
			nodeReturn = nodeAux;
			nodeAux = nodeAux.getNextNode();
		}
		
		return nodeReturn;
				
	}
	
	private void validIndex(int index) {
		if(index >= size()) {
			int lastIndex = size() - 1;
			throw new IndexOutOfBoundsException("index não exite na lista, tamanho da lista "+ lastIndex);
		}
	}
	
	public int size() {
		int sizeList = 0;
		Node<T> refAux = inputReference;
		while(true) {
			if(refAux != null) {
				sizeList ++;
				if(refAux.getNextNode() != null) {
					refAux = refAux.getNextNode();
				}else {
					break;
				}
			}else {
				break;
			}
		}
		return sizeList;
	}
	
	public boolean isEmpty() {
		return inputReference == null ? true : false;
	}
}
