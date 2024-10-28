package stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
//        Arrays.stream(array).forEach(element -> {
//            element *= 2;
//            System.out.println(element);
//        });
//        Arrays.stream(array).forEach(System.out::println);
//        Arrays.stream(array).forEach(Utils::myMethod);
        Arrays.stream(array).forEach(e1 -> Utils.myMethod(e1));
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}