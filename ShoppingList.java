import java.util.ArrayList;

public class ShoppingList {
    //We are going to represent a shopping list by a list containing strings.
    //
    //Create a linked list with the following items:
    // eggs, milk, fish, apples, bread and chicken
    //Create an application which prints out the answers to the following questions:
    // - Do we have milk in the shopping list? (yes/no)
    // - Do we have bananas in the shopping list? (yes/no)
    //The full output of your main method should be the following:
    //
    //yes
    //no
    //
    // The question have to be a method.

    public static void main(String[] args) {
        ArrayList<String> shoppinglist = new ArrayList<String>();
        shoppinglist.add("eggs");
        shoppinglist.add("milk");
        shoppinglist.add("fish");
        shoppinglist.add("apples");
        shoppinglist.add("bread");
        shoppinglist.add("chicken");

        // - Do we have milk in the shopping list? (yes/no)
        System.out.println(shoppinglist.contains("milk")?"yes":"no");
        System.out.println(shoppinglist.contains("bananas")?"yes":"no");
        



    }

}
