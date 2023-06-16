import java.util.Optional;

public class OptionalTest2 {

	public static void main(String[] args) {

		// ******************** Wrong way of doing things ************************
		// With Optional Null
		Optional<String> value=getOptionalNull();
		
		if(value.isPresent()){
			System.out.println(value.get());
		}
		
		// ************************************************************************
		
		// **************Correct way of doing things  ****************************
		
		// We must use ofNullable static method 
		
		Optional<String> value2=Optional.ofNullable(getNull());
		
		if(value2.isPresent()){
			System.out.println(value2.get());
		}
		else{
			System.out.println("No value present");
		}
		
		// **********************************************************************
		
	}
	
	public static Optional<String> getOptionalNull(){
		return null;
	}
	
	public static String  getNull(){
		return null;
	}

}
