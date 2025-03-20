class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("IPK      : " + ipk);
    }

    public boolean cekLulus() {
        return ipk >= 3.0;
    }

}
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Hilmi Hidayat", "2547", "Teknik Informatika", 3.5);
        mhs1.tampilkanInfo();
        if (mhs1.cekLulus()) {
            System.out.println("Status   : Lulus");
        } else {
            System.out.println("Status   : Tidak Lulus");
        }
    }
}
