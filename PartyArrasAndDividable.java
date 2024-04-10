import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class PartyArrasAndDividable {
        
    public static void main(String[] args) {
        System.out.println("PartyValidation"); { 
       Scanner sc=new Scanner(System.in);
       int randomNum = (int)(Math.random() * 21);
       int[] fijuk = new int[randomNum];
       int[]janyok =new int[randomNum];

       System.out.println("Jányok száma: " + janyok[0] +"száma. "+"Fijuuk száma: "+fijuk[0]+" száma.");

       if(fijuk == janyok)
       {
        System.out.println("The party is excellent!");
       }
       else if(fijuk != janyok)
       {
        System.out.println( "Quite a cool party!");
       }
       else if( (fijuk[0] +janyok[0] )>20 )
       {
        System.out.println("Average party...");
       }
       else if( janyok[0] != randomNum)
       {
        System.out.println("Sausage party");
       }
    }

    }
}