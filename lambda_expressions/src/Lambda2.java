import java.util.Date;

/**
 * Below is an example of different return types int,double,long,boolean,date, string
 * 
 * @author Sumith
 *
 */

// int return type
@FunctionalInterface
interface Interface_Int {
	public int addition(int a, int b);
}

// double return type
@FunctionalInterface
interface Interface_Double {
	public double addition(double a, double b);
}

// long return type
@FunctionalInterface
interface Interface_Long {
	public long addition(long a, long b);
}

// boolean return type
@FunctionalInterface
interface Interface_Boolean {
	public boolean isBoolean();
}

// date return type
@FunctionalInterface
interface Interface_Date {
	public Date printDate();
}

// string return type
@FunctionalInterface
interface Interface_String {
	public String hello(String s);
}


//string return type with multiple statements
@FunctionalInterface
interface Interface_String_multiple {
	public String hello_multiple(String s);
}

public class Lambda2 {
	public static void main(String[] args) {
		Interface_Int intReturn=(s1,s2)->s1+s2;
		Interface_Double doubleReturn=(s1,s2)->s1+s2;
		Interface_Long longReturn=(s1,s2)->s1+s2;
		Interface_Boolean booleanReturn=()->true;
		Interface_Date dateReturn=()->new Date();
		
		System.out.println(intReturn.addition(10, 20));
		System.out.println(doubleReturn.addition(10.1, 20.3));
		System.out.println(longReturn.addition(24, 6));
		System.out.println(booleanReturn.isBoolean());
		System.out.println(dateReturn.printDate());
	}
}
