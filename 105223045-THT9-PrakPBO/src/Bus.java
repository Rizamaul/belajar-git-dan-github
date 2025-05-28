public class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }
    @Override
    public double hitungHargaTiket() {
        return 100000.0 * 1.10;
    }
    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            harga *= 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            harga *= 1.50;
        }
        return harga;
    }
}