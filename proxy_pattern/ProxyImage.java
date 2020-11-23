package proxy_pattern;

public class ProxyImage implements Image {
    private Image image;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImg() {
        if (image == null) {
            image = new RealImage(fileName);
        }
        image.displayImg();
    }
}
