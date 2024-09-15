public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
     
    
    String name = "";
    
    int szulev = 0;
    
    int szulhonap = 0;
    
    int szulnap = 0;
    
    System.out.print("Adja meg a nevét: ");
    
    name = input.nextLine();
    
     
    
    System.out.print("Adja meg a születési évét: ");
    
    szulev = input.nextInt();
    
     
    
    System.out.print("Adja meg a hónapot amiben született: ");
    
    szulhonap = input.nextInt();
    
     
    
    System.out.print("Adja meg a születése napját: ");
    
    szulnap = input.nextInt();
    
     
    
    System.out.println(name + " született " + szulev + "." + szulhonap + "." + szulnap + ".");
    
     
    
    input.close();
    
    }