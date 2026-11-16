class Payment {
    void processPayment(double amount) {
        System.out.println("Processing Payment...");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }
}

class MobileBankingPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Mobile Banking Payment: " + amount);
    }
}

public class PaymentMethods {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new MobileBankingPayment();

        p1.processPayment(5000);
        p2.processPayment(3000);
    }
}

    

