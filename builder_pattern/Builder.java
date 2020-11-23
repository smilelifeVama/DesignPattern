package builder_pattern;

public interface Builder {
    void setName(String name);
    void setColor(String color);
    void setId(int id);
    void setHeight(String height);
    void setWeight(String weight);
    void setWeapon(Weapon weapon);
}
