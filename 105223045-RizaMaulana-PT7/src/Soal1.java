class Bangunan {
    String nama = "Bangunan Umum";
}


class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";


    void tampilkanInfo() {
        System.out.println("Nama subclass: " + this.nama);
        System.out.println("Nama superclass: " + super.nama);
    }

    
    public static void main(String[] args) {
        GedungSekolah gs = new GedungSekolah();
        gs.tampilkanInfo();
    }
}
