package array;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {5, 2, 6, 8, 9, 1};
        printArr(arr);
        reverseArr(arr);
        printArr(arr);


    }
    public static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;
            start ++;
            end --;
        }
    }
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
