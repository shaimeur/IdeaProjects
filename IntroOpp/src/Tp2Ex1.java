import java.util.Arrays;
import java.util.Scanner;

public class Tp2Ex1 {
    public static void main(String[] args){
        int [] notes = new int[5] ;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Enter the  Note" );
            notes[i] = sc.nextInt();
        }

        for (int i = 0; i < notes.length; i++) {
            System.out.println("here the note >> :" + notes[i]);

        }

            Arrays.sort(notes);

        System.out.println(Arrays.toString(notes));

        double sum = 0.0 ;

        for (int i = 0; i < notes.length; i++) {
               sum +=  notes[i]  ;
        }

        System.out.println("note moyen >>>"+(sum/notes.length));

        System.out.println("Max is >>" + notes[notes.length-1]);
        System.out.println("Min is >>> " +notes[0]);


    }
}
