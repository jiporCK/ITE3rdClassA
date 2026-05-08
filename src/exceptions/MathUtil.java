package exceptions;

public class MathUtil {

    public static double divide(double a, double b) throws MathUtilException {
        if (b == 0) {
            throw new MathUtilException("Cannot divide by zero");
        }
        return a / b;
    }

}

class Main {
    public static void main(String[] args) {
        try {
            System.out.println(MathUtil.divide(12, 0));
        } catch (MathUtilException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
