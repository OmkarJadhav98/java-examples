// Base class for a person
class Person {
    private final String nam;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Subclass for an employee
class Employee extends Person {
    private final String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    // Getter for employee ID
    public String getEmployeeId() {
        return employeeId;
    }
}

// Subclass for a developer
class Developer extends Employee {
    private final String programmingLanguage;

    public Developer(String name, int age, String employeeId, String programmingLanguage) {
        super(name, age, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    // Getter for programming language
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}

// Example usage
public class Inheritance_4 {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());

        Employee employee = new Employee("Alice Smith", 25, "E12345");
        System.out.println("Employee: " + employee.getName() + ", Age: " + employee.getAge() +
                ", Employee ID: " + employee.getEmployeeId());

        Developer developer = new Developer("Bob Johnson", 28, "D98765", "Java");
        System.out.println("Developer: " + developer.getName() + ", Age: " + developer.getAge() +
                ", Employee ID: " + developer.getEmployeeId() +
                ", Programming Language: " + developer.getProgrammingLanguage());
    }
}

