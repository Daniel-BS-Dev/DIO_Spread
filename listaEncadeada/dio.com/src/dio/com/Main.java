package dio.com;

import dio.com.entities.ChainList;

public class Main {
	
	public static void main(String[] args) {
		
	   ChainList<String> myChainList = new ChainList<>();
	   
	   myChainList.add("first");
	   myChainList.add("Second");
	   myChainList.add("Third");
	   myChainList.add("Fourth");
	   
	   
	   System.out.println(myChainList.get(0));
	   System.out.println(myChainList.get(1));
	   System.out.println(myChainList.get(2));
	   System.out.println(myChainList.get(3));
	   
	   System.out.println(myChainList.toString());
	   
	   System.out.println(myChainList.remove(3));
	   
	   System.out.println(myChainList.toString());
		
	}

}
