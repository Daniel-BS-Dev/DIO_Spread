package dio.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeMap {
	
  public static void main(String[] args) {
		
	  // primeiro string key, segundo value
	   Map<String, Integer> student = new HashMap<>();
		
	   student.put("Pedro", 24);
	   student.put("Daniel",25);
	   student.put("João",30);
	   student.put("Paulo",35);
		
		System.out.println(student);
		
		// return a chave
		System.out.println(student.keySet());
		
		//return os valores
		System.out.println(student.values());
		
		//criando uma lista de alunos
		List<Map<String, Integer>> listStudents = new ArrayList<>();
		
		listStudents.add(student);
		

		
		
		
	}

}
