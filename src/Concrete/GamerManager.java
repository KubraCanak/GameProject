package Concrete;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Adapter.MernisServiceAdapter;
import Entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) throws RemoteException {
		
		
		if (gamerCheckService.CheckIfRealPerson(gamer)) {
			
			System.out.println(gamer.getGamerFirstName()+" "+gamer.getGamerLastName()+" "+"oyuncusu sisteme eklendi");
		} else {
			System.out.println("oyuncu sisteme eklenemez");

		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getGamerFirstName() + " " + gamer.getGamerLastName() + " "
				+ "oyuncusunun bilgileri güncellendi.");

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(
				gamer.getGamerFirstName() + " " + gamer.getGamerLastName() + " " + "oyuncusunun kaydý silindi.");

	}

}
