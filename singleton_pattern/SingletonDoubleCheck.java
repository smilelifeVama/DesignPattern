package singleton_pattern;

public class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck mInstance;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance() {
        if (mInstance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (mInstance == null) {
                    mInstance = new SingletonDoubleCheck();
                }
            }
        }
        return mInstance;
    }

    public void printMsg() {
        System.out.println("Hello SingletonDoubleCheck!");
    }

}