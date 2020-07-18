package Main.Entity;

import Main.Skills.JumpSkill;
import Main.Skills.RunSkill;

public class Robot implements JumpSkill, RunSkill {
    private String robotName;
    private int runLength;
    private int jumpHeight;

    public Robot(String robotName, int runLength, int jumpHeight) {
        this.robotName = robotName;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public void jump() {
        System.out.println(getRobotName() + " перепрыгивает стену ");

    }

    public void run() {
        System.out.println(getRobotName() + " пробегает беговую дорожку ");
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public int getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}
