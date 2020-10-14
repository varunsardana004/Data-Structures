import java.util.*;
public class Main
{
    static void Insertionsort(int a[],int n){
        for(int i=1;i<n;i++)
   {
       int key=a[i];
       int j=i-1;
       while(j>=0&&a[j]>key)
       {
           a[j+1]=a[j];
           j--;
       }
       a[j+1]=key;
       System.out.println("");
       for(int k=0;k<n;k++)
       {
           System.out.print(a[k]+" ");
       }
      
   }
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++){
	    ar[i]=s.nextInt();
	}
	System.out.println("Intermediate Steps : ");
	Insertionsort(ar,n);
	System.out.println("\nFinal Sorted Array : ");
	for(int i=0;i<n;i++)
	{
	    System.out.print(ar[i]+" ");
	}
	}
}
