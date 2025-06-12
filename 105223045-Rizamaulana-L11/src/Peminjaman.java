public class Peminjaman {
    private String namaPeminjam;
    private String idBuku;
    private int lamaPinjam;

    public Peminjaman(String namaPeminjam, String idBuku, int lamaPinjam) {
        this.namaPeminjam = namaPeminjam;
        this.idBuku = idBuku;
        this.lamaPinjam = lamaPinjam;
    }

    public void cetakKonfirmasi() {
        System.out.println("\nKonfirmasi Peminjaman");
        System.out.println("Nama Pengguna: " + namaPeminjam);
        System.out.println("ID Buku: " + idBuku);
        System.out.println("Lama Peminjaman:" + lamaPinjam + " hari");
        System.out.println("Status:Peminjaman berhasil!");
    }
}
