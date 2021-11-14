package one.digital.innovation;

public class Pill {
	
	private Node referenceNode;

	public Pill() {
		this.referenceNode = null;
	}
	
	public Node pop() {
		if(!this.isEmpty()) {
			Node popNode = referenceNode;
			referenceNode = referenceNode.getReferenceNodeNext();
		    return popNode;
		}
		return null;
	}
	
	public void push(Node newNode) {
		Node Aux = referenceNode;
		referenceNode = newNode;
		referenceNode.setReferenceNodeNext(Aux);
		
	}
	
	public Node top() {
		return referenceNode;
	}
	
	public boolean isEmpty() {
		return referenceNode == null ? true : false;
	}

	@Override
	public String toString() {
	
		String stringReturn = "---------------\n";
		stringReturn += "      Pilha\n";
		stringReturn += "---------------\n";
		
		Node noAux = referenceNode;
		
		while(true) {
			if(noAux != null) {
				stringReturn += "Node "+ noAux.getData() +"\n";
			    noAux = noAux.getReferenceNodeNext();
			}else {
				break;
			}
		}
	           stringReturn += "=============\n";
				return stringReturn;
	}
	
	

}
