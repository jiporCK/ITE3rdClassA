package new_features;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

//        MathUtil mathUtil = (a, b) -> a + b;
        MathUtil mathUtil = Integer::sum;
        System.out.println(
                mathUtil.add(3, 4)
        );

        MathUtil util = new MathUtilImpl();
        System.out.println(
                util.add(4, 4)
        );

        StringUtil stringUtil = String::toUpperCase;
        System.out.println(
                stringUtil.toUpper("Hello, World!")
        );

        Greeting greeting = name -> System.out.println("Hi " + name);
        greeting.greet("Chipor");

        // () ->
        Test test = () -> System.out.println("Hello");
        System.out.println(test.hashCode());

        List<Integer> ints = List.of(
                1,5,6,8,9,1,23,4
        );

        int sum = ints.stream()
                .filter(i -> i < 5)
                .reduce(0, Integer::sum);

        System.out.println("Sum is : " + sum);

        int max = ints.stream()
                .reduce(0, (a, b) -> (a >= b) ? a : b);

        System.out.println("Max value is : " + max);

    }
}

@FunctionalInterface
interface Test {
    void hello();
    default String hi() {
        return "Hello";
    }
}

@FunctionalInterface
interface Greeting {
    void greet(String name); // Hi + name
}

@FunctionalInterface
interface MathUtil {
    int add(int a, int b);
}

@FunctionalInterface
interface StringUtil {
    String toUpper(String str);
}

class MathUtilImpl implements MathUtil {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}