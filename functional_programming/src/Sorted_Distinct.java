import java.util.*;

public class Sorted_Distinct {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 12, 9, 13, 4, 4, 6, 2, 4, 12, 15);
		numbers.stream().distinct().forEach(System.out::println);
		numbers.stream().sorted().forEach(System.out::println);;
		numbers.stream().distinct().sorted().forEach(System.out::println);
		numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		numbers.stream().sorted(Comparator.comparing(x->x.intValue())).forEach(System.out::println);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		courses.stream().sorted().forEach(System.out::println);
		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);

	}
}
