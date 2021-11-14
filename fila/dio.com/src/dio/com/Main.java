package dio.com;

import dio.com.entities.Queue;

public class Main {
	
	public static void main(String[] args) {
		
		Queue<String> myQueue = new Queue<>();
		
		myQueue.enqueue("First");
		myQueue.enqueue("Second");
		myQueue.enqueue("third");
		myQueue.enqueue("Fourth");
		myQueue.enqueue("Fifth");
		myQueue.enqueue("Sexth");
		
		System.out.println(myQueue);
		
		System.out.println(myQueue.dequeue());
		
		System.out.println(myQueue);
	}

}
