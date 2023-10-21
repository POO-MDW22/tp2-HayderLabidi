public class chercheur {
    private String nom;
    private String post;
    private int num_ord;
    static int nb;
    public chercheur(){nb++;}
    public chercheur (String n,String p,int no){
        this.nom=n;
        this.post=p;
        this.num_ord=no;
        nb++;
    }
    public void setnom(String n){
        this.nom=n;
    }
    public String getnom(){
        return this.nom;
    }
    public void setpost(String p){
        this.post=p;
    }
    public String getpost(){
        return this.post;
    }
    public void setnum_ord(int o){
        this.num_ord=o;
    }
    public int getnumord(){
        return this.num_ord;
    }
    public void affiche(){
        System.out.println("le nom est:"+this.nom+"la post est:"+this.post+"le num de machine est:"+this.num_ord);
    }
    public String toString(){
        return ("le nom est:"+this.nom+"la post est:"+this.post+"le num de machine est:"+this.num_ord);
    }
    public boolean comparer(chercheur ch){
        return (this.nom==ch.nom)&&(this.num_ord==ch.num_ord)&&(this.post==ch.post);
    }
}
