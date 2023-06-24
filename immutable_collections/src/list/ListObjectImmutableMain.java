package list;

import java.util.*;

public class ListObjectImmutableMain {
	public static void main(String[] args) {

		Student st1= new Student("sumith1", 12);
		Student st2= new Student("sumith2", 13);

		List<Student> students = new ArrayList<>();
		students.add(st2);
		students.add(st1);

		List<Student> studentsUnmodifiable = Collections.unmodifiableList(students);
		Student st3= new Student("sumith3", 14);
		students.add(st3);

		studentsUnmodifiable.stream().forEach((x)->System.out.println(x));

		List<Student> studentsImmutable = List.of(st1,st2);
		studentsImmutable.stream().forEach((x)->System.out.println(x));

	}
}
