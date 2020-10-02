package lesson7;

import java.util.ArrayList;
import java.util.List;


public class Observed {


    List<Plate> plates = new ArrayList<>();
    List<Cat> cats = new ArrayList<>();


    public void addPlates(Plate plate) {
        this.plates.add(plate);
    }

    public void addObserver(Cat cat) {
        this.cats.add(cat);
    }

    public void removeObserver(Cat cat) {
        this.cats.remove(cat);
    }


    public void notifyObservers(Plate plate) {
        for (Plate plate0 : plates)
            for (Cat cat : cats)
                cat.handleEvent(plate0);
    }
}
