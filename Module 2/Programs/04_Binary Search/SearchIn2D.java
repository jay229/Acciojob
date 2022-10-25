import java.util.*;
public class SearchIn2D {
    public static int[] SearchValue(int arr[][],int n,int x) {
        int i=0,j=n-1;
        while (i<n&&j>=0) {
            if(arr[i][j]==x){
                
                return(new int[]{i,j});
            }
            if(arr[i][j]>x){
                j--;
            }
            else{
                i++;
            }
        }
        return(new int[]{-1,-1});
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int ind[]=SearchValue(arr, n, x);
            System.out.println(ind[0]+" "+ind[1]);
            t--;
        }
        sc.close();

    }
}
