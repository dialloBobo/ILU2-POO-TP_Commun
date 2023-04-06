package model;

public class ReservationRestaurant extends Reservation {
	private int numeroService;
	private int numeroTable;
	

	public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTable) {
		super(jour, mois);
		this.numeroService = numeroService;
		this.numeroTable = numeroTable;
	}

	public int getNumeroService() {
		return numeroService;
	}



	public int getNumeroTable() {
		return numeroTable;
	}
	

	@Override
	public String toString() {
		if (numeroService==1) {
			return "Le "+ jour +"/" + mois + " : table n°" + numeroTable + " pour le premier service.\n";
		}
		return "Le "+ jour +"/" + mois + " : table n°" + numeroTable + " pour le deuxième service.\n";
			
			
		
	}
	
	
	

	
}