package set;

import java.util.*;

public class SetImmutableMain {
	public static void main(String[] args) {

		/** 1. Adding values**/
		Set<Integer> values1= Set.of(1,2,3);
		values1.add(4); //UnsupportedOperationException
		values1.remove(1); //UnsupportedOperationException

		/** 2. Adding null values**/
		 Set<Integer> values2= Set.of(1,2,3, null); // NullPointerException


		/** 3. Adding duplicate values**/
		 Set<Integer> values3= Set.of(1,2,1); // IllegalArgumentException
	}
}
