package click.mouse;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;

public class MouseClick {

	public void clicar() throws AWTException, InterruptedException {
		Robot robo = new Robot();
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robo.delay(1000);
	}
}
