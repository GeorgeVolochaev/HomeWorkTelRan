
public class TestExceptions {

    public static void main(String[] args) {

        String[][] rightArray = { {"1", "2", "3", "5"}, {"4", "5", "6", "6"},
                                  {"7", "8", "9", "7"}, {"1", "2", "3", "4"}};

        String[][] wrongSizeArray = {{"1", "2", "3", "5"}, {"4", "5", "6", "6"}};

        String[][] wrongDataArray = { {"1", "2f", "Ki", "5"}, {"4", "d", "6", "6"},
                {"7", "8", "m", "7"}, {"1", "2", "3", null}};

        //System.out.println(CheckArray.checkArraySize(wrongSizeArray));

        if (CheckArray.checkArraySize(rightArray)){
            System.out.println(" Sum = " + CheckArray.sumArray(rightArray));
        }

        System.out.println(" Sum = " + CheckArray.sumArray(wrongDataArray));

    }
}