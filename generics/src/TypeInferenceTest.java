import java.util.Collections;
import java.util.Map;

public class TypeInferenceTest {

    public static void main(String[] args) {

        //type inference demo
        var v = Collections.emptyList();
        var v2 = Collections.<String>emptyList();
        var v3 = Collections.<Double>emptyList();

        Number number = pickOne(12,12.58);

       // Integer integer = pickOne(12,12.58);// compile fails due to double in the second param


        // type inference with instantiation
        Box<Apple> b = new Box<>();

        // type inference with method arguments
       // var box = Box.of()
    }

    public static<T> T pickOne(T t1, T t2){
        if(Math.random()>0.5){
            return t1;
        }else{
            return t2;
        }
    }
}
