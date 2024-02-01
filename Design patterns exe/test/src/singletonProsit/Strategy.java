package singletonProsit;

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card: " + cardNumber + " (Cardholder: " + name + ")");
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal (Email: " + email + ")");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {
        // Création d'un panier
        ShoppingCart shoppingCart = new ShoppingCart();

        // Utilisation de la stratégie de paiement par carte de crédit
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        shoppingCart.setPaymentStrategy(creditCardPayment);
        shoppingCart.checkout(100);

        // Utilisation de la stratégie de paiement par PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        shoppingCart.setPaymentStrategy(payPalPayment);
        shoppingCart.checkout(50);
    }
}