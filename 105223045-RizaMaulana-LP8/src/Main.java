import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Owner[] owners = new Owner[2];

        for (int i = 0; i < owners.length; i++) {
            System.out.println("Masukkan nama pemilik ke-" + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.println("Pilih jenis hewan (1 = Dog, 2 = Cat): ");
            int type = Integer.parseInt(scanner.nextLine());

            System.out.println("Masukkan nomor rekam medis: ");
            String medicalNumber = scanner.nextLine();

            System.out.println("Masukkan tanggal pembuatan rekam medis (dd-mm-yyyy): ");
            String creationDate = scanner.nextLine();

            Animal pet;
            if (type == 1) {
                pet = new Dog(medicalNumber, creationDate);
            } else {
                pet = new Cat(medicalNumber, creationDate);
            }

            owners[i] = new Owner(name, pet);
            System.out.println();
        }

        System.out.println("\n=== Data Pemilik dan Hewan ===");
        for (Owner owner : owners) {
            Animal pet = owner.getPet();
            System.out.println("Pemilik: " + owner.getName());

            if (pet instanceof Dog) {
                System.out.print("Jenis Hewan: Dog, Suara: ");
            } else if (pet instanceof Cat) {
                System.out.print("Jenis Hewan: Cat, Suara: ");
            }

            pet.makeSound();
            System.out.println("Nomor Rekam Medis: " + pet.getHealthRecord().getMedicalNumber());
            System.out.println("Tanggal Pembuatan Rekam Medis: " + pet.getHealthRecord().getCreationDate());
            System.out.println();
        }

        scanner.close();
    }
}
