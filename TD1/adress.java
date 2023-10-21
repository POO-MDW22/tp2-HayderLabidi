public class adress {
    public String ville;
    public String gouvernement;
    public int codepostal;
    public adress(){}
    public adress (String g,String v,int c){
        this.gouvernement=g;
        this.ville=v;
        this.codepostal=c;
    }
    public void affiche(){
        System.out.println("la ville est: "+this.ville+" gouvernorat est:"+this.gouvernement+" le code postale est: "+this.codepostal);
    }
    public String toString(){
        return ("gouvernorat:"+this.gouvernement+"ville est:"+this.ville+"codepostale est:"+this.codepostal);
    }
}
