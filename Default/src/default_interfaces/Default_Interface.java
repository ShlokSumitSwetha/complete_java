package default_interfaces;

/**
 *  In interface only public, abstract, static, default  & strictfp are allowed
 * @author Sumith
 *
 */

public interface Default_Interface {

	 default void defaultMethod(){
		System.out.println("Default method");
	}
	 static  void staticMethod(){
		System.out.println("Static  method");
	}
}
