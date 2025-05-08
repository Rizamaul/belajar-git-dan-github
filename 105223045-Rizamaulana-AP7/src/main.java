class Kendaraan{ // Super Class / Parent Class
    
    String merk = "Toyota";

    Kendaraan(){
        System.out.println("ini constructor parent");
    }
    void jalan(){
        System.out.println("kendaraan sedang berjalan");
    }
}

class Mobil extends Kendaraan { // Sub Class / Child Class
    Mobil(){
        super();
        System.out.println("ini constructor child");
    }

    void printInfo(){
        System.out.println("merk mobil child " + merk);
        System.out.println("merk mobil parent"  + super.merk);
    }
    void klakson(String merk){
        System.out.println("mobil " + super.merk + " klakson");
    }
}

public class main{
    public static void main(String[] args) {
        Mobil jazz = new Mobil();
        jazz.jalan();
        jazz.jalan();
        jazz.klakson ("BMW");
        System.out.println(jazz.merk);
    }
}