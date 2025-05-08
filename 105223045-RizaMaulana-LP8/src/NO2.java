class Kendaraan {

    Kendaraan() {
        System.out.println("Konstruktor Kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan {
    
    Mobil() {
        super(); // Memanggil konstruktor superclass (Kendaraan)
        System.out.println("Konstruktor Mobil dipanggil");
    }
}

public class NO2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
    }
}
