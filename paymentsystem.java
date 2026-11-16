class Payment {
    void pay(double amount) {
        System.out.println("Payment Amount: " + amount);
    }
}

class CashPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid by Cash: " + amount);
    }
}

class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid by Card: " + amount);
    }
}

public class paymentsystem {
    public static void main(String[] args) {

        Payment p;

        p = new CashPayment();
        p.pay(1000);

        p = new CardPayment();
        p.pay(2000);
    }
}