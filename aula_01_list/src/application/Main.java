package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Marco");
		list.add("Alex");
		list.add("Bob");
		list.add(2, "Rebeca");
		list.add("Anna");
		
		System.out.println(list.size());
				
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("--------------------------------");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("------------------------");
		System.out.println("Idenx of Bob: " + list.indexOf("Bob"));
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String name : result) {
			System.out.println(name);
		}
		
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
