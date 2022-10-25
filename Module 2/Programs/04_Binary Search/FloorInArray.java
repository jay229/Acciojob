import java.util.*;;
public class FloorInArray {
    public static int findFloor(int a[],int n,int x) {
        int l=0,h=n-1,floor=-1;
        if(x>=a[h]){
            return h;
        }
        if(x<a[l]){
            return -1;
        }
        while (l<=h) {
            int mid=(l+h)/2;
            if(a[mid]==x){
                return mid;
            }
            if(x<a[mid]){
                h=mid-1;
            }
            else{
                floor=mid;
                l=mid+1;
            }
        }
        return floor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(findFloor(a,n,x));;
    }
}
