package proxy_pattern;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImg() {
        System.out.println(fileName + " Image show");
    }
}
