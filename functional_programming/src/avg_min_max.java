import java.util.*;

public class avg_min_max {
	public static void main(String[] args) {
		int[] numberArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};;
		Arrays.stream(numberArray);
		Arrays.stream(numberArray).sum();
		Arrays.stream(numberArray).average();
		Arrays.stream(numberArray).min();
		Arrays.stream(numberArray).max();
	}
}
