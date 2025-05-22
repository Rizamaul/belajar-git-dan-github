public class SoftwareEngineer extends Employee {
    public SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 7000.0;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return withBonus ? calculateSalary() + 1000.0 : calculateSalary();
    }
}
