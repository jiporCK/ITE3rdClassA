package method;

public class Recursion {

    // 4
    public int factorial(int number) {
        int result = 1;
        while (number > 0) {
            result *= number;
            number--;
        }
        return result;
    }

    public int recursiveFactorial(int number) {
        // base case
        if (number == 0) return 1;
        return number * recursiveFactorial(number - 1);
    }

    public static void main(String[] args) {
        Recursion rec = new Recursion();
        System.out.println(
                rec.recursiveFactorial(5)
        );

    }

}
