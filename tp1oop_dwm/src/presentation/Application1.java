package presentation;

import metier.Calcul;
import metier.Compte;

public class Application1 {
    public static void main (String[] args){
        Compte c1 = new Compte(1,"Sarah",3455555);
        // accéder à l'attribute
     /*   System.out.println(Compte.nbComptes);

        System.out.println(c1.nbComptes);*/

        Compte c2 = new Compte(222,"Hananah",89999999);
        System.out.println(Compte.nbComptes + " " + c1.nbComptes + " " + c2.nbComptes);


        Compte.displayNbCompte();
        c1.displayNbCompte();


        System.out.println(Calcul.sum(1,3));





    }
}
