import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		/**
		 * Predicate
		 */
		Predicate<Integer> isEvenPredicate3 = (Integer x) -> x % 2 == 0;
		Predicate<Integer> isEvenPredicate = x -> x%2==0;
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x%2==0;
			}
		};

		/**
		 * Function
		 */

		Function<Integer, Integer> squareFunction = x -> x * x;
		Function<Integer, String> stringOutpuFunction = x -> x + " ";
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return x*x;
			}

		};

		/**
		 * Consumer
		 */

		Consumer<Integer> sysoutConsumer = x -> System.out.println(x);
		Consumer<Integer> sysoutConsumer2 = System.out::println;

		Consumer<Integer> sysoutConsumer3 = new Consumer<Integer>() {
			public void accept(Integer x) {
				System.out.println(x);
			}
		};

		numbers.stream()
				.filter(isEvenPredicate2)
				.map(squareFunction2)
				.forEach(sysoutConsumer2);

		/**
		 * BinaryOperator
		 */

		BinaryOperator<Integer> sumBinaryOperator2 = Integer::sum;
		BinaryOperator<Integer> op = BinaryOperator.maxBy(Comparator.reverseOrder());
		BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;
		BinaryOperator<Integer> sumBinaryOperator4 = (x, y) -> x + y;
		BinaryOperator<Integer> sumBinaryOperator3 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer a, Integer b) {
				return a + b;
			}
		};

		int sum = numbers.stream().reduce(0, sumBinaryOperator);

		//No input > Return Something
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
		System.out.println(randomIntegerSupplier.get());

		/**
		 * Unaryoperator
		 */
		UnaryOperator<Integer> unaryOperator = x -> 3 * x;
		System.out.println(unaryOperator.apply(10));

		/**
		 * BiPredicate
		 */
		BiPredicate<Integer, String> biPredicate = (number,str) -> {
			return number<10 && str.length()>5;
		};
		
		System.out.println(biPredicate.test(10, "in28minutes"));

		/**
		 * BiFunction
		 */
		BiFunction<Integer, String, String> biFunction = (number,str) -> {
			return number + " " + str;
		};
		
		System.out.println(biFunction.apply(15, "in28minutes"));

		/**
		 * BiConsumer
		 */
		BiConsumer<Integer, String> biConsumer = (s1,s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		
		biConsumer.accept(25, "in28Minutes");

		IntBinaryOperator intBinaryOperator = (x,y) -> x + y;
	}
}
