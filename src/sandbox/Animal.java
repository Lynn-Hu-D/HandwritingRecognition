package sandbox;

public class Animal {
    public String name;
    public String type;
    public String sound;

    // constructor
    public Animal(String n, String t, String s) {
        name = n;
        type = t;
        sound = s;
    }
    @Override
    public String toString() {
        return name + " the " + type + " says " + sound;
    }
}
