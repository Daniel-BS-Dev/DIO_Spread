package dio.com;

import dio.com.entities.DoublyChainList;

public class Main {
	
	public static void main(String[] args) {
		
		
		DoublyChainList<String> myDoublyChainList = new DoublyChainList<>();
	
		myDoublyChainList.add("first");
		myDoublyChainList.add("second");
		myDoublyChainList.add("third");
		myDoublyChainList.add("fourth");
		myDoublyChainList.add("fifth");
		
		System.out.println(myDoublyChainList);
	
		myDoublyChainList.remove(3);
		System.out.println(myDoublyChainList);
	}

}
