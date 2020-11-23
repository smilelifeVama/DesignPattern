package builder_pattern;

public class Director {
    public void make0Robot(Builder builder) {
        builder.setId(0);
        builder.setName("0号机");
        builder.setColor("橙色");
        builder.setHeight("40m");
        builder.setWeight("1200t");
        builder.setWeapon(new Weapon());
    }

    public void make1Robot(Builder builder) {
        builder.setId(1);
        builder.setName("初号机");
        builder.setColor("紫色");
        builder.setHeight("40m");
        builder.setWeight("1200t");
        builder.setWeapon(new Weapon());
    }

    public void makeBee(Builder builder) {
        builder.setColor("黄色");
        builder.setName("大黄蜂");
    }

    public void makeGreenCar(Builder builder) {
        builder.setColor("绿色");
    }
}
