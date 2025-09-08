package reflection_examples;

public class Ex3 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Zaur", "IT");
        Class employeeClass = Employee.class;
        var field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salary = (Double) field.get(employee);
        System.out.println(salary);

        field.set(employee, 1500);
        System.out.println(employee);
    }
}
