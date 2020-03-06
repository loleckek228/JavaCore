package professionalLevel.lesson1.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <F extends Fruit> {

    private ArrayList<F> fruitBox;

    public Box() {
        this.fruitBox = new ArrayList<>();
    }

    public void addFruit(F... fruit) {
        fruitBox.addAll(Arrays.asList(fruit));
    }

    private float getWeight() {
        return fruitBox.get(0).getWeight() * fruitBox.size();
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public Box<F> changeBox(Box<F> another) {
        for (int i = 0; i < fruitBox.size(); i++) {
            another.addFruit(fruitBox.get(i));
            this.fruitBox.remove(fruitBox.get(i));
        }
        return another;
    }
}