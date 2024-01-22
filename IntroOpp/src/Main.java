import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit price!! :");

        double price = sc.nextDouble();

        System.out.println("Enter the quantity : ");

        int quantity = sc.nextInt();

            if(quantity > 100){
                System.out.println(price * 0.6 * quantity);
            }else {
                System.out.println(price*quantity);
            }

    }
}