package builder_pattern;

public class Weapon implements Cloneable {

    public Weapon() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
