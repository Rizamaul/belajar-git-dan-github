import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan nama pengguna: ");
            String nama = scanner.nextLine().trim();

            System.out.print("Masukkan ID buku: ");
            String idBuku = scanner.nextLine().trim().toUpperCase();

            if (!BookValidator.isValidBookID(idBuku)) {
                throw new InvalidBookIDException("ID buku tidak ditemukan dalam sistem.");
            }

            System.out.print("Masukkan lama peminjaman (hari): ");
            int lamaPinjam = scanner.nextInt();
            if (lamaPinjam <= 0) {
                throw new IllegalArgumentException("Lama peminjaman harus lebih dari 0 hari.");
            }

            // Proses
            Peminjaman peminjaman = new Peminjaman(nama, idBuku, lamaPinjam);
            peminjaman.cetakKonfirmasi();

        } catch (InvalidBookIDException e) {
            System.err.println("Kesalahan: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Kesalahan Input: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan tidak terduga: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nProgram selesai. Terima kasih.");
        }
    }
}
