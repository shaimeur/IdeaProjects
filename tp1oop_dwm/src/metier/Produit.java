package metier;
public class Produit {
    // Attributes :

    String name ;
    double price;

    int quantity;


    // Methodes :

     void displayInfo(){
         System.out.println("name : " + name + " price : " + price + " quantity : " + quantity );
     }
     double calculatTotal(){
         return  price * quantity ;
     }

}
