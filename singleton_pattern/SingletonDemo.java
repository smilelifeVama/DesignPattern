package singleton_pattern;

class SingletonDemo {
    public static void main(String[] args) {
        System.out.println(SingletonLazy.getInstance());
        SingletonLazy.getInstance().printMsg();
        System.out.println(SingletonLazy.getInstance());
        SingletonLazy.getInstance().printMsg();
        System.out.println("--------------------------");
    }
}