public class Intern extends Employee {
    public Intern(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 3000.0;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return withBonus ? calculateSalary() + 200.0 : calculateSalary();
    }
}
