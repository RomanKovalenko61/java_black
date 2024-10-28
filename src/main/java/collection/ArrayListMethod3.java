package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        System.out.println(arrayList1);
//        List<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("!!!");
//        arrayList2.add("???");
//        arrayList1.addAll(1, arrayList2);
////        arrayList1.addAll(arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.clear();

//        System.out.println(arrayList1.indexOf("Ivan"));
//        System.out.println(arrayList1.lastIndexOf("Ivan"));
//        System.out.println(arrayList1.size());
//        System.out.println(arrayList1.isEmpty());

        System.out.println(arrayList1.contains("Kolya"));
        System.out.println(arrayList1.contains("Mariya"));
    }
}
