package strategy.example1.billing;

import java.util.function.IntUnaryOperator;

public enum BillingStrategy {
    NORMAL(a -> a),
    HAPPY_HOUR(a -> a / 2),
    ;

    private final IntUnaryOperator strategy;

    BillingStrategy(IntUnaryOperator strategy) {
        this.strategy = strategy;
    }

    int getActPrice(int rawPrice) {
        return this.strategy.applyAsInt(rawPrice);
    }

}
