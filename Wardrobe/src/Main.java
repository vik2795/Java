public class Main
{
    public static void  main(String[]args)
    {
        person peti = new person("Péter",18,"phrog");
        student peter=new student("Péter",18,"phrog", "Gulag",365);

        peti.getGoal();
        peti.introduece();

        peter.getGoal();
        peter.introduece();
    }
}
