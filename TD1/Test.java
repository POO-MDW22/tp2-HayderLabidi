public class Test {
    public static void main(String[] args) {
        adress a1 = new adress();
        a1.gouvernement = "tunisie ";
        a1.ville = "Sidi bouzid ";
        a1.codepostal = 9100;
        System.out.println(a1);
        a1.codepostal = 9100;
        a1.affiche();
        adress a2 = new adress("tunisie", "sidibouzid", 3000);
        a2.ville = "sfax";
        a2.affiche();
        chercheur ch1 = new chercheur();
        ch1.setnom("hama ");
        ch1.setpost("mdw ");
        ch1.setnum_ord(55);
        ch1.affiche();
        System.out.println(ch1.toString());
        System.out.println(chercheur.nb);
        chercheur ch2 = new chercheur("ahmed", "resaux", 20);
        if (ch1.comparer(ch2)) {
            System.out.println("cest le meme chercherur");
        }

        chercheur[] ch = new chercheur[]{ch1, ch2};
        bureau b1 = new bureau(100, "b", ch);
        bureau b2 = new bureau(50, "a", ch);
        bureau[] bt = new bureau[]{b1, b2};
        new laboratoire("l1", "info", bt, a1);
    }
}
