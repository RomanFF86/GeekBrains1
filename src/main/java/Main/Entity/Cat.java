package Main.Entity;

import Main.Skills.JumpSkill;
import Main.Skills.RunSkill;

public class Cat implements JumpSkill, RunSkill {
    private String catName;
    private int runLength;
    private int jumpHeight;

    public Cat(String catName, int runLength, int jumpHeight) {
        this.catName = catName;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public void jump() {
        System.out.println(getCatName() + " Перепрыгивает стену \n");

    }

    public void run() {
        System.out.println(getCatName() + " Пробегает беговую дорожку \n");
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

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
