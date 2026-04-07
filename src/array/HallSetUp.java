package array;

import java.util.Scanner;

public class HallSetUp {

    public static void main(String[] args) {

        // user input row: 2
        // user input chair per row: 4
        /*
        * A1 A2 A3 A4
        * B1 B2 B3 B4
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("===[ Welcome to Hall Booking ]===");

        System.out.println("""
                ██╗███████╗████████╗ █████╗ ██████╗\s
                ██║██╔════╝╚══██╔══╝██╔══██╗██╔══██╗
                ██║███████╗   ██║   ███████║██║  ██║
                ██║╚════██║   ██║   ██╔══██║██║  ██║
                ██║███████║   ██║   ██║  ██║██████╔╝
                ╚═╝╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═════╝\s
                """);

        System.out.println("=== [ Setting up hall ] ===");
        System.out.print("[+] Input number of row(s): ");
        int rows = scanner.nextInt();
        System.out.print("[+] Input number of chair(s) per row: ");
        int chairs = scanner.nextInt();

        String[][] hall = new String[rows][chairs];

        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
//                System.out.printf("[%c][%d] ", (char) i+65, j+1);
                hall[i][j] = String.format("%c-%d", (char) i+65, j+1);
            }
        }

        for (String[] row : hall) {
            for (String chair : row) {
                System.out.print(chair + " ");
            }
            System.out.println();
        }

        scanner.nextLine();
        System.out.print("[+] Book (a-1, A-1): ");
        String value = scanner.nextLine();

        String[] parts = value.split(",");

        for (String part : parts) {
            for (int j = 0; j < hall.length; j++) {
                for (int k = 0; k < hall[j].length; k++) {
                    if (part.strip().equalsIgnoreCase(hall[j][k])) {
                        hall[j][k] = "BOO";
                    }
                }
            }
        }

        for (String[] row : hall) {
            for (String chair : row) {
                System.out.print(chair + " ");
            }
            System.out.println();
        }

    }

}
