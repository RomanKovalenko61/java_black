package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");

        System.out.println(arrayList1);

        List<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");

        List<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);
        System.out.println(arrayList1 == arrayList3);
    }
}
