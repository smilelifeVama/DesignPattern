package singleton_pattern;

public class SingletonHungry {
    private static SingletonHungry mInstance = new SingletonHungry();

    private SingletonHungry() {

    }

    public static SingletonHungry getInstance() {
        return mInstance;
    }

    public void printMsg() {
        System.out.println("Hello SingletonHungry!");
    }

}