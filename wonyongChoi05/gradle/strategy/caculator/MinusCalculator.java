package org.strategy.caculator;

public class MinusCalculator implements Calculator{

    @Override
    public double execute(double value1, double value2) {
        return value1 - value2;
    }

}
