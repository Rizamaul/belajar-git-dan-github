class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfoProduk() {
        System.out.println("Kode: " + kodeProduk + ", Nama: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok);
    }

    public boolean kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            return true;
        }
        return false;
    }

    public double getHarga() {
        return harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }
}

class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String email;
    private double saldo;

    public Pelanggan(String idPelanggan, String nama, String email, double saldo) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }

    public void tampilkanInfoPelanggan() {
        System.out.println("ID: " + idPelanggan + ", Nama: " + nama + ", Email: " + email + ", Saldo: " + saldo);
    }

    public void topUpSaldo(double jumlah) {
        saldo += jumlah;
    }

    public boolean kurangiSaldo(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }
}

class Transaksi {
    private String idTransaksi;
    private Pelanggan pelanggan;
    private Produk produk;
    private int jumlahBeli;
    private double totalHarga;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = produk.getHarga() * jumlahBeli;
    }

    public void prosesTransaksi() {
        if (produk.kurangiStok(jumlahBeli) && pelanggan.kurangiSaldo(totalHarga)) {
            System.out.println("Transaksi Berhasil! " + pelanggan.getNama() + " membeli " + jumlahBeli + " " + produk.getNamaProduk());
        } else {
            System.out.println("Transaksi Gagal! Saldo tidak cukup atau stok tidak mencukupi.");
        }
    }

    public void tampilkanDetailTransaksi() {
        System.out.println("ID Transaksi: " + idTransaksi + ", Pelanggan: " + pelanggan.getNama() +
                ", Produk: " + produk.getNamaProduk() + ", Jumlah: " + jumlahBeli + ", Total Harga: " + totalHarga);
    }
}

public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("P001", "Laptop", 7500000, 10);
        Pelanggan pelanggan1 = new Pelanggan("C001", "Ali", "ali@email.com", 10000000);

        p1.tampilkanInfoProduk();
        pelanggan1.tampilkanInfoPelanggan();

        Transaksi t1 = new Transaksi("T001", pelanggan1, p1, 1);
        t1.prosesTransaksi();
        t1.tampilkanDetailTransaksi();
    }
}
