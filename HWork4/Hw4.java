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

        System.out.println("Got " + arr.get(3));
        System.out.println("Got " + arr.get(4));
        System.out.println("Max = " + arr.getMax());
        System.out.println("Min = " + arr.getMin());

        System.out.println("Average = " + arr.getAverage());

    }
}