package consume;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerDemo { 

public static Person updateStudentFee(Person person,Predicate<Person> predicate,Consumer<Person> consumer){ 

//Use the predicate to decide when to update the discount.

if ( predicate.test(person)){
//Use the consumer to update the discount value.
consumer.accept(person);
}
return person;
}

 

}