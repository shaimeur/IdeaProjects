import java.util.Random;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Random random = new Random();

        int magicNumber = random.nextInt(10);
        int counter = 0 ;

        System.out.println("Enter your guess ");

        int guessedNumber;

        do {
            guessedNumber = sc.nextInt();

            if(guessedNumber > magicNumber){
                System.out.println("Your Number is bigeer! try again");
                counter++;

            } else if (guessedNumber < magicNumber ) {
                System.out.println("Your Number is less then the Number try gain");
                counter++;

            }



        }while (magicNumber != guessedNumber && counter < 4);

        if(guessedNumber == magicNumber){
            System.out.println("You Winn !!");


        }else {
            System.out.println("You Exced the number of try!!");

        }


    }
}
