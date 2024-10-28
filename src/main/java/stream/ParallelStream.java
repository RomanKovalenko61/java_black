package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    // 1  2  3  4  ... 1000000000
    // 1  250000000
    // 250000001 500000000
    // 500000001  750000000
    // 750000001  1000000000
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        double sumResult = list.parallelStream()
//                .reduce((acc, element) -> acc + element).get();
//        System.out.println("sumResult = " + sumResult);

        double divisionResult = list.parallelStream()
                .reduce((acc, element) -> acc / element).get();
        System.out.println("divisionResult = " + divisionResult);

        double divisionResult2 = list.stream()
                .reduce((acc, element) -> acc / element).get();
        System.out.println("divisionResult2 = " + divisionResult2);
    }
}
