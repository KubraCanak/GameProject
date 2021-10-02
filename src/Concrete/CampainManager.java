package Concrete;

import Abstract.CampainService;
import Entities.Campain;

public class CampainManager implements CampainService {

	private Campain campain;

	public CampainManager(Campain campain) {
		this.campain=campain;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Campain campain) {

		System.out.println("YENÝ KAMPANYA SÝSTEME EKLENDÝ : "+campain.getCampainName());
	}

	@Override
	public void remove(Campain campain) {

		System.out.println("KAMPANYA SÝSTEMDEN SÝLÝNDÝ");

	}

	@Override
	public void update(Campain campain) {

		System.out.println("KAMPANYA GÜNCELLENDÝ");

	}

}
