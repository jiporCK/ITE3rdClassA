package generics;

import oop.inheritance.Parent;

public class ArrayUtil {

    public static <T> void printArr(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static <N extends Number> double sum(N...nums) {
        double sum = 0.0;
        for (N n : nums) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static <T extends Comparable<? super T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j =  0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
