public class student extends person{
    String previousOrganization;
    int skippedDays;

    public student(String name ,int age,String gender,String previousOrganization, int skippedDays) {
        super(name,age,gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;
    }
    @Override
    public  void introduece()
    {
        System.out.printf("Hi, I'm %s, a %d year old %s from %s who skipped %d days from the course already.",getName(),getAge(),getGender(),previousOrganization,skippedDays);
    }

}
