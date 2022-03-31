package services;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseMove {

	public void cacarBoss() throws AWTException {
		Robot mCacarBoss = new Robot();
		// Caçar chefe
		mCacarBoss.mouseMove(355, 400);
		mCacarBoss.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		mCacarBoss.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	public void mBoss1() throws AWTException {
		Robot mBoss1 = new Robot();
		mBoss1.mouseMove(550, 280);
		mBoss1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		mBoss1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	public void mBoss2() throws AWTException {
		Robot mBoss2 = new Robot();
		mBoss2.mouseMove(635, 500);
		mBoss2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		mBoss2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		mBoss2.setAutoDelay(100);
		mBoss2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		mBoss2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	public void mBoss3() throws AWTException {
		Robot mBoss3 = new Robot();
		mBoss3.mouseMove(815, 290);
		mBoss3.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		mBoss3.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		mBoss3.setAutoDelay(100);
		mBoss3.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		mBoss3.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	
	public void buttonClickCacarBossStart() throws AWTException {		
		Robot robo = new Robot();
		robo.mouseMove(1030, 610);
	}	
}