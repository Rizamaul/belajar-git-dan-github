import java.util.Scanner;

class Mobil {
    private String nomorPlat;
    private String merek;
    private double hargaSewaPerHari;
    private boolean tersedia;

    public Mobil() {
        this.nomorPlat = "Unknown";
        this.merek = "Unknown";
        this.hargaSewaPerHari = 0.0;
        this.tersedia = true;
    }
    public Mobil(String nomorPlat, String merek, double hargaSewaPerHari) {
        this.nomorPlat = nomorPlat;
        this.merek = merek;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.tersedia = true;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Merek: " + merek);
        System.out.println("Harga Sewa per Hari: Rp " + hargaSewaPerHari);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Tidak Tersedia"));
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }
}

class Pelanggan {
    private String nama;
    private String nomorKTP;
    private String nomorHP;

    public Pelanggan(String nama, String nomorKTP, String nomorHP) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorHP = nomorHP;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor KTP: " + nomorKTP);
        System.out.println("Nomor HP: " + nomorHP);
    }
}

class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int durasiSewa;
    private double totalBiaya;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int durasiSewa) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.durasiSewa = durasiSewa;
        this.totalBiaya = mobil.getHargaSewaPerHari() * durasiSewa;
    }

    public void prosesSewa() {
        if (mobil.isTersedia()) {
            mobil.setTersedia(false);
            cetakStruk();
        } else {
            System.out.println("Transaksi gagal! Mobil tidak tersedia.");
        }
    }

    public void cetakStruk() {
        System.out.println("\nSTRUK SEWA MOBIL");
        pelanggan.tampilkanInfo();
        System.out.println("Durasi Sewa: " + durasiSewa + " hari");
        System.out.println("Total Biaya: Rp " + totalBiaya);
        System.out.println("Status: Berhasil");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nomor plat mobil: ");
        String nomorPlat = scanner.nextLine();
        System.out.println("Masukkan merek mobil: ");
        String merek = scanner.nextLine();
        System.out.println("Masukkan harga sewa per hari: ");
        double hargaSewaPerHari = scanner.nextDouble();
        scanner.nextLine(); 
        
        Mobil mobil1 = new Mobil(nomorPlat, merek, hargaSewaPerHari);
        
        System.out.println("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan nomor KTP pelanggan: ");
        String nomorKTP = scanner.nextLine();
        System.out.println("Masukkan nomor HP pelanggan: ");
        String nomorHP = scanner.nextLine();
        
        Pelanggan pelanggan1 = new Pelanggan(nama, nomorKTP, nomorHP);
        
        System.out.println("Masukkan durasi sewa (hari): ");
        int durasiSewa = scanner.nextInt();
        
        Sewa sewa1 = new Sewa(pelanggan1, mobil1, durasiSewa);
        sewa1.prosesSewa();
        
        scanner.close();
    }
}
