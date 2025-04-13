import universitas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenMahasiswa manajer = new ManajemenMahasiswa();
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Prodi : ");
                    String prodi = input.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = input.nextDouble();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, ipk);
                    manajer.tambahMahasiswa(mhs);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("DAFTAR MAHASISWA:");
                    manajer.tampilkanSemua();
                    break;

                case 3:
                    manajer.tampilkanIPKTertinggi();
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);
        
        input.close();
    }
}
