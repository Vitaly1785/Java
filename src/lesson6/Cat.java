package lesson6;

public class Cat extends Animal {
    public static final int MAX_RUN = 200;
    public static final double MAX_JUMP = 2;
    public static final int MAX_SWIM = 0;

    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean run(int runLength) {
        if (runLength <= MAX_RUN) {
            System.out.println("Кот " + name + " пробежал " + runLength + " метров");
            return true;
        }
        System.out.println("Кот " + name + " не добежал " + (runLength - MAX_RUN) + " метров");
        return false;
    }

    @Override
    public boolean jump(double jumpHeight) {
        if (jumpHeight <= MAX_JUMP) {
            System.out.println("Кот " + name + " подпрыгнул на " + jumpHeight + " метров");
            return true;
        }
        System.out.println("Кот " + name + " не допрыгнул " + (jumpHeight - MAX_JUMP) + " метров");
        return false;
    }

    @Override
    public boolean swim(int swimLength) {
        System.out.println("Кот " + name + " не умеет плавать. Как и все коты в принципе.");
        return false;
    }


}
