package Polymorphism._4;


class Programmer extends Employee {
    private final double baseSalary;
    private final double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

