package homework12;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TestHomeWork12 {
    static void stPrint(Object input){
        Stream.of(input).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("task1:");
        String text = "the a run cat rat dog the dog a dog the bat the bat";
        String[] arr = ArrayManipulation.getArray(text);
        stPrint(text);
        stPrint(ArrayManipulation.getSet(arr));
        stPrint(ArrayManipulation.FrequencyCollectionsMethod(arr));
        stPrint(ArrayManipulation.FrequencyStreamMethod(arr));

        System.out.println("task2:");
        var telBook = new TelethonBook(new ArrayList<>());
        telBook.addRecord("silver","999-45-45");
        telBook.addRecord("silver","111-22-33");
        telBook.addRecord("golder","222-11-77");
        stPrint(telBook);

        String firstName = "silver";
        System.out.println(firstName + ":");
        stPrint(telBook.filterRecord(firstName));

    }
}