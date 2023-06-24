import java.util.stream.*;

public class Iterate {
	public static void main(String[] args) {
		// java8 infinite loop
		//Stream.iterate(1,x->x+1).forEach(System.out::println);
		Stream.iterate(1,x->x+1).limit(5).forEach(System.out::println);

		// java9
		Stream.iterate(1, x->x<10, x->x+1).forEach(System.out::println);
		IntStream.iterate(1, e -> e + 2).limit(10).sum();
		IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum();
		IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum();
		IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum();
		IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList());

	}
}
