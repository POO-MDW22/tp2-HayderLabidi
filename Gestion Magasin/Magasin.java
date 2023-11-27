public class Magasin {

    String adress;
    int id;
    int Capasitee;
    static int nbr;
    Produit[] products;
    Employe[]employes;
    String nom;
    Magasin (){}

    Magasin(String adress,int id,int capasitee,Produit[] p, Employe[] e,String nom){
        this.adress=adress;
        this.id=id;
        this.Capasitee=capasitee;
        this.products = new Produit[50];
        this.products=p;
        this. employes= new  Employe[20];
        this. employes=e;
        this.nom=nom;
        nbr ++;
    }


    public boolean ajouterEmploye(Employe e) {
        if (nbr <20) {
            employes[nbr]=e;
            nbr++;}
        return false;
    }

    void AfficherMagasin(){
        System.out.println(id +" "+ adress +" "+Capasitee);
        for (int i=0;i<products.length;i++){
            if (products[i] != null) {
                products[i].afficherProduit();
            }}
    }
    void AfficherMagasinemployee(){
        for (int j=0;j<employes.length;j++) {
            if (employes[j] != null) {

                employes[j].AfficherEmploye();

            }}}}