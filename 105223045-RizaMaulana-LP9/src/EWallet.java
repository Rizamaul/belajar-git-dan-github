public class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("EWallet: " + amount + " memakai mata uang default.");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("EWallet: " + amount + " memakai mata uang " + currency + ".");
    }
}
