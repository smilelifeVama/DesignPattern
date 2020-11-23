package bridge_pattern;

public abstract class Pen {
    protected DrawAPI drawAPI;
    
    public Pen(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
