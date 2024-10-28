package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(List<Student> list, Predicate<Student> pr) {
        for (Student s : list) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(List<Student> list, double grade) {
//        for (Student s : list) {
//            if (s.avrGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(List<Student> list, int age) {
//        for (Student s : list) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(List<Student> list, int age, double grade, char sex) {
//        for (Student s : list) {
//            if (s.age > age && s.avrGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();


        
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("------------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });

//        int p = 3;
//        StudentChecks sc = (Student s) -> {return s.avrGrade > 8;};

//        Predicate<Student> p1 = student -> student.avrGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//
//        info.testStudents(students, p1.and(p2));
//        System.out.println("------------------------");
//        info.testStudents(students, p1.or(p2));
//
//        info.testStudents(students, p1.negate());

//        info.testStudents(students, s -> s.avrGrade > 8);
//        System.out.println("------------------------");
//        info.testStudents(students, s -> s.age < 30);
//        System.out.println("------------------------");
//        info.testStudents(students, s -> s.age > 20 && s.avrGrade < 9.3 && s.sex == 'f');


//        info.printStudentsOverGrade(students, 8);
//        System.out.println("------------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("------------------------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
//        Collections.sort(students, (student1, student2) -> student1.course-student2.course);
//        System.out.println(students);

        Function<Student, Double>  f = student -> student.avrGrade;
        
        double res = avrOfSmth(students, stud -> (double) stud.age);
        System.out.println(res);
    }

     private static Double avrOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st: list) {
            result += f.apply(st);
        }
        return result/list.size();
     }
}