package generics;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedMethod {
    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = (int) GenMethod.getSecondElement(al1);
        System.out.println(a);

        List<String> al2 = new ArrayList<>();
        al2.add("abc");
        al2.add("def");
        al2.add("ghi");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);
    }
}

class GenMethod {
    public static <T> T getSecondElement(List<T> al) {
        return al.get(1);
    }
}

//class GenMethod {
//    public static <T extends Number> T getSecondElement(List<T> al) {
//        return al.get(1);
//    }
//}