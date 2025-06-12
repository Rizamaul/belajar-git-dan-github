public class BookValidator {
    private static final String[] VALID_BOOK_IDS = {"B001", "B002", "B003"};

    public static boolean isValidBookID(String id) {
        for (String validID : VALID_BOOK_IDS) {
            if (validID.equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
}
