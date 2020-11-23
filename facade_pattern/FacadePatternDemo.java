package facade_pattern;

public class FacadePatternDemo {
    public static void main(String[] args) {
        DrawShapeFacade facade = new DrawShapeFacade();
        facade.drawShape(DrawShapeFacade.COLOR_GREEN, DrawShapeFacade.SHAPE_CIRCLE);
    }
}
