package Main.Entity;

import Main.Skills.JumpSkill;
import Main.Skills.RunSkill;

public class Human implements JumpSkill, RunSkill {

    private String humanName;
    private int runLength;
    private int jumpHeight;

    public Human(String humanName, int runLength, int jumpHeight) {
        this.humanName = humanName;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public void jump() {
        System.out.println(getHumanName() + " перепрыгивает стену ");

    }

    public void run() {
        System.out.println(getHumanName() + " пробегает беговую дорожку ");
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
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
