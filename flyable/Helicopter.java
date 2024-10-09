package flyable;

public class Helicopter extends Vehicle implements Flyable {

    boolean island;

    public Helicopter(String type, int speed, boolean isTruck){
        this.type=type;
        this.speed=speed;
        this.isTruck=isTruck;
    }
   
    public void setLand(boolean land)
    {
        this.island=land;
    }
 // @Override
    public boolean land()
    {
        return false;
        
    }
    //@Override 
    public String fly()
    {
       if(island)
       {
        return"Helicopter is out of use";
       }
       else
       {
            return "Helicopter is helicoptering";        
       }
    }
  // @Override
    public void takeOff()
    {
        System.out.println("Henikopter is falling and can't get up");
        this.island=false;
    }

   // @Override
    public String toString() {
        return 
        "Helicopter [speed=" + speed + ", isTruck=" + isTruck + ", island=" + island + ", type=" + type
                + ", land()=" + land() + ", fly()=" + fly() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

    
}
