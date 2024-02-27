import java.util.Scanner;

public class SzovegesErtekeles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Kérem a jegyed: "); 
        int jegy = sc.nextInt();  
        
            
            switch(jegy){

            case 1:
                System.out.println("Eins");
                break;
            case 2:
                System.out.println("Zwei");
                break;
            case 3:
                System.out.println( "Drei");
                break;
            case 4:
                System.out.println( "Vier");
                break;
            case 5:
                System.out.println("Fünf");
                break; 
            default:
                System.out.println("pasta");
           
        }

    }
}
