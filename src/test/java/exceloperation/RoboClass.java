package exceloperation;

import java.awt.event.KeyEvent;


import java.awt.Robot;
public class RoboClass {

	public static void main(String[] args) throws Throwable {
		
		Thread.sleep(1000);
		
		
		String notes="notepad.exe";

		Runtime r=Runtime.getRuntime();
		r.exec(notes);
		Thread.sleep(1000);
		Robot robo=new Robot();
		robo.keyPress((KeyEvent.VK_J));
		Thread.sleep(300);
		robo.keyRelease(KeyEvent.VK_J);
		
		robo.keyPress((KeyEvent.VK_E));
		robo.keyRelease((KeyEvent.VK_E));
		
		robo.keyPress((KeyEvent.VK_E));
		robo.keyRelease((KeyEvent.VK_E));
		robo.keyPress((KeyEvent.VK_V));
		robo.keyRelease((KeyEvent.VK_V));
		
		robo.keyPress((KeyEvent.VK_A));
		robo.keyRelease((KeyEvent.VK_A));
		robo.keyPress((KeyEvent.VK_N));
		robo.keyRelease((KeyEvent.VK_N));
		
		
		
		

	}

}
