import java.util.*;
public class Main
{
    static void Selectionsort(int a[],int n){
        int min;
        for(int i=0;i<n-1;i++){
             min=i;
             for(int j=i+1;j<n;j++)
             {
                 if(a[j]<a[min])
                    {
                        min=j;
                    }    
             }
             if(min!=i)
             {
                 int temp=a[i];
                 a[i]=a[min];
                 a[min]=temp;
             }
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
	Selectionsort(ar,n);
	System.out.println("\nFinal Sorted Array : ");
	for(int i=0;i<n;i++)
	{
	    System.out.print(ar[i]+" ");
	}
	}
}
