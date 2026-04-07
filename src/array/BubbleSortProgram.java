package array;

import java.util.Scanner;

public class BubbleSortProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("[+] Input size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int index = 0;
        while (size > 0) {
            System.out.printf("[+] Input value for arr[%d]: ",index);
            arr[index] = scanner.nextInt();
            index++;
            size--;
        }
        System.out.print("[-] Array before sorted: ");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.print("[-] Array after sorted: ");
        for (int number : arr) {
            System.out.print(number + " ");
        }


    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}

