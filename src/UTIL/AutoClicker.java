package UTIL;

import java.awt.*;
import java.awt.event.*;

public class AutoClicker {
    public static int rate = 0;

    public static void main(String[] args) {

        rate = 300000;

        try {
            Robot robot = new Robot();
            while (true) {
                try {
                    Thread.sleep(rate);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                } catch (InterruptedException ex) {
                }
            }
        } catch (AWTException e) {
        }
    }
}
