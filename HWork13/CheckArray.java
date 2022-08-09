import java.util.Arrays;
import java.util.stream.IntStream;

public class CheckArray {
    public static boolean checkArraySize(String[][] inputArr) {
        if ((inputArr.length != 4) || (inputArr[0].length != 4)) {
            throw new IllegalArgumentException("Wrong array's size.");
        }
       return true;
    }

    public static int parseInt(String s, int i, int j){
        try
        {
             return Integer.parseInt(s);
        }
        catch (NumberFormatException n) {
            throw new NumberFormatException("Wrong convert  i="+ i + "  j="+j);
            // Error
        }
    }
    public static int[][] checkAndConvertArrayData(String[][] inputArr){
        int[][] resultArr = new int[4][4];
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[0].length; j++) {
                resultArr[i][j] = parseInt(inputArr[i][j],i,j);
            }
        }
        return resultArr;
    }
    public static int sumArray(String[][] inputArr){
        int[][] resultArr = checkAndConvertArrayData(inputArr);
         IntStream intStream = Arrays.asList(resultArr) // from int array to int stream
                .parallelStream()
                .flatMapToInt(Arrays::stream);
        return intStream.sum();
    }
}
