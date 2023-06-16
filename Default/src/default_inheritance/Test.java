package default_inheritance;

public class Test implements A,B{

	public static void main(String[] args) {

		Test test=new Test();
		test.method();
	}

	@Override
	public void method() {
		System.out.println("inherited method");
	}

	

}
