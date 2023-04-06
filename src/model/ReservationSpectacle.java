package model;

public class ReservationSpectacle extends Reservation {

	private int nbZone;
	private int nbChaise;
	
	public ReservationSpectacle(int jour, int mois, int nbZone, int nbChaise) {
		super(jour, mois);
		this.nbZone = nbZone;
		this.nbChaise = nbChaise;
	}

	public int getNbZone() {
		return nbZone;
	}

	public int getNbChaise() {
		return nbChaise;
	}
	
}
