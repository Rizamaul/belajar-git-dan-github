public class Dog extends Animal {
    public Dog(String medicalNumber, String creationDate) {
        super(medicalNumber, creationDate);
    }

    public void makeSound() {
        System.out.println("Guk-Guk!");
    }
}
