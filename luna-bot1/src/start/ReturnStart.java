package start;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class ReturnStart {
	public void returnPlay() throws AWTException, InterruptedException {
		Thread.sleep(1000);
		Robot robo = new Robot();
		/*
		 * Robot robo = new Robot(); // Janela Chrome robo.mouseMove(455, 750);
		 * robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		 * robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); robo.setAutoDelay(500);
		 */

		Color cResgate = new Color(234, 175, 57);		
		Color colorResgate = new Color(234, 175, 57);

		if (colorResgate.equals(cResgate)) {
			robo.mouseMove(670, 580);
			robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

			robo.mouseMove(670, 584);
			robo.setAutoDelay(1500);
			robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		} else {
			robo.setAutoDelay(1500);
			robo.mouseMove(670, 584);
			robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		}
	}
}
