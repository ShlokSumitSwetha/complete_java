package venkat_sub_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Person> persons=createPeople();
		
		// Filter the list for persons age>18 and display
		List<Person> resultpersons=persons.stream()
			   .filter(p->p.getAge()>18)
			   .collect(Collectors.toList());
		resultpersons.stream()
		.forEach(t->System.out.println(t));
		
		// Filter the list for persons >18 but display only names of persons.
		List<String> namepersons=persons.stream()
				   .filter(p->p.getAge()>18)
				   .map(p->p.getName())
				   .collect(Collectors.toList());
		namepersons.stream()
			.forEach(t->System.out.println(t));
	
	}
	
	public static List<Person> createPeople(){
		return Arrays.asList(
		new Person("Sumit", 29,SEX.MALE),
		new Person("Shlok", 6,SEX.MALE),
		new Person("Swetha", 25, SEX.FEMALE),
		new Person("Sumit", 20, SEX.MALE),
		new Person("Sumith", 6,SEX.MALE));
	}
}
