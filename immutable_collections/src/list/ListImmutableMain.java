package list;

import java.util.*;

public class ListImmutableMain {
	public static void main(String[] args) {

		List<Integer> mutableString = new ArrayList<>();
		mutableString.add(1);
		mutableString.add(2);
		mutableString.add(3);

		List<Integer> unmodifiableList= Collections.unmodifiableList(mutableString);
		mutableString.add(4);
		System.out.println("Immutable Collection:"+unmodifiableList);


		List<Integer> mutableString2 = Arrays.asList(1,2,3);
		List<Integer> unmodifiableList2= Collections.unmodifiableList(mutableString2);
		mutableString2.add(4);  //Throws UnsupportedOperationException
		System.out.println("Immutable Collection:"+unmodifiableList2);


		List<Integer> immutableList=List.copyOf(mutableString);
		mutableString.add(4); //Throws UnsupportedOperationException
		System.out.println(immutableList);

		List<Integer> integerList= List.of(1,2,3);
		 integerList.add(4); //Throws UnsupportedOperationException

		List<Integer> integerList2= List.of(1,2,null); //Throws NullPointerException

	}
}