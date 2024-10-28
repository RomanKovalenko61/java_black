package lambda;

public class Test2 {
    static  void def(I i) {
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        final int i = 10;

        def((String s) -> {
            int a = 5;
            System.out.println("i = " + i);
            return s.length() + i;
        });
//        i = 15;
//        System.out.println(a);
    }
}

interface I {
    int abc(String s);
}
