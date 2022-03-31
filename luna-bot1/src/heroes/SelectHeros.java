package heroes;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class SelectHeros {

	public void selectionHeroesRound1() throws AWTException, InterruptedException {
		Thread.sleep(2500);

		Robot robo = new Robot();
		
		// Seleciona personagens		
		// Primeiro
		robo.mouseMove(250, 550);
		robo.setAutoDelay(2000);
		robo.mouseWheel(16);		
		robo.setAutoDelay(1000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// Segundo
		robo.setAutoDelay(1500);
		robo.mouseMove(250, 400);
		robo.setAutoDelay(2000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// Terceiro
		robo.setAutoDelay(1500);
		robo.mouseMove(250, 250);
		robo.setAutoDelay(2000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	public void clickHero2() throws AWTException, InterruptedException {
		Thread.sleep(2500);
		Robot robo = new Robot();
		
		// Seleciona personagem		
		// Primeiro
		robo.mouseMove(250, 550);
		robo.setAutoDelay(2000);
		robo.mouseWheel(16);
		robo.setAutoDelay(1000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// Segundo
		robo.setAutoDelay(1500);
		robo.mouseMove(250, 400);
		robo.setAutoDelay(2000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// Terceiro
		robo.setAutoDelay(1500);
		robo.mouseMove(250, 250);
		robo.setAutoDelay(2000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	void clickHero3() throws AWTException, InterruptedException {
		Thread.sleep(2500);
		Robot robo = new Robot();
		
		// Seleciona personagem		
		// Primeiro
		
		robo.mouseMove(250, 550);
		robo.setAutoDelay(1000);
		robo.mouseWheel(16);
		robo.setAutoDelay(2000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// Segundo
		robo.setAutoDelay(1500);
		robo.mouseMove(250, 400);
		robo.setAutoDelay(2000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// Terceiro
		robo.setAutoDelay(1500);
		robo.mouseMove(250, 250);
		robo.setAutoDelay(2000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);		
	}

}
