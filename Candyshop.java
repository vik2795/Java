import java.util.*;

public class Candyshop {
    public static void main(String... args) {

        ArrayList<Object> sweets = new ArrayList<>();
        sweets.add("Cupcakke");
        sweets.add(2);
        sweets.add("Brownie");
        sweets.add(false);

        // Accidentally we added "2" and "false" to the sweets list
        // Your task is to change the "2" to "Croissant" and the "false" to "Ice cream"
        // No, don't just edit the lines above! :)
        // Create a method called "repairSweetList()" which takes the list as a parameter
        // and returns a list with the items "2" and "false" replaced (with "Croissant" and "Ice cream")

        // Expected output: [Cupcake, Croissant, Brownie, Ice cream]
        //sweets.set(1,"Croissant");
        //sweets.set(3,"Ice Cream");
        //System.out.println(sweets);
 System.out.println(repairSweetList(sweets));
    }
        public static ArrayList<Object> repairSweetList(ArrayList<Object> sweets) {
            int index = sweets.indexOf(2);
            sweets.set(index,"Croissant");

            int index2=sweets.indexOf(false);
            sweets.set(index2,"Ice Cream");
        

            return sweets;     

    }

}