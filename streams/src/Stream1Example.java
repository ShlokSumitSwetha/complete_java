import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream1Example {

	public static void main(String[] args) {

		List<String> strings=new ArrayList<String>();
		strings.add("sumith");
		strings.add("vinit");
		strings.add("swetha");
		strings.add("shlok");
		strings.add("mummy");
		strings.add("papa");
		
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(4);
		integers.add(40);
		integers.add(80);
		integers.add(48);
		integers.add(75);
		integers.add(25);
		
		// 1. Any match in the collection of Strings
		boolean result=strings.stream()
							  .anyMatch(t->t.equals("shlok"));
		System.out.println("Exists in the Collection:"+result);
	
	    // 2. Get new Collection which has values >40 from the given list	
		List<Integer>resultList= integers.stream()
				.filter(t->t>40)
				.collect(Collectors.toList());
		System.out.println(resultList);
		
		// 3. Display all the items in String and integers
		System.out.println("Displaying all the items in string list");
		strings.stream().forEach(t->System.out.println(t));
		
		System.out.println("Displaying all the items in integer list");
		integers.stream().forEach(t->System.out.println(t));
		
		// 4. Square of numbers
		List<Integer> test1=Arrays.asList();
		List<Integer>result2=test1.stream().map(t->t*t).distinct().collect(Collectors.toList());
		result2.stream().forEach(t->System.out.println(t));
		
		// 5. Limit of list
		Random random =new Random();
		random.ints().limit(2).forEach(System.out::println);
		// 6. convert to string and add ',' after each element
		 String joined = integers.stream()
                 .map(Object::toString)
                 .collect(Collectors.joining(", "));
		 
		 System.out.println(joined);
		 
		// 7. Reduce operation which add's all the elements and returns the sum
		 List<Integer> numbers  = Arrays.asList(1, 2, 3, 4, 5);
		    int sum = numbers.stream().reduce(0, Integer::sum); // seed=0 
		    System.out.println(sum);
		
		
	}

	
	
	
}
