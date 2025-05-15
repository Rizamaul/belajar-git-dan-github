public class HealthRecord {
    private String medicalNumber;
    private String creationDate;

    public HealthRecord(String medicalNumber, String creationDate) {
        this.medicalNumber = medicalNumber;
        this.creationDate = creationDate;
    }

    public String getMedicalNumber() {
        return medicalNumber;
    }

    public String getCreationDate() {
        return creationDate;
    }
}
