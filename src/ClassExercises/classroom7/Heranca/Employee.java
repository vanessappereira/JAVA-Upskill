package ClassExercises.classroom7.Heranca;

public class Employee {
    private String name;
    private String ssn;

    public Employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public String toString() {
        return "(" + getName() + ", " + getSsn() + ")";
    }
}
