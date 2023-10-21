public class laboratoire {
    public  adress a ;
    public String nom;
    public String specialite;
    public bureau b[];
    public laboratoire(){}
    public laboratoire (String specialite,String nom,bureau b[],adress a){
        this.specialite=specialite;
        this.nom=nom;
        this.b=new bureau [5];
        this.b=b;
        this.a=a;
    }
    public void affiche(){
        System.out.println("le nom est:"+this.nom+"specialite  est:"+this.specialite);
        int i;
        for (i=0;i<b.length;i++) {
            this.b[i].affiche();
        }
    }
    //system.out.println(this.c[i].toString()
    public String toString(){
        String result="nom"+nom+"specialite"+specialite+"adress"+a;
        int i;
        for (i=0;i<b.length;i++) {
            result += this.b[i];
        }
        return result;
    }
}
