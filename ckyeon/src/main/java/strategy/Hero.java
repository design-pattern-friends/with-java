package strategy;

import strategy.fly.Fly;
import strategy.weapon.Weapon;

public class Hero {

    private final Fly fly;
    private final String name;
    private final Weapon weapon;

    public Hero(HeroInfo heroInfo) {
        this.name = heroInfo.getName();
        this.fly = heroInfo.getFly();
        this.weapon = heroInfo.getWeapon();
    }

    public void introduce() {
        sayHello();
        fly.howFly();
        System.out.println();
    }

    public void attack() {
        weapon.attack();
        System.out.println();
    }

    private void sayHello() {
        System.out.printf("안녕 나는 %s!\n", name);
    }
}
