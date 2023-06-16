/**
 * This show's how to use the generic methods outside the generic class
 */
public class BoxUtils {

    public static <T extends Boxable> int getBoxSize(Box<T> t){
        return  t.getItems().size();
    }
}
