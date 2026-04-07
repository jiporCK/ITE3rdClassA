package method;

import java.util.Scanner;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by 0");
            return 0.0;
        } else {
            return a / b;
        }
    }
    public double power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    === [ Calculator Program ] ===
                    1. Add
                    2. Divide
                    3. Power
                    0. Exit""");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            if (option == 0) System.exit(0);

            System.out.print("Enter value 1: ");
            double val1 = scanner.nextDouble();
            System.out.print("Enter value 2: ");
            double val2 = scanner.nextDouble();

            double result = 0.0;

            switch (option) {
                case 1 -> result = calculator.add(val1, val2);
                case 2 -> result = calculator.divide(val1, val2);
                case 3 -> result = calculator.power((int) val1, (int) val2);
            }

            System.out.printf("Your result is %.2f%n", result);

        }

    }

}
