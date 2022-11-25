package strategy.example2.car;

import strategy.example2.car.brake.strategy.BrakeWithAbs;

public class SUV extends Car {
    public SUV() {
        super(new BrakeWithAbs());
    }
}
