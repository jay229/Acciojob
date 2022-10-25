import java.util.*;

public class HS_02 {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("facebook");
        st.add("amazon");
        st.add("apple");
        boolean b=st.add("Google");
        System.out.println("google inserted "+b);
        for (String value : st) {
            System.out.println(value);
            
        }
    }
}
