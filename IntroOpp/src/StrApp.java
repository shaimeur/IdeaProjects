import java.util.Scanner;

public class StrApp {
    public static void main (String[] args){
        String str1 = "Bonjour";
        String str2 = "Bonjour";
        String str3 = new String("Bonjour");

        System.out.println(str1 == str2); // we compare reference
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2)); // equals method compare the value
        System.out.println(str1.equals(str3));



    }
}
