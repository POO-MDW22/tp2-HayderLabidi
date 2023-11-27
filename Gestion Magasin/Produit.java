import java.util.Date;

public class Produit {
    int id;
    String libelee;
    String mark;
    protected double prix;
    Date Expiration;
    Produit(){}
    Produit(int id, String lib, String mark, double price, Date de){
        this.id=id;
        this.libelee=lib;
        this.mark=mark;
        this.prix=price;
        this.Expiration=de;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelee(String libelee) {
        this.libelee = libelee;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    public void afficherProduit(){
        System.out.println(id+" "+libelee+" "+mark+" "+prix);
    }
    public String toString(){
        return id+" "+libelee+" "+mark+" "+prix;
    }
    public  boolean comparer (Produit produit2 ){
        return this.id==produit2.id && this.libelee.equals(produit2.libelee) && this.mark.equals(produit2.mark)&&
                this.prix==produit2.prix;


    }
    public  boolean comparers (Produit produit1 ,Produit produit2){
        return  produit1.id==produit2.id && produit1.libelee.equals(produit2) && produit1.mark.equals(produit2)&&
                produit1.prix==produit2.prix;

    }

}