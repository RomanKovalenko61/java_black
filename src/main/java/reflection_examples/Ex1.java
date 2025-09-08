package reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> employeeClass = Class.forName("reflection_examples.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field someField = employeeClass.getField("id"); // get non-private
        System.out.println("Type of id field: " + someField.getType());

        System.out.println("*****");

        var fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("*****");

        var allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("*****");

        var salary = employeeClass.getDeclaredField("salary");
        System.out.println("Type of salary: " + salary.getType());

        System.out.println("--------------------------------------------");

        var someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " +
                someMethod1.getReturnType() + ", parameters types = " +
                Arrays.toString(someMethod1.getParameterTypes()));

        System.out.println("*****");

        var someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " +
                someMethod2.getReturnType() + ", parameters types = " +
                Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("*****");

        var methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName() +
                    " ,return type = " + method.getReturnType() +
                    ", parameters types = " +
                    Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("*****");

        var allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of method = " + method.getName() +
                    " ,return type = " + method.getReturnType() +
                    ", parameters types = " +
                    Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("*****");

        var allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method = " + method.getName() +
                        " ,return type = " + method.getReturnType() +
                        ", parameters types = " +
                        Arrays.toString(method.getParameterTypes()));
            }
        }

        System.out.println("--------------------------------------------");

        var constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("*****");

        var constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("*****");

        var constructors = employeeClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor " + constructor.getName() +
                    " has " + constructor.getParameterCount() +
                    " parameters, their types are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        }

        System.out.println("*****");

        var declaredConstructors = employeeClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println("constructor " + constructor.getName() +
                    " has " + constructor.getParameterCount() +
                    " parameters, their types are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
