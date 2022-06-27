package homework5;

import java.util.Iterator;

public class Hw5 {
    public static void main(String[] args) {
        var arr = new RubberArray();

        for (int i = 1; i < 6; i++) {
            arr.add(i);
            //System.out.println(arr);
        }


        Iterator itr = arr.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }

}