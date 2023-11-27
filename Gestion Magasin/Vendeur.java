public class Vendeur extends Employe {
    double tauxDeVente;
    public  Vendeur(int identifiant, String nom, String adresse, int nbr_heures,double tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);

        this.tauxDeVente = tauxDeVente;
    }
    public double calculsalaire(){
        return (tauxDeVente *450);
    }
}