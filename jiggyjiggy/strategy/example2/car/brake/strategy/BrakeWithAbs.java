package strategy.example2.car.brake.strategy;

public class BrakeWithAbs implements IBrakeBehavior {
    @Override
    public void brake() {
        System.out.println("Brake with ABS applied");
    }
}
