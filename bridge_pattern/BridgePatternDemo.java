package bridge_pattern;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Pen greenCircle = new GreenPen(new GreenCircle());
        Pen greenSquare = new GreenPen(new GreenSquare());
        
        greenCircle.draw();
        greenSquare.draw();
    }

}
