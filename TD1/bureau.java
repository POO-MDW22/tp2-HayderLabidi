public class bureau {
    public int code ;
    public String nom;
    public chercheur ch[];
    public bureau(){}
    public bureau (int code,String nom,chercheur ch[]){
        this.code=code;
        this.nom=nom;
        this.ch=new chercheur[5];
        this.ch=ch;
    }
    public void affiche(){
        System.out.println("le code  est:"+this.code+"le nom est:"+this.nom);
        int i;
        for (i=0;i<ch.length;i++) {
            this.ch[i].affiche();
        }
    }
    //system.out.println(this.c[i].toString()
    public String toString(){
        String result="code"+code+"nom"+nom;
        int i;
        for (i=0;i<ch.length;i++) {
            result += this.ch[i];
        }
        return result;
    }
}
