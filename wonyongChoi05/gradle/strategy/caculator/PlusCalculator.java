package org.strategy.caculator;

public class PlusCalculator implements Calculator{

    @Override
    public double execute(double value1, double value2) {
        return value1 + value2;
    }

}
