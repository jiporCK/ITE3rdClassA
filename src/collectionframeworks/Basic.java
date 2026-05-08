package collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basic {

    public static void main(String[] args) {

//        // List : ArrayList, Vector, LinkedList
//
//        List<Integer> list = new ArrayList<>();
//        list.add(12); // Integer
//        list.add(15);
//        list.add(17);
//
//        list.add(1, 20);
//
//        List<Integer> list2 = List.of(7, 8);
//
//        list.addAll(list2);
//        list.addAll(0, list2);
////        list.clear();
//
////        list.remove(3);
//        list.remove(Integer.valueOf(20));
//
//        System.out.println(list);
////        list.remove(Integer.valueOf(7));
//        list.removeIf(i -> i.equals(7));
//        System.out.println(list);
//
//        list.removeAll(list2);
//        System.out.println(list);
//
//        int size = list.size();
//        System.out.println("Current size of list: " + size);
//
//        System.out.println("First element: " + list.getFirst());
//        System.out.println("Last element: " + list.getLast());
//        System.out.println("Element : " + list.get(1));
//
//        if (list.isEmpty()) {
//            System.out.println("There is no element");
//        }
//        if (list.containsAll(List.of(12, 15))) {
//            System.out.println("There are elements in the list");
//        }
//        if (list.getLast().equals(17)) {
//            System.out.println("Seventeen right here");
//        }
//
//        if (list.equals(List.of(12, 15, 17))) {
//            System.out.println("True");
//        }
//
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        list.set(2, 22);
//        System.out.println(list);

//        List<String> names = new ArrayList<>();
//        List<String> names = List.of("Steve Rogers", "Tony Stark");

//        List<String> names = new ArrayList<>(
//                List.of("Steve Rogers", "Tony Stark")
//        );
//        names.add("Thor");
//        System.out.println(names);

        List<String> names = new ArrayList<>(){{
            add("Steve Rogers");
            add("Robert Reynolds");
        }};

        names.add("Sentry");
        System.out.println(names);
//        names.remove(3);
//        names.remove("Steve Rogers");

        names.add("Bruce Banner");
        System.out.println(names);


        names.removeAll(List.of("Sentry", "Bruce Banner"));
        System.out.println(names);


    }

}
