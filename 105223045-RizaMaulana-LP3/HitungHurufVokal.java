import java.util.Scanner;

public class HitungHurufVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        
        int jumlahVokal = hitungVokal(kalimat);

        String hasil;
        switch (jumlahVokal % 2) {
            case 0:
                hasil = "Jumlah vokal genap";
                break;
            case 1:
                hasil = "Jumlah vokal ganjil";
                break;
            default:
                hasil = "Terjadi kesalahan";
        }

        System.out.println("Jumlah huruf vokal dalam kalimat: " + jumlahVokal);
        System.out.println(hasil);
        System.out.print("Kalimat dalam urutan terbalik: ");
        char[] karakter = kalimat.toCharArray();
        for (int i = karakter.length - 1; i >= 0; i--) {
            System.out.print(karakter[i]);
        }
        System.out.println();

        scanner.close();
    }
    public static int hitungVokal(String teks) {
        int jumlah = 0;
        for (char huruf : teks.toLowerCase().toCharArray()) {
            if ("aiueo".indexOf(huruf) != -1) {
                jumlah++;
            }
        }
        return jumlah;
    }
}
