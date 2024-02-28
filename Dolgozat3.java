import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Dolgozat3 { 
    public static void main(String[] args) { 
        Scanner myObj = new Scanner(System.in);
    
    
    
        
        int numb2 = (int) (Math.random(10-90));

    
        System.out.println(numb2);

        if (numb2>10 && numb2<90)
        {
            System.out.println("A szám helyes");
        }
        else
        {
            System.out.println("A szám nem helyes");
        }
        if(numb2/3==0)
        {
            System.out.println("Fizz");
        }
        else if(numb2/5==0)
        {
        System.out.println("Buzz");
        }
        else if (numb2/3==0 && numb2/5==0)
        {
            System.out.println("FizzBuzz");
        }
        else
        {
            System.out.println(numb2);
        }
     
    }
}