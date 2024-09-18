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
    public class Feladat_2 {
        
        public static void main(String[] args) {
           //Creating a object from class Computer
          Person per1 = new Person();
          // Assign value to class properties
          per1.name = "Jane Doe";
          per1.age = 30;
          per1.gender = "female";
         
          System.out.println("Name: "+(per1.name) +" age: "+ (per1.age)+" gender: " +(per1.gender));

         
          
  }
}