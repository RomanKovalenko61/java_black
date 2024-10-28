package ionio.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 3745213299881101121L;

    String name;
    String surname;
    String department;
    //    int age;
    transient double salary;
    Car car;

    public Employee(String name, String surname, String department, double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
//        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
//                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
