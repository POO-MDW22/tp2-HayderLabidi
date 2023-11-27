public class Caissier extends Employe {
    int numeroDeCaisse;
    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }
    public float calculsalaire(){

        return super.heuresParMois > 180 ? (super.heuresParMois*5+(super.heuresParMois-180)*5.75f):(super.heuresParMois*5);
    }


}