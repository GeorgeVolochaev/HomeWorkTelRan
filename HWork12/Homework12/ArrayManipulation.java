package homework12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;

public class ArrayManipulation {
    static String [] getArray(String text){

        return text.split(" ");
    }

    static HashSet<String> getSet (String[] arrText){
        var set = new HashSet<String>();
        Collections.addAll(set, arrText);
        return set;
    }
    static int getFrequency(String[] arrText,String word){
        var arrList = new ArrayList<String>();
        Collections.addAll(arrList, arrText);
        return Collections.frequency(arrList,word);
    }
    static String FrequencyCollectionsMethod(String[] arrText){
        StringBuilder result = new StringBuilder();
        HashSet<String> set = getSet(arrText);
        for (String name:set) {
            result.append(" ").append(name).append(":").append(getFrequency(arrText, name));
        }
        return result.toString();
    }

    static Map<String, Long> FrequencyStreamMethod(String[] arrText) {
        var arrList = new ArrayList<String>();
        Collections.addAll(arrList, arrText);

        return arrList.parallelStream()
                        .collect(Collectors
                        .groupingBy(Function
                        .identity(),Collectors
                        .counting()));
    }
}
