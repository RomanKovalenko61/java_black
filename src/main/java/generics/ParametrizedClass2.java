package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("privet", 20);
        System.out.println("Znach pari: value1 = " + pair1.getFirstValue() +
                ", value2 = " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(156, 3.14);
        System.out.println("Znach pari: value1 = " + pair2.getFirstValue() +
                ", value2 = " + pair2.getSecondValue());

        OtherPair<String> otherPair = new OtherPair<>("privet", "poka");
        System.out.println("Znach pari: value1 = " + otherPair.getFirstValue() +
                ", value2 = " + otherPair.getSecondValue());
//        OtherPair<String> otherPair2 = new OtherPair<>("privet", 10);
    }
}

class Pair<V1, V2> {
    private final V1 value1;
    private final V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V> {
    private final V value1;
    private final V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V abc(V val) {
        return val;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
