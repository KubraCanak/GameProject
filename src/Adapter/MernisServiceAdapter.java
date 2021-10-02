package Adapter;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {
	
	public boolean confirm=false;

	KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) throws RemoteException {

		boolean result = proxy.TCKimlikNoDogrula(gamer.getNationalityId(), gamer.getGamerFirstName(),
				gamer.getGamerLastName(), gamer.getDateOfBirth());

		if (result == true) {

			System.out.println("oyuncu doðrulamasý baþarýlý...");
			confirm=true;
			
			return true;
		} else {
			System.out.println("oyuncu doðrulamasý baþarýsýz...");
			confirm=false;
			return false;
		}

		
	}

}
