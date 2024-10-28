package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("privet");
//        System.out.println(info1);
//        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer i1 = info2.getValue();

        Info<Double> info22 = new Info<>(3.14);
        System.out.println(info22);
        Double d = info22.getValue();

//        Info<Bus> info3 = new Info<>(new Bus());
//        System.out.println(info3);
//        Bus b3 = info3.getValue();
    }

//    public void abs(Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abs(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
    // abs(Info info) --- type erasing
}

class Info<T> {  // Info<T extends Number&I1&I2>
    private T value;

    //    private static T value1;
    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

interface I1{}
interface I2{}

//class Parent {
//    public void abs(Info<String> info) {
//        String s = info.getValue();
//    }
//}

//class Child extends Parent {
//    public void abs(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
//}

class Bus {

}
