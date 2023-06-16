import java.util.*;

public class BasicsGenerics {

    public static void main(String[] args) {

        /* Scenario 1: Unchecked Warning */
        //Raw use of parameterized class 'HashSet'
        //Unchecked assignment: 'java.util.HashSet' to 'java.util.Set<Generics.Box>'
        Set<Box> exaltation = new HashSet();



        // Throws error at run time
        // Exception in thread "main" java.lang.ArrayStoreException: java.lang.String
        Object[] objectArray = new Long[1];
        objectArray[0] = "I don't fit in"; // Throws error at run time


        // Required type: List<Object>
        // Provided: ArrayList<Long>
        //List<Object> ol = new ArrayList<Long>(); // Incompatible types at compile time
        //ol.add("I don't fit in");

        //All illegal
       // List<E> ol = new ArrayList<E>();
        // List<E> ol = new List<E>[];
        // E[]=  new E[];



        // Why generic array creation is illegal - won't compile!
       /* List<String>[] stringLists = new List<String>[2]; // (1)
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList;
        String s = stringLists[0].get(0);
       */

        //Problem
       // Box<String>[] b = new Box<String>[3];

        //Solution either of the below
        Box[] b1 = new Box[3];
        Box[] b2 =(Box []) new Object[3];






       }
}
