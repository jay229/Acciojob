import java.util.*;
class BinarySearch01{
    public static int binarySearch(int arr[],int n,int key) {
        int low=0,high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(key<arr[mid]){
                high=mid-1;
            }
            else
                low=mid+1;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        s.close();
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,n,k));
    }
}