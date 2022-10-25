import java.util.*;
public class DistinctArr {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        HashSet<Integer> st=new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(arr[i]);
        }
        int size=st.size();
        System.out.println("Total distinct element in given array :"+size);
        System.out.println(st);
        s.close();

    }
}