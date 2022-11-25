package strategy.example2;

import strategy.example2.car.Car;
import strategy.example2.car.SUV;
import strategy.example2.car.Sedan;
import strategy.example2.car.brake.strategy.BrakeWithAbs;

public class CarExample {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        sedan.applyBrake(); // 출력: Simple Brake applied

        Car suv = new SUV();
        suv.applyBrake(); // 출력: Brake with ABS applied

        sedan.setBrakeBehavior(new BrakeWithAbs());
        sedan.applyBrake(); // 출력: Brake with ABS applied
    }
}
