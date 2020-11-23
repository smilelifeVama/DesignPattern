package builder_pattern;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeBee(carBuilder);
        Car car = carBuilder.getCar();
        System.out.println(car);

        RobotBuilder robotBuilder = new RobotBuilder();
        director.makeBee(robotBuilder);
        Robot robot = robotBuilder.getRobot();
        System.out.println(robot);
    }
}