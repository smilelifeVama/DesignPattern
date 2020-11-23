package builder_pattern;

public class CarBuilder implements Builder {
    private int id = -1;
    private String name = "";
    private String color = "";
    private String height = "";
    private String weight = "";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        //do nothing
    }
    
    public Car getCar() {
        return new Car(id, name, color, height, weight);
    }

}
