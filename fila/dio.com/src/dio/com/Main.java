package dio.com;

import dio.com.entities.Node;
import dio.com.entities.Queue;

public class Main {
	
	public static void main(String[] args) {
		
		Queue myQueue = new Queue();
		
		myQueue.enqueue(new Node("First"));
		myQueue.enqueue(new Node("Second"));
		myQueue.enqueue(new Node("third"));
		myQueue.enqueue(new Node("Fourth"));
		myQueue.enqueue(new Node("Fifth"));
		myQueue.enqueue(new Node("Sexth"));
		
		System.out.println(myQueue);
		
		System.out.println(myQueue.dequeue());
		
		System.out.println(myQueue);
	}

}
