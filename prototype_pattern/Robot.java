package prototype_pattern;

public class Robot implements Cloneable {
    private int id = -1;
    private String name = "";
    private String color = "";
    private String height = "";
    private String weight = "";
    private Weapon mWeapon = null;

    

    public Robot(int id, String name, String color, String height, String weight) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public Robot(int id, String name, String color, String height, String weight, Weapon weapon) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.mWeapon = weapon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeapon(Weapon weapon) {
        this.mWeapon = weapon;
    }

    @Override
    public String toString() {
        return String.format("Robot[id = %d, name = %s, color = %s, height = %s, weight = %s, weapon = %s", id, name, color, height, weight, mWeapon);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Robot copyObject =  (Robot) super.clone();
        copyObject.setWeapon((Weapon)mWeapon.clone());
        return copyObject;
    }
}