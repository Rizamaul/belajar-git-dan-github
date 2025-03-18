import java.util.Scanner;

class Karyawan {
    String id;
    String nama;
    String shift;
    int jamKerja;
    int hariAbsen;
    double gaji;
}

public class HitungGajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = scanner.nextInt();
        scanner.nextLine();
        
        Karyawan[] karyawanList = new Karyawan[jumlahKaryawan];

        for (int i = 0; i < jumlahKaryawan; i++) {
            Karyawan karyawan = new Karyawan();
            System.out.println("\nData Karyawan ke-" + (i + 1));
            
            System.out.print("Masukkan ID Karyawan: ");
            karyawan.id = scanner.nextLine();
            
            System.out.print("Masukkan Nama Karyawan: ");
            karyawan.nama = scanner.nextLine();
            
            System.out.print("Masukkan Shift Kerja (pagi/siang/malam): ");
            karyawan.shift = scanner.nextLine().toLowerCase();
            
            double tarifPerJam;
            switch (karyawan.shift) {
                case "pagi": tarifPerJam = 30000; break;
                case "siang": tarifPerJam = 35000; break;
                case "malam": tarifPerJam = 40000; break;
                default:
                    System.out.println("Shift tidak valid, diatur ke default (pagi).");
                    tarifPerJam = 30000;
            }
            
            while (true) {
                System.out.print("Masukkan total jam kerja dalam seminggu: ");
                karyawan.jamKerja = scanner.nextInt();
                if (karyawan.jamKerja >= 0 && karyawan.jamKerja <= 84) break;
                System.out.println("Jam kerja tidak masuk akal, silakan masukkan lagi.");
            }
            
            while (true) {
                System.out.print("Masukkan jumlah hari absen: ");
                karyawan.hariAbsen = scanner.nextInt();
                scanner.nextLine(); 
                if (karyawan.hariAbsen >= 0 && karyawan.hariAbsen <= 7) break;
                System.out.println("Jumlah hari absen tidak masuk akal, silakan masukkan lagi.");
            }
            
            double gajiMingguan = karyawan.jamKerja * tarifPerJam;
            
            if (karyawan.jamKerja > 40) {
                int jamLembur = karyawan.jamKerja - 40;
                gajiMingguan += jamLembur * tarifPerJam * 1.5;
            } else if (karyawan.jamKerja < 30) {
                gajiMingguan *= 0.9;
            }
            
            gajiMingguan -= karyawan.hariAbsen * 100000;
            karyawan.gaji = gajiMingguan;
            karyawanList[i] = karyawan;
        }
        
        System.out.println("\nLaporan Gaji Karyawan:");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s\n", "ID", "Nama", "Shift", "Jam", "Absen", "Gaji");
        for (Karyawan k : karyawanList) {
            System.out.printf("%-10s %-20s %-10s %-10d %-10d Rp%.2f\n", k.id, k.nama, k.shift, k.jamKerja, k.hariAbsen, k.gaji);
        }
        
        scanner.close();
    }
}
