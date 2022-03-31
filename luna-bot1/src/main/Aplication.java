package main;
import java.awt.AWTException;
import java.util.Timer;
import java.util.TimerTask;

import boss.SelectBoss;
import heroes.SelectHeros;
import navigations.JanelaChrome;
import start.Start;

public class Aplication {

	public static void main(String[] args) throws AWTException {
		Timer timer = new Timer();

		final double seconds = (((1000 * 60) * 60) * 3);

		TimerTask assignment = new TimerTask() {

			@Override
			public void run() {

				SelectBoss sb = new SelectBoss();
				SelectHeros sh = new SelectHeros();
				Start s = new Start();
				JanelaChrome j = new JanelaChrome();
				try {
					j.janela1();
					sb.selectAdvunture();
					sb.selectBoss();
					sh.selectionHeroesRound1();
					s.start1();		
					
					j.janela2();
					sb.selectAdvunture();
					sb.selectBoss();
					sh.selectionHeroesRound1();
					s.start1();
					
					//s.start2();	
										
					//selectHeros.clickHero2();
					//start.start2();
					//start.start2();
					//start.start2();
										
					//service.returnPlay();
					//selectHeros.clickHero3();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		timer.scheduleAtFixedRate(assignment, 0, (long) seconds);
	}
}
