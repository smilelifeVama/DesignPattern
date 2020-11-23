package prototype_pattern;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Robot robot0 = new Robot(0, "零号机", "橙色", "40m", "1200吨", new Weapon());
        Robot robot1 = (Robot) robot0.clone();
        robot1.setId(1);
        robot1.setName("初号机");
        robot1.setColor("紫色");

        // Robot robot2 = (Robot) robot0.clone();
        // robot2.setId(2);
        // robot2.setName("二号机");
        // robot2.setColor("红色");

        System.out.println(robot0);
        System.out.println(robot1);
        // System.out.println(robot2);



    }
}