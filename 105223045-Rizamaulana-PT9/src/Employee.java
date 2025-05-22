public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 500.0; 
        } else {
            return calculateSalary();
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("gaji dengan bonus: " + calculateSalary());
    }
}
