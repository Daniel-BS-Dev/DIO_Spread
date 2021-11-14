package one.digital.innovation;

public class Main {
	
	public static void main(String[] args) {
		
		Pill pilha = new Pill();
		
		pilha.push(new Node(1));
		pilha.push(new Node(2));
		pilha.push(new Node(3));
		pilha.push(new Node(4));
		pilha.push(new Node(5));
		pilha.push(new Node(6));
		
		System.out.print(pilha);
		
		pilha.pop();
		
		System.out.print(pilha);
		
		System.out.print(pilha.top());
		
		System.out.print(pilha.isEmpty());
	}

}
