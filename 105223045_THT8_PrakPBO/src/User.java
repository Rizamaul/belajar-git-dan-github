import java.util.HashMap;

public class User {
    private static HashMap<String, String> accounts = new HashMap<>();

    public static boolean register(String username, String password) {
        if (accounts.containsKey(username)) {
            return false;
        }
        accounts.put(username, password);
        return true;
    }

    public static boolean login(String username, String password) {
        return accounts.containsKey(username) && accounts.get(username).equals(password);
    }
}
