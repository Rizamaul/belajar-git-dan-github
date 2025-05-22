public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCard(),
            new EWallet(),
            new BankTransfer()
        };

        for (PaymentMethod payment : payments) {
            payment.processPayment(100.0); 
            payment.processPayment(150.0, "USD"); 
        }
    }
}
