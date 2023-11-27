public class Employe {
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected int heuresParMois;


    public Employe(int nbr_heures){}
    public Employe(int identifiant,String nom, String adresse,int heuresParMois){
        this.identifiant=identifiant;
        this.adresse=adresse;
        this.heuresParMois =heuresParMois;
        this.nom=nom;
    }


    void AfficherEmploye(){
        System.out.println (this.identifiant +" "+ this.adresse +" "+ this.heuresParMois + " "+this.nom);

    }}