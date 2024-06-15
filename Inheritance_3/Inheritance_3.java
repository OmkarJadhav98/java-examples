// Base class for a person
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Subclass for a doctor
class Doctor extends Person {
    private final String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    // Getter for specialization
    public String getSpecialization() {
        return specialization;
    }
}

// Subclass for a surgeon
class Surgeon extends Doctor {
    private final String surgicalProcedure;

    public Surgeon(String name, int age, String specialization, String surgicalProcedure) {
        super(name, age, specialization);
        this.surgicalProcedure = surgicalProcedure;
    }

    // Getter for surgical procedure
    public String getSurgicalProcedure() {
        return surgicalProcedure;
    }
}

// Example usage
public class Inheritance_3 {
    public static void main(String[] args)
    {
        Person person = new Person("John Doe", 30);
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());

        Doctor doctor = new Doctor("Dr. Smith", 40, "Cardiology");
        System.out.println("Doctor: " + doctor.getName() + ", Age: " + doctor.getAge() +
                ", Specialization: " + doctor.getSpecialization());

        Surgeon surgeon = new Surgeon("Dr. Johnson", 45, "General Surgery", "Appendectomy");
        System.out.println("Surgeon: " + surgeon.getName() + ", Age: " + surgeon.getAge() +
                ", Specialization: " + surgeon.getSpecialization() +
                ", Surgical Procedure: " + surgeon.getSurgicalProcedure());
    }
}