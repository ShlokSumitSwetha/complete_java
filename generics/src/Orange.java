public class Orange  implements  Boxable{
    private String name;
    private String color;
    private String size;

    private int weight;

    Orange(String name, String color, String size, int weight){
        this.name = name;
        this.color =color;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public int getWeight() {
        return this.weight;
    }
}
