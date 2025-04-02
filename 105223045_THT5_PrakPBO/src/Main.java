import librarysystem.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(new Buku("Pemrograman Java", "Radit", 2020));
        perpustakaan.tambahBuku(new Buku("Dasar-Dasar OOP", "Akbar", 2018));
        perpustakaan.tambahBuku(new Buku("Algoritma dan Struktur Data", "Adri hidayat", 2019));
        perpustakaan.tambahBuku(new Buku("Dasar pemrograman", "Irfan", 2000));
        perpustakaan.tambahBuku(new Buku("Sistem operasi", "Gerard", 1991 ));
        
        System.out.println("Daftar Buku yang Tersedia di Perpustakaan:");
        perpustakaan.tampilkanBuku();

        System.out.print("\nMasukkan nama user: ");
        String namaUser = scanner.nextLine();
        User user = new User(namaUser, 1);

        System.out.print("\nMasukkan judul buku yang ingin dipinjam: ");
        String judulPinjam = scanner.nextLine();

        boolean bukuDitemukan = false;
        for (Buku buku : perpustakaan.getKoleksiBuku()) {
            if (buku.getJudul().equalsIgnoreCase(judulPinjam)) {
                user.pinjamBuku(buku);
                bukuDitemukan = true;
                break;
            }
        }

        if (!bukuDitemukan) {
            System.out.println("Buku yang kamu cari tidak ditemukan.");
        }
        System.out.println("\nDaftar Buku Setelah Peminjaman:");
        perpustakaan.tampilkanBuku();

        scanner.close();
    }
}
