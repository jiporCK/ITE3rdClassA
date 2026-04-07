package method;

public class Varargs {

    public static int add(int ...numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(
                add(2, 4)
        );
        System.out.println(
                add(2, 4, 6)
        );
        System.out.println(
                add(2, 4, 9, 1)
        );
        System.out.println(
                add(7,1,4,7,8,3,6,8,0)
        );
    }

}
