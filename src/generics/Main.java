package generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Box box = new Box();

        box.setContent(12);
        box.setContent("hi");
        box.setContent(12.15);

        System.out.println(
                box.getContent()
        );


        Box<Double> box1 = new Box<>();
        box1.setContent(8.72);
        System.out.println(box1.getContent());


        Box<Computer> computerBox = new Box<>();
        computerBox.setContent(
                new Computer(16, "MSI")
        );
        System.out.println(
                computerBox.getContent()
        );

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello, World!");
        map.put(2, "Hi");
        System.out.println(map.entrySet());
        System.out.println(
                map.get(1)
        );

        MapMini<Integer, String> customMap = new MapMini<>();
        customMap.put(2, "Bye, World!");
        System.out.println(
                customMap.get(2)
        );
        System.out.println(
                customMap.entrySet()
        );

    }

}
