package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Mariya", 3);

        List<Student2> student2List = new LinkedList<>();
        student2List.add(st1);
        student2List.add(st2);
        student2List.add(st3);
        student2List.add(st4);
        student2List.add(st5);

        System.out.println("LinkedList = " + student2List);
        System.out.println(student2List.get(2));

        Student2 st6 = new Student2("Zaur", 3);
        Student2 st7 = new Student2("Igor", 4);
        student2List.add(st6);
        System.out.println("LinkedList = " + student2List);
        student2List.add(1, st7);
        System.out.println("LinkedList = " + student2List);
        student2List.remove(3);
        System.out.println("LinkedList = " + student2List);
    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}