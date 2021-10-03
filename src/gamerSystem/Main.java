package gamerSystem;

import java.rmi.RemoteException;

import Adapter.MernisServiceAdapter;
import Concrete.CampainManager;
import Concrete.GameSellManager;
import Concrete.GamerManager;
import Entities.Campain;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws RemoteException {

		Gamer gamer1 = new Gamer();
		gamer1.setGamerId(1);
		gamer1.setGamerFirstName("kübra");
		gamer1.setGamerLastName(".....");
		gamer1.setDateOfBirth(1994);
		gamer1.setNationalityId(1111111111L);

		Game game1 = new Game();
		game1.setGameId(1);
		game1.setGameName("tetris");
		game1.setGamePrice(100);

		Campain campain1 = new Campain();
		campain1.setCampainId(1);
		campain1.setCampainName("indirim");
		campain1.setRateOfDiscount(50);
		campain1.setThereCampain(true);

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);

		CampainManager campainManagger = new CampainManager(campain1);
		campainManagger.add(campain1);

		GameSellManager gameSellManager = new GameSellManager(new CampainManager(campain1));
		gameSellManager.sell(gamer1, game1, campain1);

	}

}
