public class  accseccses
{
    String name;
    int age;
    String gender;

    }

  public class Person  {
        public static void main(String[] args) {
          
          Person per1 = new Person();
          
          per1.setName =("Jane Doe");
          per1.setPrice = (30);
          per1.set.Gender = ("female");
         
          System.out.println("Her name is " +per1.getName);
          System.out.println("Her age is "+per1.Age);
          System.out.println("Her gender is "+per1.getGender);

         
          
  }
}

class Person_{
  private String name;
  private double age;

  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public double getAge(){
    return age;
  }
  public void setAge(double age)
  {
    this.age=age;
  }
}