package zoo;

public class Main {
    public static void main(String[] args) {
        
      bird kuvik=new bird("Kuvik","madár",9);
      
      System.out.println("A madár neve: " + kuvik.name);
      System.out.println("Származása: "+kuvik.breed);
      System.out.println("Életkora: "+kuvik.age);
    //   System.out.println("Sound"+ kuvik.sound);
    //   System.out.println("Szárazföldi-e:"+kuvik.isLandAnimal());
    //   System.out.println("Neme:"+kuvik.gender);
    kuvik.setIsLandAnimal(false);




   
      Reptile kloki =new Reptile("Krokodil","hüllő",11);
      System.out.println("A hüllő neve: " + kloki.name);
      System.out.println("Származása: "+kloki.breed);
      System.out.println("Életkora: "+kloki.age);
    //   System.out.println("Sound"+ kloki.sound);
    //   System.out.println("Szárazföldi-e:"+kloki.isLandAnimal());
    //   System.out.println("Neme:"+kloki.gender);

      kloki.setSound("rawr");



         
      Mammal racoon=new Mammal("Mosó Mackó","emlős",27);
      System.out.println("Az emlős neve: " + racoon.name);
      System.out.println("Származása: "+racoon.breed);
      System.out.println("Életkora: "+racoon.age);
    //   System.out.println("Sound"+ racoon.sound);
    //   System.out.println("Szárazföldi-e:"+racoon.isLandAnimal());
    //   System.out.println("Neme:"+racoon.gender);

        
    
}}
