package Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TestRobot {
	public static void pressKey(Robot robot, int keyvalue) {
		robot.keyPress(keyvalue);
		robot.keyRelease(keyvalue);
	}

	public static void pressKeyWithShift(Robot robot, int keyvalue) {
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(keyvalue);
		robot.keyRelease(keyvalue);
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void closeApplication(Robot robot) {
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
	}

	public static void main(String[] args) throws Exception {
		try {
			Robot robot = new Robot();
			Runtime.getRuntime().exec("notepad");
			robot.delay(1000);
			
			pressKey(robot, KeyEvent.VK_I);
			pressKey(robot, KeyEvent.VK_SHIFT);
			pressKey(robot, KeyEvent.VK_SPACE);
			
			robot.delay(500);
			
			pressKey(robot, KeyEvent.VK_L);
			pressKey(robot, KeyEvent.VK_O);
			pressKey(robot, KeyEvent.VK_V);
			pressKey(robot, KeyEvent.VK_E);
			pressKey(robot, KeyEvent.VK_SPACE);
			
			robot.delay(500);
			
			pressKey(robot, KeyEvent.VK_Y);
			pressKey(robot, KeyEvent.VK_O);
			pressKey(robot, KeyEvent.VK_U);
			
			//closeApplication(robot);
			// robot.keyPress(KeyEvent.VK_SPACE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
