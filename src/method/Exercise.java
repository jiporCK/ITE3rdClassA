package method;

public class Exercise {

    public static int findMax(int ...numbers) {
        int max = -78675647;// initialize to smaller value
        for (int number : numbers) {
            if (number > max) max = number;
        }
        return max;
    }

    public static void calculateSalary(double basePay, int hoursWorked) {
        if (basePay < 8.00 || hoursWorked > 60) {
            System.out.println("""
                    Minimum Wage: $8.00/hour
                    Maximum Work: 60 hours a week
                    """);
            return;
        }
        double finalSalary = 0.0;
        if (hoursWorked > 40) {
            int extraHour = hoursWorked - 40;
            double bonus = extraHour*basePay*1.5;
            double baseSalary = 40 * basePay;
            finalSalary = bonus + baseSalary;
        } else {
            finalSalary = hoursWorked * basePay;
        }

        System.out.printf("Your final salary is: %.2f%n", finalSalary);
    }

    public static void main(String[] args) {

        System.out.println(
                findMax()
        );

        calculateSalary(8.00, 30);
        calculateSalary(8.00, 50);

        calculateSalary(6.00, 45);
        calculateSalary(8.50, 70);

    }

}
