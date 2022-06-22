package homework4;

import java.lang.reflect.Array;

public class Hw4 {
    public static void main(String[] args) {
        var arr = new RubberArray();

        for (int i = 1; i < 6; i++) {
            arr.add(i);
            System.out.println(arr);
        }

        arr.remove(3);
        System.out.println(arr);

        System.out.println(arr.get(3));
        System.out.println(arr.getMax());
        System.out.println(arr.getMin());

        System.out.println(arr.getAverage());

    }
}