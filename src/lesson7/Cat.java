package lesson7;

import java.util.Random;

public class Cat implements Observer {
    protected final String name;
    private int appetite;
    private int satiety;
    protected final int maxSatiety;

    public Cat(String name, int appetite, int satiety, int maxSatiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        this.maxSatiety = maxSatiety;
    }

    @Override
    public void handleEvent(Plate plate) {
        if (satiety < maxSatiety && plate.getFood() > 0) {
            infoCat();
            plate.info();
            eat(plate);
            infoCat();
            plate.info();
            satietyCat(satiety);
        }
    }

    public void eat(Plate plate) {


        System.out.println("Кот подходит к миске");
        doEat(plate);

    }

    private void doEat(Plate plate) {

        if (appetite <= plate.getFood()) {
            plate.decreaseFood(appetite);
            this.appetite -= appetite;
            this.satiety = maxSatiety;
        } else if (satiety != maxSatiety) {
            this.satiety = plate.food;
            plate.decreaseFood(appetite);
            this.appetite -= satiety;
        }
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                ", maxSatiety=" + maxSatiety +
                '}';
    }

    public void infoCat() {
        System.out.println(this);
    }

    private boolean satietyCat(int satiety) {
        if (satiety > maxSatiety / 2) {
            System.out.println("Кот " + name + " наелся");
            return true;
        } else
            System.out.println("Кот " + name + " остался голодным");
        return false;
    }

    public void randStarvation(Cat cats) {
        Random rand = new Random();
        int starvation = rand.nextInt((maxSatiety) + 1);
        satiety -= starvation;
        appetite = maxSatiety - satiety;
    }
}
