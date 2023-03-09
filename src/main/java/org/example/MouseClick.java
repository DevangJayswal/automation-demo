package org.example;

import java.awt.*;
import java.awt.event.InputEvent;

public class MouseClick {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.mouseMove(133, 707);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);



//        getMouseCoordinate();
    }

    private static void getMouseCoordinate() throws InterruptedException {
        while (true) {
            // get mouse location
            Point location = MouseInfo.getPointerInfo().getLocation();
            System.out.println(location);
            Thread.sleep(2000);
        }
    }
}
