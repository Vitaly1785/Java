package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Bobic");
        Cat cat1 = new Cat("Marsik");
        Cat cat2 = new Cat("Boris");
        Dog dog1 = new Dog("Mailo");
        Dog dog2 = new Dog("Bim");
        Animal cat3 = new Cat("Wiskas");
        dog.run(150);
        dog1.jump(0.2);
        dog2.swim(5);
        cat.run(50);
        cat1.jump(1);
        cat2.swim(2);
        cat3.jump(2);
    }
}
