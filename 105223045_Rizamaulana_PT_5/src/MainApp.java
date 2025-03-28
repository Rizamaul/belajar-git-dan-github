class Person {
    private String name;
    private int age;

    // Konstruktor
    public Person(String n, int a) {
        name = n;
        age = a;
    }

    // Getter untuk mengakses variabel private
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    private double salary;

    // Konstruktor dengan pemanggilan super()
    public Employee(String n, int a, double s) {
        super(n, a); // Memanggil konstruktor dari kelas induk (Person)
        salary = s;
    }

    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 25, 5000.0);
        emp.display();
        emp.showSalary();
    }
}
