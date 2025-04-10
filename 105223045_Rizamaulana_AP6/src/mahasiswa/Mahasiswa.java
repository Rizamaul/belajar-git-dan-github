package mahasiswa;

public class Mahasiswa {
    private String nama;
    private String NIM;

    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    public String getnama(){
        return nama;
    }

    public String getNIM(){
        return NIM;
    }
}

