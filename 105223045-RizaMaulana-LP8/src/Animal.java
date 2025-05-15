public class Animal {
    private HealthRecord healthRecord;

    public Animal(String medicalNumber, String creationDate) {
        this.healthRecord = new HealthRecord(medicalNumber, creationDate);
    }

    public void makeSound() {
        System.out.println("Suara hewan tidak dikenal.");
    }

    public HealthRecord getHealthRecord() {
        return healthRecord;
    }
}
