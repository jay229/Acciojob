import java.util.*;

public class HS_03 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(121);
        hs.add(123);
         HashSet<Integer> cloneHs=new HashSet<>();
        // clone()
         cloneHs=(HashSet)hs.clone();
        //System.out.println(hs);
       // System.out.println(cloneHs);

        // contain()
        System.out.println(cloneHs.contains(12));
        // cloneHs.clear();
        // System.out.println(cloneHs.isEmpty());

        // size()
        // System.out.println("first hashset size "+hs.size());
        // System.out.println("Second hashset size "+cloneHs.size());

        // remove()
        System.out.println(hs);
        hs.remove(12);
        System.out.println("After removing 12");
        System.out.println(hs);




    }
}
