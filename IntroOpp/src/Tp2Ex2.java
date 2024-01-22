import java.util.Scanner;

public class Tp2Ex2 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Verb plz !!");

        String verbBuild  = sc.next();
        StringBuilder verb = new StringBuilder(verbBuild );

        StringBuilder result = new StringBuilder();

        StringBuilder[] subject = {new StringBuilder("je "),
                new StringBuilder(" tu "),
                new StringBuilder(" il "),
                new StringBuilder(" nous "),
                new StringBuilder(" vous "),
                new StringBuilder(" ils ")};

        StringBuilder[] suffix = {
                new StringBuilder("e"),
                new StringBuilder("es"),
                new StringBuilder("e"),
                new StringBuilder("ons"),
                new StringBuilder("ez"),
                new StringBuilder("ent")};

        verb.delete(verb.length() - 2 , verb.length()) ;

        for (int i = 0; i < subject.length; i++) {
            result.append(subject[i]).append(verb).append(suffix[i]).append('\n') ;
        }
        System.out.println(result);
    }
}
