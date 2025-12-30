package DesignBird.Version_1;

public abstract class Bird {

    int weight;
    String name;
    String color;
    String type;
    int size;
    String Work;

    public abstract String fly();

    public String eat()
    {
        return "Bird eat";
    }

    public abstract String make_sound();

}
