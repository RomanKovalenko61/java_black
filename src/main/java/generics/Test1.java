package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("acacacqa"));
//        list.add(new Car());

        list.add("Privet");
        list.add("poka");
        list.add("OK");
        list.add("asdasfsdgsdfghsdfh");
//        list.add(new Car());

        for (Object o : list) {
            System.out.println(o + " dlina " + ((String) o).length());
        }
    }
}


class Car {
}