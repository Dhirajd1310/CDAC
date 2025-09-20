
abstract class Payment {
    abstract void pay();
}


class CreditCardPayment extends Payment {
    private long cardNumber;
    private double amount;

    CreditCardPayment(long cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " -> Rs. " + amount + " Paid");
    }
}


class UPIPayment extends Payment {
    private String upiId;
    private double amount;

    UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via UPI " + upiId + " -> Rs. " + amount + " Paid");
    }
}


class PaymentDriver18 {
    public static void main(String[] args) {
        
        Payment p = new CreditCardPayment(1234567890123456L, 5000);
        p.pay();

        
        p = new UPIPayment("rahul@upi", 2000);
        p.pay();
    }
}
