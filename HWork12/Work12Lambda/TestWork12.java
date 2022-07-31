package work12Lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class TestWork12 {
    public static void main(String[] args) {
        RunLambda runLambda = () -> System.out.println("Hello lambda!");
        runLambda.run();

        runLambda = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        };

        runLambda.run();

        System.out.println("----------------");

        ReturnValue value = Integer::sum;
        System.out.println(value.exec(3,3));
        value = (a,b) -> a * b;
        System.out.println(value.exec(3,3));

        BinaryOperator<String> add = (a,b) -> a + b;
        System.out.println(add.apply("2","2"));

        UnaryOperator<Integer> twice = (a) -> 2 * a;
        System.out.println(twice.apply(5));
    }
}
