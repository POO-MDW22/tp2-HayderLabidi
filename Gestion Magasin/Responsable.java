public class Responsable extends Employe{
    double prime;
    public  Responsable(int identifiant, String nom, String adresse, int nbr_heures ,double prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime=prime;
    }
    public float calculsalaire(){
        return (super.heuresParMois > 160)? (((160*10)+(super.heuresParMois-160*10*0.2f))):(160*10);}

}