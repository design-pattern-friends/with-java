package strategy.example2.car;

import strategy.example2.car.brake.strategy.Brake;

public class Sedan extends Car {
    public Sedan() {
        super(new Brake());
    }
}
