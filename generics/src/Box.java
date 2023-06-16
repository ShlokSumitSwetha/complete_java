import java.util.ArrayList;
import java.util.List;

public class Box<T extends  Boxable> {
    private List<T> items;
    Box(){
    }
    Box(T x){
        this.items = new ArrayList<>();
    }

    public void addItems(T t){
        this.items.add(t);
    }
    public List<T> getItems(){
        return this.items;
    }

    public double getWeight(){
        return this.items.stream().mapToDouble(x->x.getWeight()).sum();
    }
}
