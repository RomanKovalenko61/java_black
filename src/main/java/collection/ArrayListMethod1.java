package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1, "Misha");
//        arrayList1.add(6, "Misha");

        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();
//        for (int i = 0; i < arrayList1.size(); i++) {
//            System.out.print(arrayList1.get(i) + " ");
//        }
//        System.out.println();
//        List<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(6);
        System.out.println(arrayList1.get(2));

        arrayList1.set(1, "Masha");
        arrayList1.remove(0);
//        arrayList1.remove(8);

        System.out.println(arrayList1);


    }
}
