package lesson6;


public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;

    }

    public abstract boolean run(int runLength);

    public abstract boolean jump(double jumpHeight);

    public abstract boolean swim(int swimLength);


}
