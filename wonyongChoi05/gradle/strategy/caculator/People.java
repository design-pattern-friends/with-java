package org.strategy.caculator;

public class People {

    private final Calculator calculator;
    private final double value1;
    private final double value2;

    public People(Calculator calculator, double value1, double value2) {
        this.calculator = calculator;
        this.value1 = value1;
        this.value2 = value2;
    }

    public double execute() {
        return calculator.execute(value1, value2);
    }

}
