package default_interfaces;

public class Default_Test1 {

	public static void main(String[] args) {
		
		// Calling default method using just simple implementation class
		Default_Interface_Impl1 impl1=new Default_Interface_Impl1();
		impl1.defaultMethod();
		// Calling default method using overridden implementation class
		Default_Interface_Impl2 impl2=new Default_Interface_Impl2();
		impl2.defaultMethod();
		//  calling default method of parent
		impl2.callDefaultParent();
		
		// calling static method
		Default_Interface.staticMethod();
	}

}
