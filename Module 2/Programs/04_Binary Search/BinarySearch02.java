import java.util.*;
class BinarySearch02{
    public static int binarySearch(int arr[],int key,int low,int high) {
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(key>arr[mid]){
            return binarySearch(arr, key, low+1, high);
        }
        return binarySearch(arr, key, low, mid-1);
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
        int l=0,h=n-1;
        System.out.println(binarySearch(arr,k,l,h));
    }
}