package flyable;
import zoo.Bird;

public  class Main {
    public static void main(String[] args) {
        Helicopter h=new Helicopter("Retek-Nator 97",450,false);
        Helicopter k=new Helicopter("Kulákonátor",87,false);
   System.out.println(h);
   h.setLand(true);
   System.out.println(h.fly());

   Bird g=new Bird("Bíbic","flying fucker",26);
   System.out.println(g);
    }

    


}
