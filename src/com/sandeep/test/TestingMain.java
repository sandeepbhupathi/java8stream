package com.sandeep.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestingMain {

	public static void main(String[] args) {
		List<Person> persons =
			    Arrays.asList(
			        new Person("Max", 18),
			        new Person("Peter", 23),
			        new Person("Pamela", 23),
			        new Person("David", 12));
		
		List<NewPerson> newPer = new ArrayList<NewPerson>();
		
		Map<String, List<Person>> personsByAge = persons
			    .stream()
			    .collect(Collectors.groupingBy(p -> p.name));

			personsByAge
			    .forEach((age, p) -> {
			    	p.forEach((p1)->{
			    		newPer.add(
				    			new NewPerson(p1.getName(),p1.getAge(),p1.getAge()+p1.getName()));
			    	});
			    	
			    });
			
			newPer.forEach((p)->{
				System.out.println(p.toString());
			});
			
			List<Person> personsList = IntStream.range(0, newPer.size()).mapToObj(i -> 
			new Person(newPer.get(i).getName(),newPer.get(i).getAge())).collect(Collectors.toList());
			
			Map<Integer, String> map = persons
				    .stream()
				    .collect(Collectors.toMap(
				        p -> p.age,
				        p -> p.name,
				        (name1, name2) -> name1 + ";" + name2));
			
	}
}
