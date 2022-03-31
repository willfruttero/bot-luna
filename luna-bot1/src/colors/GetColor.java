package colors;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;

public class GetColor {
	
	
	public Color colorBossDefault() throws AWTException {
		Color colorBoss = new Color(77, 220, 137);
		return colorBoss;
	}

	public Color getColorBoss1() throws AWTException {
		Robot corBoss1 = new Robot();
		corBoss1.setAutoDelay(1500);
		Color colorBoss1 = corBoss1.getPixelColor(550, 280);
		return colorBoss1;
	}

	public Color getColorBoss2() throws AWTException {
		Robot corBoss2 = new Robot();
		corBoss2.setAutoDelay(1500);
		Color colorBoss2 = corBoss2.getPixelColor(635, 500);
		return colorBoss2;
	}

	public Color getColorBoss3() throws AWTException {
		Robot corBoss3 = new Robot();
		corBoss3.setAutoDelay(1500);
		Color colorBoss3 = corBoss3.getPixelColor(815, 290);
		return colorBoss3;
	}
			
	public Color buttonStartColorDefatult() throws AWTException {		
		Color buttonStartColorDefatult = new Color(228, 154, 47);
		return buttonStartColorDefatult;
	}
	
	public Color getButtonStartColor() throws AWTException {
		Robot robo = new Robot();
		Color gbtsc = robo.getPixelColor(1030, 610);
		return gbtsc;
	}
	

}
