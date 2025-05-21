import java.util.ArrayList;
import java.util.List;

public class Player {
    private String username;
    private int position = 0;
    private List<String> inventory = new ArrayList<>();
    private int health = 100;

    public Player(String username) {
        this.username = username;
    }

    public void moveForward() {
        position++;
    }

    public void moveBackward() {
        position--;
    }

    public int getPosition() {
        return position;
    }

    public int getHealth() {
        return health;
    }

    public void changeHealth(int amount) {
        health += amount;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public void showStatus() {
        System.out.println("Player: " + username);
        System.out.println("Posisi: " + position);
        System.out.println("Health: " + health);
        System.out.println("Inventory: " + inventory);
    }
}
