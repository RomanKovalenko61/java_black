package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list2 = new ArrayList<Integer>();
//        List<Object> list3 = new ArrayList<Integer>();

        List<?> list = new ArrayList<String>();
//        list.add("hello");

//        bounded wildcards
        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("ptivet");
        list2.add("poka");
        showListInfo(list2);

        List<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        List<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(35);
        ali.add(30);
        System.out.println(summ(ali));

        List<String> list3 = new ArrayList<>();
//        System.out.println(summ(list3));
    }

    static void showListInfo(List<?> list) {
        System.out.println("My list have next elements: " + list);
    }

    public static Double summ(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
