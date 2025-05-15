import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Driver 1
        System.out.print("Masukkan nama pengemudi: ");
        String name1 = input.nextLine();

        System.out.print("Pilih kendaraan (1. Mobil, 2. Motor): ");
        int choice1 = input.nextInt();
        input.nextLine(); // flush newline

        Vehicle vehicle1 = (choice1 == 1) ? new Car() : new Motorcycle();

        System.out.print("Masukkan nomor lisensi: ");
        String licenseNum1 = input.nextLine();

        System.out.print("Masukkan tanggal berlaku lisensi (dd-MM-yyyy): ");
        String validDate1 = input.nextLine();

        Driver driver1 = new Driver(name1, vehicle1, licenseNum1, validDate1);

        // Tambah minimal 1 driver lagi
        System.out.print("\nMasukkan nama pengemudi kedua: ");
        String name2 = input.nextLine();

        System.out.print("Pilih kendaraan (1. Mobil, 2. Motor): ");
        int choice2 = input.nextInt();
        input.nextLine(); // flush newline

        Vehicle vehicle2 = (choice2 == 1) ? new Car() : new Motorcycle();

        System.out.print("Masukkan nomor lisensi: ");
        String licenseNum2 = input.nextLine();

        System.out.print("Masukkan tanggal berlaku lisensi (dd-MM-yyyy): ");
        String validDate2 = input.nextLine();

        Driver driver2 = new Driver(name2, vehicle2, licenseNum2, validDate2);

        // Output
        System.out.println("\n=== Informasi Pengemudi ===");
        driver1.displayInfo();
        driver2.displayInfo();
    }
}
