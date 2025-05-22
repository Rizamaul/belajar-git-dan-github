public class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("CreditCard:  " + amount + " Memakai mata uang default.");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("CreditCard: " + amount + " Memakai mata uang " + currency + ".");
    }
}
