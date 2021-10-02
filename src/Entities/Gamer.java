package Entities;

public class Gamer {

	int gamerId;
	String gamerFirstName;
	String gamerLastName;
	long nationalityId;
	int dateOfBirth;


	public Gamer() {
	}

	public Gamer(int gamerId, String gamerFirstName, String gamerLastName, long nationalityId, int dateOfBirth) {
		super();
		this.gamerId = gamerId;
		this.gamerFirstName = gamerFirstName;
		this.gamerLastName = gamerLastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;

	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getGamerFirstName() {
		return gamerFirstName;
	}

	public void setGamerFirstName(String gamerFirstName) {
		this.gamerFirstName = gamerFirstName;
	}

	public String getGamerLastName() {
		return gamerLastName;
	}

	public void setGamerLastName(String gamerLastName) {
		this.gamerLastName = gamerLastName;
	}

	public long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
