package model;

public class ReservationHotel extends Reservation {
	
	private int nbLitSimple;
	private int nbLitDouble;
	private int nbChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int nbChambre) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.nbChambre = nbChambre;
	}

	public int getNbLitSimple() {
		return nbLitSimple;
	}

	public int getNbLitDouble() {
		return nbLitDouble;
	}
	
	public int getNbChambre() {
		return nbChambre;
	}	
	
}
