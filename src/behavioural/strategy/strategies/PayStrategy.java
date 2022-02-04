package behavioural.strategy.strategies;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
