import java.util.ArrayList;
import java.util.List;

public class SubTypeTest {

    public static void main(String[] args) {

        List<Integer> il= new ArrayList<>();
        testSubType(il);
        testSubType2(il);
        //testSubType3(il);
        testSubType4(il);
        //testSubType5(il);
    }



    public static void testSubType(List<?> test){

    }

    public static void testSubType2(List<Integer> test){

    }

    public static void testSubType3(List<Number> test){

    }
    public static void testSubType4(List<? extends Number> test){

    }

    public static void testSubType5(List<? super Number> test){

    }
}
