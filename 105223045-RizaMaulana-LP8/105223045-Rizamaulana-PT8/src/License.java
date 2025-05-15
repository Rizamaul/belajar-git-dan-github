public class License {
    private String licenseNumber;
    private String validUntil; 

    public License(String licenseNumber, String validUntil) {
        this.licenseNumber = licenseNumber;
        this.validUntil = validUntil;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getValidUntil() {
        return validUntil;
    }
}
