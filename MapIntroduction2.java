import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String>  kobelesz= new HashMap<>();
        kobelesz.put("978-1-60309-452-8" , "A Letter to Jo");
        kobelesz.put("978-1-60309-459-7 " , "Lupus");
        kobelesz.put("978-1-60309-444-3"   , "Red Panda and Moon Bear");
        kobelesz.put("978-1-60309-461-0 "  , "The Lab");
       
        //Print all the key-value pairs in the following format
        //A Letter to Jo (ISBN: 978-1-60309-452-8)
        //Lupus (ISBN: 978-1-60309-459-7)
        //Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        //The Lab (ISBN: 978-1-60309-461-0)
        System.out.println(kobelesz);

        //Remove the key-value pair with key 978-1-60309-444-3
        kobelesz.remove("Red Panda and Moon Bear");
        System.out.println(kobelesz);

        //Remove the key-value pair with value The Lab
        kobelesz.remove("The Lab");
        System.out.println(kobelesz);

        //Add the following key-value pairs to the map
        //978-1-60309-450-4 : They Called Us Enemy, 978-1-60309-453-5 : Why Did We Trust Him?
        kobelesz.put("978-1-60309-450-4", "They Called Us Enemy");
        System.out.println(kobelesz);

        kobelesz.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(kobelesz);
        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        
      

        boolean isKeyIn = kobelesz.containsKey("478-0-61159-424-8");
        System.out.println(isKeyIn);

        //Print the value associated with key 978-1-60309-453-5
        
        

        boolean isValueIn = kobelesz.containsValue("978-1-60309-453-5");
        System.out.println(isValueIn);
       
    


        
    }

    // Output:
    //    A Letter to Jo (ISBN: 978-1-60309-452-8)
    //    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
    //    Lupus (ISBN: 978-1-60309-459-7)
    //    The Lab (ISBN: 978-1-60309-461-0)
    //    false
    //    Why Did We Trust Him?
}