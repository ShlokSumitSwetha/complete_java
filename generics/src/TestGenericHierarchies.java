public class TestGenericHierarchies {

    public static void main(String[] args) {

        CardBoardBox<Apple> cb= new CardBoardBox<>();
        Box<Apple> b = new Box<>();
        b= cb;
    }
}
