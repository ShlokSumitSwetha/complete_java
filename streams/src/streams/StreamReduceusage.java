package streams;

import entity.EmployeeDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceusage {
    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers1
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        int result2 = numbers1.stream().reduce(0, Integer::sum);

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result3 = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);
        String result4 = letters.stream().reduce("", String::concat);

        String result5 = letters
                .stream()
                .reduce(
                        "", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);
        System.out.println(computedAges);


        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

        List<String> words = Arrays.asList("corejava", "spring", "hibernate");

        int sum = 0;
        for (int no : numbers) {
            sum = sum + no;
        }
        System.out.println(sum);

        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResult);

        Integer maxvalue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxvalue);

        Integer maxvalueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxvalueWithMethodReference);


        String longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);

        //get employee whose grade A
        //get salary
        double avgSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

        System.out.println(avgSalary);

        double sumSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println(sumSalary);
    }
    }

