import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Function;

/**
 * This class is used to express demonstrate most of the functional  Interfaces in java.uti.function package
 * 
 * 
 * @author Sumith
 *
 */

public class Lambda3 {
	public static void main(String[] args) {
	
		// 1. Consumer
		Consumer<String> consumer=s->System.out.println("hello"+s);
		consumer.accept("Sumit");
		
		// 2. Supplier
		Supplier<String> supplier=()->"Sumit";
		String result=supplier.get();
		System.out.println("result from supplier:"+result);
		
		// 3. Predicate
		Predicate<String> predicate=s->{
			if(s.equals("Sumit")){
				return true;
			}
			return false;
		};
		boolean resultPredicate_p=predicate.test("Sumit");
		System.out.println("Predicate result="+resultPredicate_p);
		
		boolean resultPredicate_n=predicate.test("Sumith");
		System.out.println("Predicate result="+resultPredicate_n);
		
		// 4. Function
		Function<String,String>function=s->{
			return (s+"2016");
			};
		String resultFunction=function.apply("Sumit");
		System.out.println("function result:"+resultFunction);
		
		// 5. Unary Operator , where input parameter and return type are same
		UnaryOperator<Integer> unary=i->i+10;
		int resultUnary=unary.apply(100);
		System.out.println("Unary Operator Result:"+resultUnary);
	}

}
