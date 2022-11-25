package org.strategy.robot;

public class Atom implements Robot {

    @Override
    public void attack() {
        System.out.println("주먹을 사용합니다.");
    }

    @Override
    public void move() {
        System.out.println("날아다닙니다.");
    }

}
