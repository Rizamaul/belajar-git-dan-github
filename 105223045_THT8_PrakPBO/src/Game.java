import java.util.Scanner;

public class Game {
    private static Scanner scanner = new Scanner(System.in);

    public static void start() {
        System.out.println("=== Selamat Datang di Game Petualangan ===");
        while (true) {
            System.out.print("1. Login\n2. Register\nPilih: ");
            String choice = scanner.nextLine();

            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            boolean success = false;
            if (choice.equals("1")) {
                success = User.login(username, password);
                if (!success) {
                    System.out.println("Login gagal!");
                    continue;
                }
            } else if (choice.equals("2")) {
                success = User.register(username, password);
                if (!success) {
                    System.out.println("Username sudah terdaftar!");
                    continue;
                }
                System.out.println("Registrasi berhasil! Silakan login.");
                continue;
            } else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            Player player = new Player(username);
            play(player);
        }
    }

    private static void play(Player player) {
        System.out.println("\nMulai petualangan!");
        while (true) {
            System.out.print("\nAksi (w: maju, s: mundur, e: status, q: keluar): ");
            String action = scanner.nextLine();
            switch (action) {
                case "w":
                    player.moveForward();
                    EventGenerator.triggerRandomEvent(player);
                    break;
                case "s":
                    player.moveBackward();
                    EventGenerator.triggerRandomEvent(player);
                    break;
                case "e":
                    player.showStatus();
                    break;
                case "q":
                    System.out.println("Keluar dari permainan...");
                    return;
                default:
                    System.out.println("Aksi tidak dikenal.");
            }

            if (player.getHealth() <= 0) {
                System.out.println("Kamu mati dalam petualangan. Game over!");
                break;
            }
        }
    }
}
