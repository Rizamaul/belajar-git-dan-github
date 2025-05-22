public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new SoftwareEngineer("Adri"),
            new DataScientist("Damos"),
            new Intern("Somad")
        };

        System.out.println("Gaji Dasar");
        for (Employee e : employees) {
            e.displayInfo();
            System.out.println();
        }

        System.out.println("Gaji dengan Bonus ");
        for (Employee e : employees) {
            System.out.println("Name: " + e.name);
            System.out.println("Gaji dengan bonus: " + e.calculateSalary(true));
            System.out.println();
        }
    }
}
