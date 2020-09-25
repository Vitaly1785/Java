package lesson6;

import java.util.Random;

public class Dog extends Animal {
    public static final int MAX_RUN = 500;

    public static final double MAX_JUMP = 0.5;

    int maxSwim = new Random().nextInt(11);

    public Dog(String name) {
        super(name);
    }

    @Override
    public boolean run(int runLength) {
        if (runLength <= MAX_RUN) {
            System.out.println("Собака " + name + " пробежала " + runLength + " метров");
            return true;
        }
        System.out.println("Собака не добежала " + (runLength - MAX_RUN) + " метров");
        return false;
    }

    @Override
    public boolean jump(double jumpHeight) {
        if (jumpHeight <= MAX_JUMP) {
            System.out.println("Собака " + name + " подпрыгнула на " + jumpHeight + " метров");
            return true;
        }
        System.out.printf("Собака " + name + " не допрыгнула " + "%.2f", (jumpHeight - MAX_JUMP));
        System.out.println(" метра");
        return false;
    }

    @Override
    public boolean swim(int swimLength) {
        if (swimLength <= maxSwim) {
            System.out.println("Собака " + name + " проплыла " + swimLength + " метров");
            return true;
        }
        System.out.println("Собака " + name + " не доплыла " + (swimLength - maxSwim) + " метров");
        return false;
    }


}
