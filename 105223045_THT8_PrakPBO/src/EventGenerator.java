import java.util.Random;

public class EventGenerator {
    private static String[] items = { "Pedang", "Perisai", "Potion", "Koin", "Map" };
    private static Random rand = new Random();

    public static void triggerRandomEvent(Player player) {
        int event = rand.nextInt(4);
        switch (event) {
            case 0:
                String item = items[rand.nextInt(items.length)];
                player.addItem(item);
                System.out.println("Kamu menemukan item: " + item);
                break;
            case 1:
                int damage = rand.nextInt(10) + 5;
                player.changeHealth(-damage);
                System.out.println("Kamu diserang monster! Kehilangan " + damage + " HP.");
                break;
            case 2:
                int heal = rand.nextInt(15) + 5;
                player.changeHealth(heal);
                System.out.println("Kamu menemukan potion dan memulihkan " + heal + " HP.");
                break;
            case 3:
                System.out.println("Tidak terjadi apa-apa.");
                break;
        }
    }
}
