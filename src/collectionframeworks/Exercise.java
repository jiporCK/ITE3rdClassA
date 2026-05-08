package collectionframeworks;

import java.util.*;

public class Exercise {

    public static void main(String[] args) {

        List<String> numbers = List.of(
                "2","3","4","5","6","7","8","9","10","J","Q","K","A"
        );
        List<String> faces = List.of(
                "♠\uFE0F", "♣\uFE0F", "♥\uFE0F", "♦\uFE0F"
        );

        List<String> cards = new ArrayList<>(52);
        Map<String, Integer> values = new HashMap<>();

        for (String number : numbers) {
            for (String face : faces) {
                String value = number + face;
                int val = switch (number) {
                    case "A" -> 1;
                    case "J","Q","K", "10" -> 0;
                    default -> Integer.parseInt(number);
                };

                cards.add(value);
                values.put(value, val);
            }
        }

        Collections.shuffle(cards);

        System.out.println(cards);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of player(s): ");
        int numberOfPlayers = scanner.nextInt();

        int index = 1;
        while (numberOfPlayers > 0) {

            List<String> cardPerPerson = new ArrayList<>(3);
            int sum = 0;
            while (cardPerPerson.size() < 3) {
                String card = cards.removeLast();
                cardPerPerson.add(card);
                sum += values.get(card);
            }

            System.out.printf("Player %d : %s | Sum = %d\n", index++, cardPerPerson, sum%10);

            numberOfPlayers--;
        }
    }

}
