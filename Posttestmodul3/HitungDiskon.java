import java.util.Scanner;

public class HitungDiskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Input total belanja harus berupa angka.");
            return;
        }
        double totalBelanja = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Masukkan tipe member (Platinum/Gold/Silver/Tidak ada): ");
        String tipeMember = scanner.nextLine().trim();

        if (totalBelanja < 0) {
            System.out.println("Error: Total belanja tidak boleh negatif.");
            return;
        }

        double diskonUtama = 0;
        if (totalBelanja > 500000) {
            diskonUtama = 0.2;
        } else if (totalBelanja >= 250000) {
            diskonUtama = 0.1;
        }

        double totalSetelahDiskon = totalBelanja - (totalBelanja * diskonUtama);
        double diskonTambahan = 0;
        switch (tipeMember.toLowerCase()) {
            case "platinum":
                diskonTambahan = 0.05;
                break;
            case "gold":
                diskonTambahan = 0.03;
                break;
            case "silver":
                diskonTambahan = 0.02;
                break;
            case "tidak ada":
                diskonTambahan = 0;
                break;
            default:
                System.out.println("Error: Tipe member tidak valid.");
                return;
        }

        double totalAkhir = totalSetelahDiskon - (totalSetelahDiskon * diskonTambahan);

        boolean mendapatkanDiskon = diskonUtama > 0;
        System.out.println(mendapatkanDiskon ? "Anda mendapatkan diskon!" : "Anda tidak mendapatkan diskon.");
        System.out.printf("Total yang harus dibayar setelah diskon: Rp %.2f\n", totalAkhir);
    }
}
