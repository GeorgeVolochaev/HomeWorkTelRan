import org.example.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestTask2 {
    @ParameterizedTest
    @MethodSource("data")
    public void test(Integer[] arr, Integer[] numbers, boolean result){
        Assertions.assertEquals(Task2.onlyNumbersIsExist(arr,numbers),result);
    }

    public static Stream<Arguments> data() {
        List<Arguments> out = new ArrayList<>();
        Integer[] numbers = {1,4};
        out.add(Arguments.arguments(new Integer[] { 1,1,4,1,1,3,1,1},     numbers, false));
        out.add(Arguments.arguments(new Integer[] { 1,1,1,1,1,1,1,1},     numbers, false));
        out.add(Arguments.arguments(new Integer[] { 1,1,1,4,1,1,1,1},     numbers, true));
        out.add(Arguments.arguments(new Integer[] { 4,4,4,4,4,4,4,4},     numbers, false));
        out.add(Arguments.arguments(new Integer[] { 4,4,4,4,4,4,4,1},     numbers, true));
        out.add(Arguments.arguments(new Integer[] { 3,5,7,9,11,13,15,17}, numbers, false));

        return out.stream();
    }
}
