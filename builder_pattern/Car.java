package builder_pattern;

public class Car {
    private int id;
    private String name;
    private String color;
    private String height;
    private String weight;

    public Car(int id, String name, String color, String height, String weight) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Car[id = %d, name = %s, color = %s, height = %s, weight = %s]",
             id, name, color, height, weight);
    }
}
