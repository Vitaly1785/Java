package lesson7;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Plate plate = new Plate(0, 20);
        plate.addPlates(plate);
        Plate plate1 = new Plate(0, 20);
        plate.addPlates(plate1);
        Cat cat = new Cat("Tom", 12, 0, 12);
        plate.addObserver(cat);
        Cat cat1 = new Cat("Boris", 5, 0, 5);
        plate.addObserver(cat1);
        Cat cat2 = new Cat("Marsik", 8, 0, 8);
        plate.addObserver(cat2);
        plate.addPlateFood(10);
        Thread.sleep(5000);
        cat.randStarvation(cat);
        plate.addPlateFood(20);
    }
}
