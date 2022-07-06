package com.shaimeur;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here




        

























































































 /*  exercice Arrays 1

 Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 & 20 ");

        int n = scanner.nextInt();


            if ((n > 1) && (n < 20) ){

                int [] ary = new int[n] ;
                System.out.println("fill the array !!");

                for (int i = 0; i < ary.length ; i++) {
                    int fillary = scanner.nextInt() ;
                    ary[i] = fillary ;

                }
                System.out.println( Arrays.toString(ary));
            }else{
                System.out.println("You entered the wrong number! plz try again !!");
            }*/




       /* Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;
        System.out.println("x = " + p1.x + " y = " + p1.y);


        change(p1);
        System.out.println("x = " + p1.x + " y = " + p1.y);
*/

       /*  EXERCICE 5 //solution 2


        System.out.println("enter a number");

        int input = scanner.nextInt();
        int max = input;
        int min = input;

        do {

            input = scanner.nextInt();

            if ((input > max) && (input >= 0)) {
                max = input;
            }
            if ((input < min) && (input >= 0)) {
                min = input;
            }
        } while (input >= 0);

        System.out.println("max is : " + max + " min is : " + min);


          //////////////////////////////////// solution 1
            double input ;
            double min = Double.POSITIVE_INFINITY ;
            double max = 0 ;

           do {
               System.out.println("Enter a number : ");
                 input = scanner.nextInt() ;

                    if (input > max){
                        max = input;
                    }
                    if ((input < min) && (input >= 0) ){
                        min = input;
                    }

           }while (input >= 0) ;

        System.out.println("max " + max + " min " + min);

         */








/*
            EXERCICE 4 LOOPS prime numbers

        System.out.println("Enter your number :");

        int input = scanner.nextInt();
        int count = 0 ;

        for (int i = 2; i < input; i++) {
            if (input % i == 0){
                count += i;
            }
        }
        if (count > 1 ){
            System.out.println( input + " : is not a prime number ");
        }else {
            System.out.println(input + " : is a prime number");
        }

 */




           /* EXERCICE 3 LOOPS  divisor

        System.out.println("Enter a number !!");

                int input = scanner.nextInt();

                int sum = 1;

                for(int i = 2 ; i < input; i++) {

                    if (input % i == 0){
                         sum  +=  i   ;
                    }
                }

        System.out.print(sum  + input);

            */









        /*   EXERCICE 2 LOOPS


          int sum = 0 ;

        for (int i = 0; i < 100 ; i++) {

            System.out.println("Enter a Number !! :");

            sum += scanner.nextInt();

            if (sum <= 100) {
                continue;
            }else {
                break;
            }
        }
        System.out.println("Done " + " "+ sum);

         */




         /*   int sum = 0 ;
            do {
                System.out.println("Enter a Number !! :");

                sum += scanner.nextInt();
            } while (sum <= 100);
        System.out.println("Done " + " "+ sum);

          */




  /*
        int sum = 0 ;
         while (sum <= 100) {
               System.out.println("Enter a Number !! :");

                sum += scanner.nextInt();

           }
        System.out.println("Done " + " "+ sum);

         */




        /*
            EXERCICE 1 LOOPS

        for (int i = 1; i <= 100 ; i++) {

            if (i % 2 == 0){

                System.out.print(i + " ") ;
            }

        }

        System.out.println();

        for (int j = 100; j >= 1 ; j--) {
            if (j % 2 == 0){
                System.out.print(j + " ") ;
            }
        }

         */


      /*  int n = 100 ;
        while (  n >= 1 ){

            if (n % 2 == 0){
                System.out.print(n + " ");
            }
            n--;
        }

       */







       /* for (int i = 1; i <= 12; i++) {

            for (int j = 1; j <= 12; j++) {

                System.out.print(i * j + " ");
            }

            System.out.println();
        }

        */











          /* int number;

            do {
                System.out.println("Enter a number between 1 and 10");
                number = scanner.nextInt();
            } while (!(number <= 10) && (number >= 1));
                  System.out.println(number);

           */

        /*
           do {
                    number = scanner.nextInt();
                    if ((number <= 10) && (number >= 1)){
                        System.out.println(number);
                        break;
                    }else {
                        System.out.println(number + " try again!!");
                    }

           }while (!(number <= 10) && (number >= 1));

         */


         /*  while (!(number <= 10) && (number >= 1)){

            System.out.println(number + " is not between 1 and 10. try again !!");

             number = scanner.nextInt();
        }
        System.out.println(number + " is between 1 and 10. Thanks !!");

          */



































      /*  System.out.println("Enter a number !!");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if ((a+b) == (c + d)){
            System.out.println("it's  a lucky number !!!");
        }else {
            System.out.println("Nope !!try again.. ");
        }
        */










      /*  double num1 = scanner.nextDouble();
        String operatorr = scanner.next();
        double num2 = scanner.nextDouble();
        double sum = num1 + num2 ;
        double multpl = num1 * num2;
        double divison = num1 / num2;
        double sub = num1 - num2 ;

        switch (operatorr){
            case "+":
                System.out.println(sum);
                break;
            case "-" :
                System.out.println(sub);
                break;
            case  "*" :
                System.out.println(multpl);
                break;
            case "/" :
                System.out.println(divison);
                break;
            default:
                System.out.println("invalid input !! try again plz!");
        }
            */



      /*  int entrer = number % 2;

        switch (entrer){

            case 0 :
                System.out.println("EVEN");
                break;
            case  1 :
                System.out.println("ODD");
                break;
        }*/



       /* if (number > 10){
            System.out.println(">10");
        }else if (number == 10){
            System.out.println("=10");
        }else {
            System.out.println("<10");
        }*/


       /*
        System.out.println("i is " + i + ", j is " + j);*/

      /*  System.out.println("Enter your name and age :");

        String myName = scanner.nextLine();

        int myAge = scanner.nextInt();

        System.out.println(myName + " You are " + myAge + "Years old !");*/


       /* System.out.println("Enter Your Number");
        double num = scanner.nextDouble();
        System.out.print( num + " is my favorite number too!!");
        */













      /*  System.out.println("Enter your name :");
        String inputString = scanner.nextLine();
        System.out.println("Hello! " + inputString);


        System.out.println("Enter your  Number");
        int inputInt = scanner.nextInt();
        System.out.println("Your number is :" + inputInt);
        */























      /*  String s1 = "Saad Haimeur" ;
        System.out.println(s1.toUpperCase());
        System.out.println(s1.isEmpty());
        System.out.println(s1.length());
        */


        //  System.out.println("Saad".concat(" Haimeur"+ 5+3));


         /*int i1 = 5 ;
         int i2 = i1;
        System.out.println(i1);
        System.out.println(i2);
         String s1 = "hello";
         String s2 = s1;
        System.out.println(s1);
        System.out.println(s2);
    */


        //   final String  companyName ;
        //     companyName = "-_//";
        // System.out.println(companyName);

      /* char c1 = 'A' ;
       char c2 = 65 ;
       char c3 = '\u0041' ;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


        int code1 = 'A';
        int code2 = '\u0041';
        System.out.println(code1);
        System.out.println(code2);
        */


        // String arg1 = args[0];
        // System.out.println(arg1);

         /*   String myName ="Saad Haimeur" ;
            String myJob = "Programmer";
            String myNameCopy = myName ;
            myName = "zebi" ;
        System.out.println(myName) ;
        System.out.println(myJob) ;
        System.out.println(myNameCopy);
        */
    }



    /*
        private static void change(Point p) {
        p.x = 2;
        p.y = 1;
    }*/
   /* private static void sayHi() {
        System.out.println("Hi");
    }

    private static void sayHi(String s) {
        System.out.println("Hi " + s);
    }*/
   /*
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
       return true;
    }

    public static void printPrimeBetween(int start, int end) {
        for (int i = start; i < end; i++) {
                if (isPrime(i)){
                    System.out.print(i + " ");
                }
        }
    }


    public static Point getPoint() {
        return new Point(1, 2);
    }

    public static int[] getNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers;
    }

    */
}



