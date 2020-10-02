package lesson7;

public class Plate extends Observed {
    protected int food;
    protected int maxFood;

    public Plate(int food, int maxFood) {
        this.food = food;
        this.maxFood = maxFood;
    }

    public void info() {
        System.out.println(this);
    }

    public int getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                ", maxFood=" + maxFood +
                '}';
    }

    public void addPlateFood(int food) {
        for (Plate plate0 : plates) {
            plate0.addFood(food);
        }
        notifyObservers(this);
    }

    public void addFood(int food) {
        if (food <= maxFood) {
            this.food += food;
        } else {
            System.out.println("Насыпайте меньше корма на " + (food - maxFood) + " единиц");
            System.exit(0);
        }
    }

    public void decreaseFood(int appetite) {
        if (food >= appetite) {
            this.food -= appetite;

        } else this.food = 0;
    }
}
