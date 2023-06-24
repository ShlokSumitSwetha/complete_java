package map;

import java.util.*;

public class MapImmutableMain {
	public static void main(String[] args) {

		/** 1. Adding values**/
		Map<Integer, String> mapValues = Map.of(1,"one",2, "two");
		System.out.println(mapValues);

		/** 2. Adding null values **/
		//Map<Integer, String> mapValues2 = Map.of(1,"one",null, "two");
		//System.out.println(mapValues2);

		/** 2. modifying values **/
		Map.Entry<String,Integer> maps= Map.entry("one", 1);
		maps.setValue(2); // UnsupportedOperation Exception.
	}
}
