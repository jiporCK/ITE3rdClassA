package method;

public class StringMethods {

    public static void main(String[] args) {

        String[] names = {
                "Sokkeang", "Reaksa",
                "Bidin", "Sengkim",
                "Souheng", "Ratanak"
        };
        printArr(names);

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
        }
        printArr(names);

        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().contains("r")) {
                System.out.print(names[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().endsWith("ng")) {
                System.out.print(names[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArr(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
