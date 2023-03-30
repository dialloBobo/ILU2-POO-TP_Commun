package model;


public class CalendrierAnnuel {
	
	private Mois[] calendrier = new Mois[12];
	
	
	
	
	   public CalendrierAnnuel( ) {
		calendrier[0] = new Mois ("JANVIER",31);
		calendrier[1] = new Mois ("FEVRIER",28);
		calendrier[2] = new Mois ("MARS",31);
		calendrier[3] = new Mois ("AVRIL",30);
		calendrier[4] = new Mois ("MAI",31);
		calendrier[5] = new Mois ("JUIN",30);
		calendrier[6] = new Mois ("JUILLET",31);
		calendrier[7] = new Mois ("AOUT",31);
		calendrier[8] = new Mois ("SEPTEMBRE",30);
		calendrier[9] = new Mois ("OCTOBRE",31);
		calendrier[10] = new Mois ("NOVEMBRE",30);
		calendrier[11] = new Mois ("DECEMBRE",31);
	}



	   public Boolean estLibre(int jour , int mois) {
		   return calendrier[mois-1].estLibre(jour);
	   
	   } 
	   
	   
	   public Boolean reserver(int jour ,int mois) {
		   if (estLibre(jour,mois)) {
		   calendrier[mois-1].reserver(jour);
		   return true;
		   }
		   return false;
	   }
	   
	   

	// -------------Class interne --------------------//

		private static class Mois {
			private String nom;
			private Boolean[] jours;
	

			public Mois(String nom, int nbJours) {
				this.jours= new Boolean[nbJours];
				this.nom = nom;
				
				for (int i =0 ; i< nbJours ; i++) {
					jours[i]=false;
				}
			}
			public void setNom(String nom) {
				this.nom = nom;
			}
			
			public Boolean[] getJours() {
				return jours;
			}
			public String getNom() {
				return nom;
			}
			
			private Boolean estLibre(int jour){
				return !(jours[jour-1]);
				
			}
	 
			private void reserver (int jour) {
			  if (estLibre(jour)) {
				  jours[jour-1]=true;
			  }
			  else
			  {
				  throw new IllegalStateException("exception");
			  }

			}
			
	}

}
