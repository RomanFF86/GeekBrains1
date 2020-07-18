package Main;

import Main.Entity.Cat;
import Main.Entity.Human;
import Main.Entity.Robot;
import Main.TreadmillWall.Treadmill;
import Main.TreadmillWall.Wall;

public class Main {
    public static void main(String[] args) {
        Human roman = new Human("Роман", 100, 2);
        Cat yellow = new Cat("Желтый", 500, 3);
        Robot t1000 = new Robot("Т-1000", 10000, 5);
        Treadmill treadmill = new Treadmill(300);
        Wall wall = new Wall(3);

        System.out.println(roman.getHumanName() + " начинает прохождение полосы препятствий");
        if (treadmill.getLength() <= roman.getRunLength()) {
            roman.run();
            if (wall.getHeight() <= roman.getJumpHeight()) {
                roman.jump();
                System.out.println("\n");
            } else System.out.println("Полоса препятствий не пройдена\n");
        } else System.out.println("Полоса препятствий не пройдена\n");


        System.out.println(yellow.getCatName() + " начинает прохождение полосы препятствий");
        if (treadmill.getLength() <= yellow.getRunLength()) {
            yellow.run();
            if (wall.getHeight() <= yellow.getJumpHeight()) {
                yellow.jump();
                System.out.println("\n");
            } else System.out.println("Полоса препятствий не пройдена\n");
        } else System.out.println("Полоса препятствий не пройдена\n");


        System.out.println(t1000.getRobotName() + " начинает прохождение полосы препятствий");
        if (treadmill.getLength() <= t1000.getRunLength()) {
            t1000.run();
            if (wall.getHeight() <= t1000.getJumpHeight()) {
                t1000.jump();
                System.out.println("\n");
            } else System.out.println("Полоса препятствий не пройдена\n");
        } else System.out.println("Полоса препятствий не пройдена\n");
    }
}
