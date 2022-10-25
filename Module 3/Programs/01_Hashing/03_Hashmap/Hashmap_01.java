import java.util.*;
/**
 * Hashmap_01
 */
public class Hashmap_01 {

    public static void main(String[] args) {

        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String,Integer> mp=new HashMap<>();
        mp.put("amar", 80);
        mp.put("Rohan", 90);
        mp.put("Sohan", 70);
        mp.put("Radha", 70);
        mp.put("Rekha", 30);

        // print the size of the hashmap
        System.out.println(mp.size());;

        // print the content of hashmap
        System.out.println(mp);

        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if(mp.containsKey("amar")){
            int a=mp.get("amar");
            System.out.println(a);
        }
    }
}