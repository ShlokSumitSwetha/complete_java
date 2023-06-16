import java.util.Optional;

public class OptionalTest1 {
	public static void main(String[] args) {
		OptionalTest1 obj=null;
		OptionalTest1 obj2=new OptionalTest1();
		
		// ofNullable
		Optional<OptionalTest1> value=Optional.ofNullable(obj);
		Optional<OptionalTest1> value2=Optional.ofNullable(obj2);
		System.out.println("With ofNullable  and actual no value"+value);
		System.out.println("With ofNullable  and actual value value"+value2);
		
		Optional<OptionalTest1> value3=Optional.of(obj); // it can throw null pointer exception
		Optional<OptionalTest1> value4=Optional.of(obj2);
		System.out.println("With ofNullable  and actual no value"+value3);
		System.out.println("With ofNullable  and actual value value"+value4);
		
		
		//isPresent
		System.out.println(value.isPresent());
		System.out.println(value2.isPresent());
		
		// get
		System.out.println(value.get());
		System.out.println(value2.get());
		
		
		// How to use both isPresent and get() together
		if(value.isPresent()){
			System.out.println(value.get());
		}
		else{
			value.orElse(obj2);
		}
		
		
		
	}

}
