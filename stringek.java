import java.util.Scanner;

public class stringek { 
    public static void main(String[] args) { 
        Scanner myObj = new Scanner(System.in);
        String userName;
        String userName2;
        String hely;
        int ev;
        String fullName;
        
        //oldChar i;
        //newChar y;

        System.out.println("Kérem a vezetékneved"); 
        userName = myObj.nextLine(); 
        
        System.out.println("Kérem a keresztneved"); 
        userName2 = myObj.nextLine();

        System.out.println("Kérem a születési helyed"); 
        hely = myObj.nextLine();
        
        System.out.println("Kérem az életkorod"); 
         ev = myObj.nextInt(); 

         System.out.println(userName.toUpperCase());
         System.out.println(userName2.toUpperCase());
        
        System.out.println("Vezetéknév: " + userName);
        System.out.println("Keresztneved: "+ userName2);

        System.out.println("A teljes neved: "+ userName+" "+userName2);
        fullName=(userName+" "+userName2);
        System.out.println(fullName);

        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.indexOf(userName2));

        System.out.println(fullName.toLowerCase());
        System.out.println(hely.toLowerCase());

        System.out.println("A neved:"+ " "+fullName+" "+"születtél:"+" "+hely+" "+"életkorod:"+" "+ev);

        System.out.println("A teljes név hossza: " + fullName.length());
        

        //public String replace(char "i", char "y") {    
            //if ("i"!= "y") {    
                //int len = value.length;    
                //int i = -1;    
                //char[] val = value; 
         
                //while (++i < len) {    
                    //if (val[i] == "i") {    
                        //break;    f
                    //}    
                //}    
                //if (i < len) {    
                    //char buf[] = new char[len];    
                    //for (int j = 0; j < i; j++) {    
                        //buf[j] = val[j];    
                    //}    
                    //while (i < len) {    
                        //char c = val[i];    
                       // buf[i] = (c == "i") ? "y" : c;    
                       // i++;    
                   // }    
                   // return new String(buf, true);    
               // }    
           // //}    
           // return this;    
       // }    
        
        
        
    } 
  }
