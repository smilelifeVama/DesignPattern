package builder_pattern;

public class RobotBuilder implements Builder {
    private String name = "";
    private String color = "";
    private int id = -1;
    private String height = "";
    private String weight = "";
    private Weapon mWeapon = null;

    public RobotBuilder(){
    }

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
        this.mWeapon = weapon;
    }

    public Robot getRobot() {
        return new Robot(this.id, name, color, height, this.weight, mWeapon);
    }
}