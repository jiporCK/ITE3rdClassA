package method;

import java.util.Scanner;

public class JavaMethod {

    // Method: is a block of code that is used to perform
    // a specific task.

    // modifier returnType methodName(parameterList) {}

    public void hi(int a) {
        if (a > 0) {
            return;
        }
        System.out.println("Hi");
    }

    // racecar
    public static boolean checkPalindrome(String word) {
        boolean isPalindrome = false;
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) == word.charAt(end)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
            start++;
            end--;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter e,E to exit");
            System.out.print("Enter palindrome word: ");
            String word = scanner.next();
            if (word.equalsIgnoreCase("e")) break;
            if (checkPalindrome(word)) {
                System.out.println("The word " + word + " is palindrome");
            } else {
                System.out.println("The word " + word + " is not palindrome");
            }
        }

    }

}
