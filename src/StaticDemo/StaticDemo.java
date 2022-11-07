package StaticDemo;

class Employee {
    int id;
    String name;
    double salary;
    static int weeklyHours;
    // all the new employee will have the company IntelliJ (unless stated otherwise) because the param is static.
    static String company = "IntelliJ";

    // We can assign default value to all new Employee object
    public Employee() {
        id = 0;
        name = "J Doe";
        salary = 20000;
        weeklyHours = 37;
    }

    public void getDetails() {
        System.out.println("Employee " + name + " with ID number " + id + " earns " + salary + " and works " + weeklyHours + " hours at " + company + ".");
    }
}

public class StaticDemo {
    int i = 0;

    public static void main(String[] args) {

        // i = 5; // this doesn't work because we cannot access a non-static method inside a static block

        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "Dua Lipa";
        emp1.salary = 91500.90;
        Employee.weeklyHours = 40; // to change the value of a static param for a new object, we need to call ClassName.StaticParam and not NewObject.Param
        emp1.getDetails();

        Employee emp2 = new Employee() {
            {
                id = 2;
                name = "Tom Hanks";
                salary = 23309;
                Employee.weeklyHours = 38;
                Employee.company = "VS Code"; // this line changed the previous default static company param from "IntelliJ" to "VS Code".
            }
        };
        emp2.getDetails();

        Employee emp3 = new Employee();
        emp3.getDetails();
    }
}
