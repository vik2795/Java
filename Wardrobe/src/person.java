import javax.xml.namespace.QName;

public class person {
     private String name;
    private int age;
   private String gender;

    public person(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    //getter,setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void getGoal()
    {
        System.out.println("Become a dog cement.");

    }

    public void introduece()
    {
        System.out.printf("Hi, I'm %s, a %d year old %s",name,age,gender);
    }
}