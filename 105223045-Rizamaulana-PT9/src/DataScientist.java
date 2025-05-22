public class DataScientist extends Employee {
    public DataScientist(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 7500.0;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return withBonus ? calculateSalary() + 1200.0 : calculateSalary();
    }
}
