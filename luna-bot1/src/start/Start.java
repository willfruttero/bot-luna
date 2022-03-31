package start;

import click.mouse.MouseClick;
import colors.GetColor;
import heroes.SelectHeros;
import services.MouseMove;

public class Start {

	SelectHeros selectHeros = new SelectHeros();
	GetColor gch = new GetColor();
	GetColor gchd= new GetColor();
	MouseMove mcs = new MouseMove();
	MouseClick mc = new MouseClick();

	public void start1() throws Exception {
		Thread.sleep(2500);
		// Cor das lifes dos heroes
		//gch.getColorLifeHeroDefault(null);
		//gchd.getColorLifeHero(null);	

		if (gch.equals(gchd)) {
			// Verifica a vida dos personagens
			mcs.buttonClickCacarBossStart();
			mc.clicar();			
		} else {
			selectHeros.selectionHeroesRound1();
		}		
	}	
}
