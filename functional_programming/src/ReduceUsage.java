import java.util.*;
import java.util.stream.*;

public class ReduceUsage {
	public static void main(String[] args) {
/*		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).reduce(0, Integer::sum);

		// find the sum
		System.out.println(numbers.stream().reduce(0, (x,y)->x+y));
		System.out.println(numbers.stream().reduce(0, (x,y)->x));
		System.out.println(numbers.stream().reduce(0, (x,y)->y));
		// find the greater no
		System.out.println(numbers.stream().reduce(0, (x,y)-> x>y ? x:y));
		System.out.println(numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y));
		System.out.println(numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? y:x));
		System.out.println(numbers.stream().reduce(Integer.MAX_VALUE, (x,y)-> x>y ? y:x));

		// wrong way  sum of squares and add them
		System.out.println(numbers.stream().reduce(0, (x,y) -> x*x + y*y));
		// correct way of squares and add the result
		System.out.println(numbers.stream().map(x -> x*x).reduce(0, Integer::sum));
		System.out.println(numbers.stream().map(x -> x*x*x).reduce(0, Integer::sum));
		// filter odd numbers and add them
		System.out.println(numbers.stream().filter(x -> x%2==1).reduce(0, Integer::sum));
		// filter even numbers and add them
		System.out.println(numbers.stream().filter(x -> x%2==0).reduce(0, Integer::sum));*/

		System.out.println(IntStream.rangeClosed(1,50).reduce(1, (x,y)->x*y));
		System.out.println(LongStream.rangeClosed(1,50).reduce(1, (x,y)->x*y));
		System.out.println(LongStream.rangeClosed(1,50).reduce(1L, (x,y)->x*y));
		System.out.println(LongStream.rangeClosed(1,10).reduce(1, (x,y)->x*y));
		System.out.println(LongStream.rangeClosed(1,20).reduce(1, (x,y)->x*y));


	}
}
