package navigations;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class JanelaChrome {
	
	public void janela1() throws AWTException, InterruptedException {
		Thread.sleep(3000);
		Robot robo = new Robot();

		// Janela chrome
		robo.mouseMove(460, 750);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	public void janela2() throws AWTException, InterruptedException {
		Thread.sleep(10000);
		Robot robo = new Robot();

		// Janela chrome
		robo.mouseMove(510, 750);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	void janela3() throws AWTException, InterruptedException {
		Thread.sleep(10000);
		Robot robo = new Robot();

		// Janela chrome
		robo.mouseMove(560, 750);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	void janela4() throws AWTException, InterruptedException {
		Thread.sleep(10000);
		Robot robo = new Robot();

		// Janela chrome
		robo.mouseMove(610, 750);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}