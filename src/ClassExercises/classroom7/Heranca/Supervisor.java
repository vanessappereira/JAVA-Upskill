package Aula7HerancaPolimorfismo.Heranca;

public class Supervisor extends Employee {
    private int level;

    public Supervisor(String name, String ssn, int level) {
        super(name, ssn);
        level = 2;
    }
    public int getLevel() {
        return level;
    }
    @Override
    public String toString() {
        return "(" + getName() + ", " + getSsn() + ", " + getLevel() + ")";
    }
}

