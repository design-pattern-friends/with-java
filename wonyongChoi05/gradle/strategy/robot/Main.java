package org.strategy.robot;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();

        System.out.println("태권V 로봇 선택");
        System.out.println("============");
        pilot.setRobot(new TaekwonV());
        pilot.executeRobot();

        System.out.println();

        System.out.println("아톰 로봇 선택");
        System.out.println("============");
        pilot.setRobot(new Atom());
        pilot.executeRobot();
    }
}
