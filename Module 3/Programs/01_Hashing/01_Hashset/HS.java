import java.util.*;

public class HS {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();

        // add()
        st.add("Aman");
        st.add("Aman");
        st.add("Rahul");
        st.add("Rohan");
        st.add("Vishal");
        st.add("Jay");
       //Iterator<String> itr = st.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }
        
        // Hashset before clear()
        System.out.println(st);
        st.clear();
        // Hashset after clear()
        System.out.println(st);

    }

}