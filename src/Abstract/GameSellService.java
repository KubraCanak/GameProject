package Abstract;

import Entities.Campain;
import Entities.Game;
import Entities.Gamer;

public interface GameSellService {

	

	void sell(Gamer gamer, Game game, Campain campain);
	
}
