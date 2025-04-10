package utama;

import dosen.Dosen;
import mahasiswa.Mahasiswa;
import mataKuliah.MataKuliah;
import java.util.ArrayList;

public class Utama {
    public static void main(String[] args) {
        // Membuat objek dosen
        Dosen cahya = new Dosen("Cahya", "D001");
        Dosen budi = new Dosen("Budi", "D002");

        // Membuat objek mahasiswa
        Mahasiswa tiara = new Mahasiswa("Tiara", "M001");
        Mahasiswa diana = new Mahasiswa("Diana", "M002");

        // Mata kuliah PBO
        MataKuliah pbo = new MataKuliah("PBO", "123");
        ArrayList<Dosen> pengampuPBO = new ArrayList<>();
        pengampuPBO.add(cahya);
        ArrayList<Mahasiswa> mahasiswaPBO = new ArrayList<>();
        mahasiswaPBO.add(tiara);
        mahasiswaPBO.add(diana);
        pbo.setPengampu(pengampuPBO);
        pbo.setDaftarMahasiswa(mahasiswaPBO);

        // Mata kuliah Kompar
        MataKuliah kompar = new MataKuliah("Kompar", "124");
        ArrayList<Dosen> pengampuKompar = new ArrayList<>();
        pengampuKompar.add(budi);
        ArrayList<Mahasiswa> mahasiswaKompar = new ArrayList<>();
        mahasiswaKompar.add(tiara);
        mahasiswaKompar.add(diana);
        kompar.setPengampu(pengampuKompar);
        kompar.setDaftarMahasiswa(mahasiswaKompar);

        // Mata kuliah Methnum
        MataKuliah methnum = new MataKuliah("Methnum", "125");
        ArrayList<Dosen> pengampuMethnum = new ArrayList<>();
        pengampuMethnum.add(budi);
        ArrayList<Mahasiswa> mahasiswaMethnum = new ArrayList<>();
        mahasiswaMethnum.add(tiara);
        methnum.setPengampu(pengampuMethnum);
        methnum.setDaftarMahasiswa(mahasiswaMethnum);

        // Menampilkan data
        tampilkanData(pbo);
        tampilkanData(kompar);
        tampilkanData(methnum);
    }

    public static void tampilkanData(MataKuliah matakuliah) {
        System.out.println("Mata Kuliah: " + matakuliah.getNama());
        System.out.println("Kode Mata Kuliah: " + matakuliah.getKodeMK());

        System.out.print("Pengampu: ");
        for (Dosen d : matakuliah.getPengampu()) {
            System.out.print(d.getNama() + " ");
        }
        System.out.println();

        System.out.print("Mahasiswa: ");
        for (Mahasiswa m : matakuliah.getDaftarMahasiswa()) {
            System.out.print(m.getNama() + " ");
        }
        System.out.println("\n");
    }
}