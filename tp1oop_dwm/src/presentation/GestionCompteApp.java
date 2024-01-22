package presentation;
import metier.Compte;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GestionCompteApp {
    public static void main(String[] args) {

        // create Object

      /*  Produit p1 = new Produit();

        p1.name = "azus";
        p1.price = 33 ;
        p1.quantity= 2 ;

        p1.displayInfo();

        Produit p2 = new Produit();

        p2.name = "DELL";
        p2.price = 17000;
        p2.quantity = 2 ;

        p2.displayInfo(); */

      /*  Compte c1 = new Compte();
        Compte c2 = new Compte(23,"rabie",89999999);
        c1.setBalance(1700);
        c1.setClientName("Saad Haimeur");
        c1.setNum(1);

        c1.displayInfo();
        c1.retrait(200000000);
        c1.depose(300000);

        c2.displayInfo();
        c2.retrait(200000000);
        c2.depose(300000);

        c1.displayInfo();
        c2.displayInfo(); */

            Compte[] comptes = new Compte[10];

            comptes[0] = new Compte(1,"one",20000);
            comptes[1] = new Compte(2,"two",10000);
            comptes[2] = new Compte(3,"three",15000);
                // display accounts:
            for (Compte compte : comptes){
                if(compte != null){
                    compte.displayInfo();

                }
            }
            // calculcer le sold moyen des comptes

                double result = 0 ;
                for ( Compte compte : comptes){
                    if(compte != null){
                        result +=  compte.getBalance();

                    }
                }
                System.out.println(result);

            // afficher les comptes un sold >= 15000

                for (Compte compte : comptes){
                    if(compte != null && compte.getBalance() >= 15000){
                        compte.displayInfo();
                    }
                }

            // afficher le nombre de comptes
                    int counter = 0 ;
                for (Compte compte : comptes){
                    if(compte != null){
                        counter++;
                    }

                }

        System.out.println(counter);





    }
}