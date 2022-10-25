import java.util.*;

public class BinaryArray
{
  public static int countOne(int arr[],int n){
    int count=0,l=0,h=n-1;
    while(l<=h){
      int mid=(l+h)/2;
      if(arr[mid]==1){
        count=mid+1;
       l=mid+1;
      }
      else{
        h=mid-1;
      }
      
      
    }
    return count;
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
      }
      System.out.print(countOne(arr,n));
	}
}