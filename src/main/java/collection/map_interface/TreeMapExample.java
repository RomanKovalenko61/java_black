package collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
/*        TreeMap<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });*/
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);

        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(8.5, st4);
        treeMap.put(9.1, st7);


//        Student st8 = new Student("Elena", "Sidorova", 4);
//        System.out.println(treeMap.containsKey(st8));

////        System.out.println(treeMap.tailMap(7.3));
////        System.out.println(treeMap.headMap(7.3));
////        System.out.println(treeMap.get(6.4));
////        treeMap.remove(5.8);
////        System.out.println(treeMap);
////        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());

    }
}
