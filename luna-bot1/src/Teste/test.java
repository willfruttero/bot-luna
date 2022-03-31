package Teste;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class test {
	public static void main(String[] args) throws Exception {
	
			
				Robot robo = new Robot();
				robo.delay(1000);
				robo.mouseMove(460, 750);
				robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				
				robo.delay(2000);
				robo.mouseMove(473, 332);
				Color lifeColor = robo.getPixelColor(473, 332);
				System.out.println(lifeColor);
	}
}
