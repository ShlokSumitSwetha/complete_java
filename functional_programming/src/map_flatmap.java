import java.util.*;
import java.util.stream.*;

public class map_flatmap {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 12, 9, 13, 4, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

		courses.stream().map(x -> x.length()).collect(Collectors.toList());
		numbers.stream().map(x -> x*x).collect(Collectors.toList());
		courses.stream().map(course -> course.split(""))
						.collect(Collectors.toList());
		courses.stream().map(course -> course.split(""));
		courses.stream().peek(System.out::println)
				.filter(courses3 -> courses.size()==11)
				.map(String::toUpperCase)
				.peek(System.out::println).findFirst();;
		courses.stream().peek(System.out::println)
				.filter(courses3 -> courses.size()>11)
				.map(String::toUpperCase)
				.peek(System.out::println);

		courses.stream()
				.map(course -> course.split(""))
				.flatMap(Arrays::stream)
				.collect(Collectors.toList());
		courses.stream().map(course -> course.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList());

		List<String> courses2 = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		courses.stream().flatMap(course -> courses2.stream()
				.map(course2 -> List.of(course,course2)))
				.collect(Collectors.toList());
		courses.stream().flatMap(course -> courses2.stream()
				.map(course2 -> List.of(course,course2)))
				.filter(list -> list.get(0).equals(list.get(1)))
				.collect(Collectors.toList());
		courses.stream().flatMap(course -> courses2.stream()
				.map(course2 -> List.of(course,course2)))
				.filter(list -> !list.get(0).equals(list.get(1)))
				.collect(Collectors.toList());


	}
}
