import java.util.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date date =new Date("31/2/2024");
        Produit product1 =new Produit(1021,"Lait","Delice",0,date);
        Produit product2 =new Produit(2510,"Yaourt","Vitalait",0,date);
        Produit product3 =new Produit(3250,"Tomate","Sicam",1.200,date);
        product1.afficherProduit();
        product2.afficherProduit();
        product3.afficherProduit();
        product1.setPrix(0.700);
        product1.afficherProduit();

        Scanner scan = new Scanner(System.in);
        System.out.println("donner le prix du produit "+product2+" :");
        double prix= scan.nextDouble();
        product2.setPrix(prix);
        product2.afficherProduit();
        product1.toString();
        product1.toString();
        product1.toString();
        LocalDateTime t= LocalDateTime.now();
        System.out.println(t);
        System.out.println("donner le nombre des produit dans la Magasin: ");
        int nombreProduits=0;
        do{  nombreProduits=scan.nextInt();}while (nombreProduits>50 || nombreProduits<0);
        Produit pr =new Produit();
        Produit[] TP = new Produit[50];
        for (int i=0;i<nombreProduits;i++){
            System.out.println("donnerl id  du produit: ");
            pr.id=scan.nextInt();
            System.out.println("donner Libellee du produit: ");
            pr.libelee=scan.next();
            System.out.println("donner mark: ");
            pr.mark=scan.next();
            pr.prix=-0.1;
            while (pr.prix<=0){
                System.out.println("donner le prix du Produit: ");
                pr.prix=scan.nextDouble();}
            TP[i]=pr;


        }


        Employe [] es = new Employe [20];
        Magasin mg =new Magasin("Tunis",23234,9844,TP,es,"mg");
        System.out.println(Magasin.nbr);
        mg.AfficherMagasin();
        for (int i=0;i<nombreProduits;i++){
            if(TP[i].comparer(product1) && (TP[i].comparer(product2)) && (TP[i].comparer(product3))){
                System.out.println("se sont deux memes produites existes");}

            else {
                System.out.println("le produit n existe pas deux fois");

            }


            if(TP[i].comparers(product1,product2)){
                System.out.println("se sont deux memes produites");
            }

            else{
                System.out.println("le produit n existe pas deux fois");

            }
        }

        Employe [] er = new Employe [20];
        Magasin carrefour = new Magasin("Centre-Ville", 1, 1,TP,er,"mmg");
        Magasin monoprix = new Magasin("Manzah 6",2, 2,TP,es,"mgg" );

        Caissier caissier1 = new Caissier(1, "ala", "Adresse1", 160, 1);
        Caissier caissier12 = new Caissier(1, "ala", "Adresse1", 160, 2);
        Vendeur vendeur1 = new Vendeur(2, "ahmed", "Adresse2", 160, 0.8);
        Responsable responsable1 = new Responsable(3, "amine", "Adresse3", 160, 200);
        carrefour.ajouterEmploye(caissier1);
        carrefour.ajouterEmploye(caissier12);
        carrefour.ajouterEmploye(vendeur1);
        carrefour.ajouterEmploye(responsable1);
        Caissier caissier2 = new Caissier(1, "ala", "Adresse1", 160, 3);
        Vendeur vendeur2 = new Vendeur(2, "ahmed", "Adresse2", 160, 0.8);
        Vendeur vendeur21 = new Vendeur(2, "ahmed", "Adresse2", 160, 0.8);
        Vendeur vendeur22 = new Vendeur(2, "ahmed", "Adresse2", 160, 0.8);
        Responsable responsable2 = new Responsable(3, "amine", "Adresse3", 160, 200);
        monoprix.ajouterEmploye(caissier2);
        monoprix.ajouterEmploye(vendeur2);
        monoprix.ajouterEmploye(vendeur21);
        monoprix.ajouterEmploye(vendeur22);
        monoprix.ajouterEmploye(responsable2);

        carrefour.AfficherMagasinemployee();
        monoprix.AfficherMagasinemployee();

        System.out.println("les salaire des employers de carrefour");
        System.out.println("les salaire de cassier 1 decarrefourx");
        System.out.println(caissier1.calculsalaire());
        System.out.println("les salaire devendeur 1de carrefour");
        System.out.println(vendeur1.calculsalaire());
        System.out.println("les salaire de responsable 1de monoprix");
        System.out.println(responsable1.calculsalaire());

        System.out.println("les salaire des employers de monoprix");
        System.out.println("les salaire de cassier de monoprix");

        System.out.println(caissier2.calculsalaire());
        System.out.println("les salaire des vendeurs de monoprix");

        System.out.println(vendeur21.calculsalaire());
        System.out.println("les salaire vendeur 2de monoprix");

        System.out.println(vendeur22.calculsalaire());
        System.out.println("les salaire de responsable de monoprix");

        System.out.println(responsable2.calculsalaire());




    }}