package collectionframeworks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        // Set : HashSet, TreeSet
        Set<String> names = new HashSet<>();
        names.add("Steve Rogers");
        names.add("Tony Stark");
        names.add("Bruce Banner");
        names.add("Hulk");
        names.add("Thor");
        names.add("Thor");

        names.addAll(
                Set.of("Koko", "Koko1")
        );
        names.addAll(
                List.of("Koko2", "Koko3")
        );

        System.out.println(names);

        names.removeIf(
                name -> name.toLowerCase().startsWith("k")
        );
        System.out.println(names);

        System.out.println("Size of set: " + names.size());

        String context = names.contains("Thor") ? "He exists" : "Not found";

        System.out.println(context);

        Set<String> elements = Set.of("Steve Rogers", "Tony Stark");

        if (names.containsAll(elements)) {
            System.out.println("They exist");
        }
        System.out.println(names);

        Set<String> orderedNames = new TreeSet<>(names);
        System.out.println(orderedNames);


    }

}
