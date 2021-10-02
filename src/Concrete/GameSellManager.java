package Concrete;

import Abstract.GameSellService;
import Entities.Campain;
import Entities.Game;
import Entities.Gamer;

public class GameSellManager implements GameSellService {

	private CampainManager campainManager;

	public GameSellManager(CampainManager campainManager) {
		this.campainManager = campainManager;
	}

	public void sell(Gamer gamer, Game game, Campain campain) {

		if (campain.isThereCampain()) {
			
			System.out.println(gamer.getGamerFirstName() + ", " + game.getGameName() + 
					" " + "oyununu satýn aldý." + " "
					+ campain.getCampainName() + " " + "kampanyasýndan yararlandý");
			System.out.println("oyunun kampanyalý fiyatý : "+campain.getDiscountOfUnitPrice(game));

		} else {
			
			System.out.println(gamer.getGamerFirstName() + ", " + game.getGameName() + 
					" " + "oyununu satýn aldý.");
			System.out.println("oyunun fiyatý : "+game.getGamePrice());

		}

	}

}
