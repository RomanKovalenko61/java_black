package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        Iterator<String> iterator = arrayList1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        while (iterator.hasNext()) {
           iterator.next();
           iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
