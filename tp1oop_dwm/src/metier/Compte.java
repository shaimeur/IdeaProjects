package metier;

public class Compte {

    private   long num ;
    public long getNum(){
        return num;
    }
    public void setNum(long num){
        this.num = num ;
    }

    public  static  int nbComptes;
    private String clientName;

    public String getClientName(){
        return clientName ;
    }
    public void setClientName(String clientName){
        this.clientName = clientName;
    }


    private double balance ;

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance ;
    }

    // Constructor :

        public Compte(){

        }
        public  Compte(long num,String clientName,double balance){
                this.num = num;
                this.clientName = clientName;
                this.balance = balance;
                nbComptes++;
        }


    // Methods
    public void displayInfo () {
        System.out.println("numero : " + num + " clientName : " + clientName + " sold :"+ balance + " MAD" );
    }
   public void retrait(double amount){
            if(amount < balance){
                 balance -= amount;
            }else {
                System.out.println("You dont have such amount in your balance");
            }

    }
    public void depose (double amount ){
        balance += amount  ;
    }

    public static void displayNbCompte () {
        System.out.println("Nombre de comptes : " + nbComptes);
    }
}

