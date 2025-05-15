public class Driver {
    private String name;
    private Vehicle vehicle;
    private License license;

    public Driver(String name, Vehicle vehicle, String licenseNumber, String validUntil) {
        this.name = name;
        this.vehicle = vehicle;
        this.license = new License(licenseNumber, validUntil);
    }

    public void displayInfo() {
        System.out.println("Nama Pengemudi: " + name);
        if (vehicle instanceof Car) {
            System.out.println("Jenis Kendaraan: Mobil");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Jenis Kendaraan: Motor");
        } else {
            System.out.println("Jenis Kendaraan: Tidak diketahui");
        }
        System.out.print("Status Mesin: ");
        vehicle.startEngine();
        System.out.println("Nomor Lisensi: " + license.getLicenseNumber());
        System.out.println("Tanggal Berlaku Lisensi: " + license.getValidUntil());
        System.out.println();
    }
}
