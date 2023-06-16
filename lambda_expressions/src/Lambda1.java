/**
 * Below is an example with 0,1,2,3 parameters with no return values in it.
 * 
 * @author Sumith
 *
 */

// no parameter
@FunctionalInterface
interface Int1{
	void noParamMethod();
}

// one parameter
@FunctionalInterface
interface Int2{
	void oneParamMethod(String s);
}

// two parameter
@FunctionalInterface
interface Int3{
	void twoParamMethod(int a, String s);
}

//three parameter
@FunctionalInterface
interface Int4{
	void threeParamMethod(int a, String s, double d);
}
public class Lambda1 {
	public static void main(String[] args) {
		// Lambda Expressions for Different Parameters.
		Int1 no_Param=()-> System.out.println("No param Called");
		Int2 one_Param=s->System.out.println("Hello "+s);
		Int3 two_Param=(s1,s2)-> System.out.println("Hello "+s2+"Year"+s1);
		Int4 three_Param=(s1,s2,s3)->System.out.println("Hello "+s2+s1+s3);
		
		no_Param.noParamMethod();
		one_Param.oneParamMethod("Sumit");
		two_Param.twoParamMethod(2016, "Sumit");
		three_Param.threeParamMethod(2016, "sumit", 31.5);
	}
}
