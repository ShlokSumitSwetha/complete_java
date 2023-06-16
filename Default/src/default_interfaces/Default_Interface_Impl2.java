package default_interfaces;
/** 
 * Overriding the default method
 * @author Sumith
 *
 */
public class Default_Interface_Impl2 implements Default_Interface{
	
	@Override
	 public void defaultMethod(){

		System.out.println("Overriding Default method");
	}
	  static void staticMethod(){

		System.out.println("overriding static method");
	}
	  void callDefaultParent(){
		System.out.println("calling parent abstract method");
		 Default_Interface.super.defaultMethod();
	 }
}
