package org.strategy.robot;

public class Pilot {

    private Robot robot;

    public void executeRobot() {
        robot.move();
        robot.attack();
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

}
