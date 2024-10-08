package zoo;

public class Bird extends Animal
 {
    String breed;
    String sound;

    boolean isLandAnimal=false;

    public Bird(String name, String breed, int age)
    {
        this.name=name;
        this.breed=breed;
        this.age=age;

    }
    @Override
    String breed()
    {
        return this.breed;
    }


@Override
void sound(){
    System.out.println(this.sound+" "+this.sound);

}

@Override
boolean isLandAnimal()
{
    return true;
}

public void setSound(String sound)
{
    this.sound=sound;
}
public void setIsLandAnimal(boolean isLandAnimal)
{
    this.isLandAnimal=isLandAnimal;
}
}
