package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int identificationEntite;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	
	}

	public int getJour() {
		return jour;
	}



	public int getMois() {
		return mois;
	}


	public int getIdentificationEntite() {
		return identificationEntite;
	}

	public void setIdentificationEntite(int identificationEntite) {
		this.identificationEntite = identificationEntite;
	}




	
	
	
	
}
