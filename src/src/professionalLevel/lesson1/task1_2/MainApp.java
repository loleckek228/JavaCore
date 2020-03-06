package professionalLevel.lesson1.task1_2;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(toArrayList(new Integer[]{ 1, 2, 3, 4} ));
        System.out.println(toArrayList(new String[]{ "A", "B" }));
        System.out.println(Arrays.toString(changeElementPlace(new Integer[]{1, 2, 3, 4, 5}, 0, 3)));
        System.out.println(Arrays.toString(changeElementPlace(new String[]{ "A", "B" }, 0, 1)));
    }


    private static <T> ArrayList<T> toArrayList(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(array));
        return arrayList;
    }

    private static <T> T[] changeElementPlace(T[] array, int indexFirstElement, int indexSecondElement) {
        T element;
        element = array[indexFirstElement];
        array[indexFirstElement] = array[indexSecondElement];
        array[indexSecondElement] = element;
        return array;
    }
}
