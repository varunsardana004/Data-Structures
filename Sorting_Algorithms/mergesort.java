import java.util.*;
public class Main
{
    static void merge(int l[],int r[],int a[],int nl,int nr)
    {    int i=0,j=0,k=0;
         while(i<nl&&j<nr)
        {
          if(l[i]<r[j])
          {
              a[k]=l[i];
              i++;k++;
          }
          else
          {
              a[k]=r[j];
              j++;k++;
              }
        }
          while(i<nl)
          {
              a[k]=l[i];
              k++;i++;
          }
          while(j<nr)
          {
              a[k]=r[j];
              j++;k++;
          }}
    static void mergesort(int a[],int n)
    {
        if(n<2)
        return;
        int mid,i,j;
        int l[]=new int[n];
        int r[]=new int[n];
            mid=n/2;
            for(i=0;i<mid;i++)
            {
                l[i]=a[i];
            }
            for(i=mid,j=0;i<n;i++,j++)
            {
                r[j]=a[i];
            }
            mergesort(l,mid);
            mergesort(r,n-mid);
            merge(l,r,a,mid,n-mid);
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of elements in array.");
	int n=s.nextInt();
	int ar[]=new int[n];
	System.out.println("Enter array elements.");
	for(int i=0;i<n;i++){
	    ar[i]=s.nextInt();}
	mergesort(ar,n);
	System.out.println("\nFinal Sorted Array : ");
	for(int i=0;i<n;i++)
	{System.out.print(ar[i]+" ");}
	}
}
