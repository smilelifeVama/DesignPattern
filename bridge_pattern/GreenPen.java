package bridge_pattern;

public class GreenPen extends Pen {

    public GreenPen(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    public void draw() {
        drawAPI.draw();
    }
    
}
