public class Main {
    public static void main(String[] args) {
        DapatDisewa[] daftarKendaraan = new DapatDisewa[3];

        daftarKendaraan[0] = new MobilPribadi("B1234ABC", "Toyota", 2020);
        daftarKendaraan[1] = new Bus("D5678DEF", "Mercedes", 2018);
        daftarKendaraan[2] = new Truk("E9012GHI", "Isuzu", 2019, 5000);

        for (DapatDisewa kendaraan : daftarKendaraan) {
            if (kendaraan instanceof Kendaraan) {
                ((Kendaraan) kendaraan).tampilkanInfo();
                System.out.println("Biaya Sewa 3 hari: Rp" + kendaraan.hitungBiayaSewa(3));
                System.out.println("Perlu Supir: " + (kendaraan.perluSupir() ? "Ya" : "Tidak"));

                if (kendaraan instanceof Muatan) {
                    System.out.println("Kapasitas Muatan: " + ((Muatan) kendaraan).kapasitasMuatan() + " kg");
                }

               
            }
        }
    }
}