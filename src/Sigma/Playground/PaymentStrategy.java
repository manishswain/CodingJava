package Playground;

// ✅ CORRECT - Strategy Pattern
public interface PaymentStrategy {
    void processPayment(Payment payment);
}

 class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void processPayment(Payment payment) {
        validateCard(payment);
        chargeCreditCard(payment);
        sendCreditCardReceipt(payment);
    }
}


 class PayPalStrategy implements PaymentStrategy {
    @Override
    public void processPayment(Payment payment) {
        validatePayPalAccount(payment);
        chargePayPal(payment);
        sendPayPalReceipt(payment);
    }
}


public class CryptoStrategy implements PaymentStrategy {
    @Override
    public void processPayment(Payment payment) {
        validateWallet(payment);
        chargeCrypto(payment);
        sendCryptoReceipt(payment);
    }
}

public class PaymentProcessor {
    private final Map<PaymentType, PaymentStrategy> strategies;
    
    public PaymentProcessor(List<PaymentStrategy> strategyList) {
        // Spring auto-injects all PaymentStrategy implementations
        this.strategies = strategyList.stream()
            .collect(Collectors.toMap(
                this::getPaymentType,
                Function.identity()
            ));
    }
    
    public void processPayment(PaymentType type, Payment payment) {
        PaymentStrategy strategy = strategies.get(type);
        if (strategy == null) {
            throw new UnsupportedPaymentTypeException(type);
        }
        strategy.processPayment(payment);
    }
}
