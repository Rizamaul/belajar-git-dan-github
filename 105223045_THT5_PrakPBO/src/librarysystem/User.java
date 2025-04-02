package librarysystem;

public class User {
    private String nama;
    private int idUser;

    public User(String nama, int idUser) {
        this.nama = nama;
        this.idUser = idUser;
    }

    public void pinjamBuku(Buku buku) {
        if (!buku.isStatusDipinjam()) {
            buku.pinjamBuku();
            System.out.println(nama + " berhasil meminjam buku: " + buku.getJudul());
        } else {
            System.out.println("Buku " + buku.getJudul() + " sedang dipinjam.");
        }
    }

    public void kembalikanBuku(Buku buku) {
        if (buku.isStatusDipinjam()) {
            buku.kembalikanBuku();
            System.out.println(nama + " berhasil mengembalikan buku: " + buku.getJudul());
        } else {
            System.out.println("Buku " + buku.getJudul() + " tidak sedang dipinjam.");
        }
    }
}
