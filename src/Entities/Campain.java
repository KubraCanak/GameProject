package Entities;


public class Campain {

	private int campainId;
	private double discountOfUnitPrice;
	private String campainName;// indirim veya farklý kampanya isimleri
	private boolean isThereCampain;
    private double rateOfDiscount;
    
    
    Game game= new Game();
    
	public Campain() {
	}

	public Campain(int campainId, double discountOfUnitPrice, String campainName, boolean isThereCampain,double rateOfDiscount) {
		super();
		this.campainId = campainId;
		this.discountOfUnitPrice = discountOfUnitPrice;
		this.campainName = campainName;
		this.isThereCampain = isThereCampain;
		this.rateOfDiscount= rateOfDiscount;
	}

	public int getCampainId() {
		return campainId;
	}

	public void setCampainId(int campainId) {
		this.campainId = campainId;
	}

	public double getDiscountOfUnitPrice(Game game) {
		return( game.getGamePrice()-(rateOfDiscount*game.getGamePrice()/100));
	}


	public String getCampainName() {
		return campainName;
	}

	public void setCampainName(String campainName) {
		this.campainName = campainName;
	}

	public boolean isThereCampain() {
		return isThereCampain;
	}

	public void setThereCampain(boolean isThereCampain) {
		this.isThereCampain = isThereCampain;
	}

	public double getRateOfDiscount() {
		return rateOfDiscount;
	}

	public void setRateOfDiscount(double rateOfDiscount) {
		this.rateOfDiscount = rateOfDiscount;
	}

}
