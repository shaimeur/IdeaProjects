import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number plz!! : ");

        int myNumber = sc.nextInt();


        double result = 0 ;


        for(int i = 1 ; i < myNumber ; i++){
            result +=  1.0 /i;
        }
        System.out.println("The Result is : " + result);
    }

}
