// Base class for calculations
class Calculation {
    double operand;
    double operand2;

    public Calculation(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

}

// Subclass for addition
class Addition extends Calculation {
    public Addition(double operand1, double operand2) {
        super(operand1, operand2);
    }

    public double calculate() {
        return operand1 + operand2;
    }
}

// Subclass for subtraction
class Subtraction extends Calculation {
    public Subtraction(double operand1, double operand2) {
        super(operand1, operand2);
    }

    public double calculate() {
        return operand1 - operand2;
    }
}

// Subclass for multiplication
class Multiplication extends Calculation {
    public Multiplication(double operand1, double operand2) {
        super(operand1, operand2);
    }

    public double calculate() {
        return operand1 * operand2;
    }
}

// Subclass for division
class Division extends Calculation {
    public Division(double operand1, double operand2) {
        super(operand1, operand2);
    }

    public double calculate() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }
}

// Example usage
public class Inheritance_2 {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        Addition add = new Addition(num1, num2);
        System.out.println("Addition result: " + add.calculate());

        Subtraction sub = new Subtraction(num1, num2);
        System.out.println("Subtraction result: " + sub.calculate());

        Multiplication mul = new Multiplication(num1, num2);
        System.out.println("Multiplication result: " + mul.calculate());

        Division div = new Division(num1, num2);
        System.out.println("Division result: " + div.calculate());
    }
}

