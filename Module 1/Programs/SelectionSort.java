import java.util.*;
public class SelectionSort {
    public static void sort(int a[],int n){
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        s.close();
        sort(arr, n);

    }
}
