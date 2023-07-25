package StrategyPattern;

/**
 *
 * @author ahxxm
 */
public class StrategyPatternExample {
    public static void main(String[] args) {
    PaymentProcessor paymentProcessor = new PaymentProcessor();

    // Choose and set the payment strategy
    paymentProcessor.setPaymentStrategy(new CreditCardPayment());
    paymentProcessor.processPayment(100.50); // Processes payment using credit card

    paymentProcessor.setPaymentStrategy(new PayPalPayment());
    paymentProcessor.processPayment(75.20); // Processes payment using PayPal

    paymentProcessor.setPaymentStrategy(new BankTransferPayment());
    paymentProcessor.processPayment(200.10); // Processes payment using bank transfer
}

}
