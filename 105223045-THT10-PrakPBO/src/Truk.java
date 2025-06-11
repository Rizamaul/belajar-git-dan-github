public class Truk extends Kendaraan implements DapatDisewa, Muatan {
    private double muatan;

    public Truk(String platNomor, String merk, int tahunProduksi, double muatan) {
        super(platNomor, merk, tahunProduksi);
        this.muatan = muatan;
    }

    @Override
    public double kapasitasMuatan() {
        return muatan;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 1000000 + muatan * 10;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }
}