import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class main {
	public static void main(String[] args) {


		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		List<String> courses2 = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

		IntStream.range(1,10);
		IntStream.range(1,10).sum();
		IntStream.rangeClosed(1,10).sum();
		IntStream.rangeClosed(1,50).reduce(1, (x,y)->x*y);
		LongStream.rangeClosed(1,50).reduce(1, (x,y)->x*y);
		LongStream.rangeClosed(1,50).reduce(1L, (x,y)->x*y);
		LongStream.rangeClosed(1,10).reduce(1, (x,y)->x*y);
		LongStream.rangeClosed(1,20).reduce(1, (x,y)->x*y);
		LongStream.rangeClosed(1,40).reduce(1, (x,y)->x*y);
		LongStream.rangeClosed(1,50)
				.mapToObj(BigInteger::valueOf)
				.reduce(BigInteger.ONE, BigInteger::multiply);

		courses.stream().collect(Collectors.joining(" "));
		courses.stream().collect(Collectors.joining(","));
		courses.stream().flatMap(course -> courses2.stream()
				.filter(course2 -> course2.length()==course.length())
				.map(course2 -> List.of(course,course2)))
				.filter(list -> !list.get(0).equals(list.get(1)))
				.collect(Collectors.toList());

		courses.stream().filter(course -> courses.size()>11)
				.map(String::toUpperCase)
				.findFirst();

		List<String> modifyableCourses = new ArrayList(courses);
		modifyableCourses.replaceAll(str -> str.toUpperCase());
		modifyableCourses.removeIf(course -> course.length()<6);
	}
}
