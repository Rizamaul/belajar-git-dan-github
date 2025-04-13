package universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilkanSemua() {
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanData();
        }
    }

    public void tampilkanIPKTertinggi() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        Mahasiswa tertinggi = daftarMahasiswa.get(0);
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getIpk() > tertinggi.getIpk()) {
                tertinggi = m;
            }
        }

        System.out.println("Mahasiswa dengan IPK tertinggi:");
        tertinggi.tampilkanData();
    }
}
