/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void merge(int a[],int b[]){
        int m=a.length;
        int n=b.length;
        int c[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<m){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<n){
            c[k]=b[j];
            j++;
            k++;
        }
       System.out.print(Arrays.toString(c));
        
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		
		for(int i=0;i<n1;i++){
		    a[i]=s.nextInt();    
		}
		for(int i=0;i<n2;i++){
		    b[i]=s.nextInt();    
		}
		merge(a,b);
	}
}
