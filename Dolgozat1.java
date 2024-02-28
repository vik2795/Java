import java.util.Scanner;

public class Dolgozat1 { 
    public static void main(String[] args) { 
        Scanner myObj = new Scanner(System.in);
       
        String nev;


        System.out.println("Kérem a neved"); 
       nev = myObj.nextLine();

       System.out.println("Hello"+ nev+" !");

    }
}



