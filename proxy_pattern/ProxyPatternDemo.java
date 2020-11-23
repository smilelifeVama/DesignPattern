package proxy_pattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        RealImage image0 = new RealImage("图片0");
        image0.displayImg();

        ProxyImage image1 = new ProxyImage("图片1");
        image1.displayImg();
    }
}
