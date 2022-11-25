package strategy.fly;

public class Booster implements Fly {

    @Override
    public void howFly() {
        System.out.println("난 부스터로 하늘을 날아!");
    }
}
