public class GenericsExample1 {

    public static void main(String[] args) {

        Apple a = new Apple("Kashmir Apple", "red", "big", 1);
        Apple a2 = new Apple("Kashmir Apple", "red", "big", 2);
        Orange o = new Orange("Orange", "orange", "big", 1);
        Orange o2 = new Orange("Orange", "orange", "big", 2);

        Box<Apple> b1 = new Box<>(a);
        b1.addItems(a);
        b1.addItems(a2);

        Box<Orange> b2 = new Box<>(o);
        b2.addItems(o);
        b2.addItems(o2);

        System.out.println("Box Items: "+ b1.getItems());
        System.out.println("box weight: "+b1.getWeight());
        System.out.println("Box Items: "+b2.getItems());
        System.out.println("box weight: "+b2.getWeight());

        /*
         * This show's how to use the generic methods outside the generic class
         */
        int boxSize1 = BoxUtils.getBoxSize(b1);
        int boxSize2 = BoxUtils.getBoxSize(b2);
        System.out.println(boxSize1);
        System.out.println(boxSize2);
    }
}
