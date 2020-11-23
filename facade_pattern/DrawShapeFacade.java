package facade_pattern;

import bridge_pattern.GreenCircle;
import bridge_pattern.DrawAPI;
import bridge_pattern.GreenPen;
import bridge_pattern.Pen;
import bridge_pattern.GreenSquare;

public class DrawShapeFacade {
    public static final int COLOR_GREEN = 1;
    public static final int COLOR_RED = 2;

    public static final int SHAPE_CIRCLE = 1;
    public static final int SHAPE_SQUARE = 2;
    
    public void drawShape(int color, int shape) {
        DrawAPI drawAPI = null;
        Pen pen = null;
        if (shape == SHAPE_CIRCLE) {
            drawAPI = new GreenCircle();
        } else if (shape == SHAPE_SQUARE) {
            drawAPI = new GreenSquare();
        } else {
            drawAPI = new GreenCircle();
        }

        if (color == COLOR_RED) {
            //no pen
        } else if (color == COLOR_GREEN) {
            pen = new GreenPen(drawAPI);
        }

        if (pen != null) {
            pen.draw();
        } else {
            System.out.println("have not " + color + " pen to draw");
        }

    }

}
