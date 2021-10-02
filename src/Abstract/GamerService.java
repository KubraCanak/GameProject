package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerService {
	
	public void add(Gamer gamer) throws RemoteException;
	
	
	public void update(Gamer gamer);
	
	
	public void delete(Gamer gamer);
	
	
}
