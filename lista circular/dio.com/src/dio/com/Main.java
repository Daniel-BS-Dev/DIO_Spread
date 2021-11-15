package dio.com;

import dio.com.entities.CircularList;

public class Main {
	
	public static void main(String[] args) {
		
		CircularList<String> myCircularList = new CircularList<>();
	
		myCircularList.add("First");
		myCircularList.add("Second");
		myCircularList.add("Third");
		myCircularList.add("Fourth");
		myCircularList.add("Fifth");
	
		System.out.println(myCircularList);
		
		myCircularList.remove(0);
		
		System.out.println(myCircularList);
		
		System.out.println(myCircularList.get(3));
		
		System.out.println(myCircularList.size());
	}

}
