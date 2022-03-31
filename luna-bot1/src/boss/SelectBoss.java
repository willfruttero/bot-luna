package boss;


import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;

import colors.GetColor;
import heroes.SelectHeros;
import services.MouseMove;

public class SelectBoss {
	SelectHeros selectHeros = new SelectHeros();
	MouseMove m = new MouseMove();
	GetColor getcolorBoss1 = new GetColor();
	GetColor getcolorBoss2 = new GetColor();
	GetColor getcolorBoss3 = new GetColor();
	GetColor colorBossActive = new GetColor();
	GetColor colorBoss = new GetColor();

	public void selectAdvunture() throws AWTException, InterruptedException {

		Thread.sleep(1000);
		m.cacarBoss();
	}

	public void selectBoss() throws AWTException, InterruptedException {
		Thread.sleep(3000);
		Robot robo = new Robot();
		Robot csb = new Robot();

		// Cor do Boss ativo
		colorBossActive.colorBossDefault();

		// Capturar cor Boss1
		Color colorBoss1 = new Color(79, 223, 143);
		Color colorBoss2 = new Color(79, 22, 140);
		Color colorBoss3 = new Color(74, 219, 130);
		Color colorBoss4 = new Color(70, 218, 124);
		Color colorBoss5 = new Color(69, 216, 118);
		Color colorBoss6 = new Color(143, 235, 186);
		Color colorBoss7 = new Color(143, 235, 188);
		Color colorBoss8 = new Color(143, 235, 187);
		Color colorBoss9 = new Color(145, 235, 186);

		colorBossActive.colorBossDefault();

		robo.setAutoDelay(4000);
		if (csb.getPixelColor(556, 282).equals(colorBoss1) || csb.getPixelColor(556, 282).equals(colorBoss2)
				|| csb.getPixelColor(556, 282).equals(colorBoss3) || csb.getPixelColor(556, 282).equals(colorBoss4)
				|| csb.getPixelColor(556, 282).equals(colorBoss5)|| csb.getPixelColor(633, 251).equals(colorBoss6)|| csb.getPixelColor(641, 252).equals(colorBoss7)|| csb.getPixelColor(641, 252).equals(colorBoss8)|| csb.getPixelColor(633, 251).equals(colorBoss9)) {
			m.mBoss1();
		} else if (csb.getPixelColor(639, 505).equals(colorBoss1) || csb.getPixelColor(639,
				505).equals(colorBoss2)
				|| csb.getPixelColor(639, 505).equals(colorBoss3) || csb.getPixelColor(639, 505).equals(colorBoss4)
				|| csb.getPixelColor(639, 505).equals(colorBoss5)) {

			m.mBoss2();
		} else /*if (csb.getPixelColor(815, 277).equals(colorBoss1) || csb.getPixelColor(815, 277).equals(colorBoss2)
				|| csb.getPixelColor(815, 277).equals(colorBoss3) || csb.getPixelColor(815, 277).equals(colorBoss4)
				|| csb.getPixelColor(815, 277).equals(colorBoss5))*/ {
			m.mBoss3();
		}
	}
}
