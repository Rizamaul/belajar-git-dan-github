public class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("BankTransfer:  " + amount + " Memakai mata uang default.");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("BankTransfer: " + amount + " Memakai mata uang " + currency);
    }
}
