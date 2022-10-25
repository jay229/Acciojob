import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
      }
     // Stack<Integer> st=new Stack<Integer>();
      for(int i=0;i<n;i++){
         if(arr[i]==arr[n-1]){
           System.out.print(-1+" ");
          break;
        }
        if(arr[i]>arr[i+1]){
          System.out.print(arr[i+1]+" ");
        }
        else{
          System.out.print(-1+" ");
        }
       
      }
	}
}