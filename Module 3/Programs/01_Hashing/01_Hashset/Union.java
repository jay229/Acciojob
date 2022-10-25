import java.util.*;
public class Union {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of both array :");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int set1[]=new int[n1];
        int set2[]=new int[n1];
        HashSet<Integer> st=new HashSet<>();

        for (int i = 0; i <n1; i++) {
            set1[i]=s.nextInt();
        }
        for (int i = 0; i <n2; i++) {
            set2[i]=s.nextInt();
        }
        for (int i = 0; i <n1; i++) {
           st.add(set1[i]);
        }
        for (int i = 0; i <n2; i++) {
            st.add(set2[i]);
        }
        System.out.println(st);
        s.close();

    }
}
