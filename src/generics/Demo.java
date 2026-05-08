package generics;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        String[] strs = {"Encapsulation", "Inheritance"
                , "Polymorphism", "Abstraction"};
        Integer[] nums = {6, 1, 9, 5};
        Double[] doubleNums = {6.8, 3.5, 1.2};
        Character[] chars = {'g', 'o', 'o', 'd'};

        ArrayUtil.sort(strs);

        ArrayUtil.sort(chars);
        ArrayUtil.printArr(chars);

        ArrayUtil.printArr(strs);
        ArrayUtil.printArr(nums);

        System.out.println(
                ArrayUtil.sum(nums)
        );
        System.out.println(
                ArrayUtil.sum(doubleNums)
        );
//        System.out.println(
//                ArrayUtil.sum(strs)
//        );

        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = new HashSet<>(
                Set.of(4, 5, 6)
        );

        set.addAll(list);
        System.out.println(set);

        User[] users = {
                new User(3L, "Encapsulation", 1.90),
                new User(1L, "Inheritance", 1.91),
                new User(4L, "Abstraction", 1.80),
                new User(2L, "Polymorphism", 1.86)
        };
        ArrayUtil.sort(users);
        ArrayUtil.printArr(users);

    }

}
