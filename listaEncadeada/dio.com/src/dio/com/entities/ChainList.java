package dio.com.entities;

public class ChainList<T> {

	private Node<T> inputReference;

	public ChainList() {
		this.inputReference = null;
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
