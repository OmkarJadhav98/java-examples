package Polymorphism._4;


class Employee {
    private final String name;
    private final String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double calculateSalary() {
        return 0.0;
    }
}

