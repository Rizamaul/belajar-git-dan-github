public class Cat extends Animal {
    public Cat(String medicalNumber, String creationDate) {
        super(medicalNumber, creationDate);
    }

    public void makeSound() {
        System.out.println("Meong!");
    }
}
