class Person
{
    String name;
    int age;
    String gender;

void printDetails(){
    System.out.println("Név: "+this.name);
    System.out.println("Életkora: "+this.age);
    System.out.println("Neme: "+this.gender);
    }
}
    public class Main {
        
        public static void main(String[] args) {
           //Creating a object from class Computer
          Person per1 = new Person();
          // Assign value to class properties
          per1.name = "Rozi";
          per1.age = 70;
          per1.gender = "férfi";
         
          System.out.println("Szia, "+(per1.name) +" vagyok "+ (per1.age)+" éves " +(per1.gender));

          Person per2 = new Person();
    
          per2.name = "Karcsi";
          per2.age = 12;
          per2.gender = "férfi";
         
          System.out.println("Szia, "+(per2.name) +" vagyok "+ (per2.age)+" éves " +(per2.gender));

          Person per3 = new Person();
    
          per3.name = "Lujza";
          per3.age = 30;
          per3.gender = "nő";
         
          System.out.println("Szia, "+(per3.name) +" vagyok "+ (per3.age)+" éves " +(per3.gender));
          
  }
}