public class Main {
    public static void main(String[] args) {
        Transportasi[] transportasiList = new Transportasi[3];

        transportasiList[0] = new Bus("Bus", 40, "Bandung");
        transportasiList[1] = new Kereta("Kereta", 100, "Surabaya");
        transportasiList[2] = new Pesawat("Pesawat", 150, "Medan");

        for (Transportasi t : transportasiList) {
            System.out.println(t.getNama() + " ke " + t.getTujuan() +
                " - Harga tiket (default): " + t.hitungHargaTiket());

            if (t instanceof Bus) {
                System.out.println(t.getNama() + " ke " + t.getTujuan() +
                    " - Harga tiket (Bisnis): " + ((Bus) t).hitungHargaTiket("Bisnis"));
            } else if (t instanceof Kereta) {
                System.out.println(t.getNama() + " ke " + t.getTujuan() +
                    " - Harga tiket (VIP): " + ((Kereta) t).hitungHargaTiket("VIP"));
            } else if (t instanceof Pesawat) {
                System.out.println(t.getNama() + " ke " + t.getTujuan() +
                    " - Harga tiket (Ekonomi): " + ((Pesawat) t).hitungHargaTiket("Ekonomi"));
            }
            System.out.println();
        }
    }
}