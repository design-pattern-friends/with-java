package org.strategy.robot;

public class TaekwonV implements Robot{

    @Override
    public void attack() {
        System.out.println("미사일을 발사합니다.");
    }

    @Override
    public void move() {
        System.out.println("걷습니다.");
    }
}
