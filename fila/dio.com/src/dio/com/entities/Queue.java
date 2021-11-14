package dio.com.entities;

public class Queue {
	
	private Node referenceQueue;

	public Queue() {
		this.referenceQueue = null;
	}
	
	// enfileira
	public void enqueue(Node newNode) {
		newNode.setReferenceNode(referenceQueue);
		referenceQueue = newNode;
	}
	
	// primeiro da fila
	public Node first() {
		if(!this.isEmpty()) {
			Node firstNode = referenceQueue;
			while(true) {
				if(firstNode.getReferenceNode() != null) {
					firstNode = firstNode.getReferenceNode();
				}else {
					break;
				}
			}
			
			return firstNode;
		}
		return null;
	}

	
	// retorna o primeiro da fila e retira da fila
	public Node dequeue() {
		if(!this.isEmpty()) {
			Node firstNode = referenceQueue;
			Node noAux = referenceQueue;
			while(true) {
				if(firstNode.getReferenceNode() != null) {
					noAux = firstNode;
					firstNode = firstNode.getReferenceNode();
				}else {
					noAux.setReferenceNode(null);
					break;
				}
			}
			return firstNode;
		}
		return null;
	}
	
	
	//esta vazia
	public boolean isEmpty() {
		return referenceQueue == null ? true : false;
	}

	@Override
	public String toString() {
	   String stringReturn = "";
	   Node noAux = referenceQueue;
	   
	   if(referenceQueue != null) {
		   while(true) {
			   stringReturn += "Node "+ noAux.getObject() + " ---> ";
		       if(noAux.getReferenceNode() != null){
		    	   noAux = noAux.getReferenceNode();
		       }else {
		    	   stringReturn += "null";
		    	   break;
		       }
		   }
	   }else {
		   stringReturn = "null";
	   }
	   
	   
	   return stringReturn;
	}
	
	

}
