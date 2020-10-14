import java.util.*;
public class Main
{
    static void quicksort(int a[],int l,int h)
    {
        int i,j,pivot,temp,temp2;
        if(l<h)
        {
            pivot=a[l];
            i=l;j=h;
            while(i<j)
            {
                while(a[i]<pivot&&i<j)
                {
                    i++;
                }
                while(a[j]>pivot)
                {
                    j--;
                }
                if(i<j)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            temp2=a[j];
            a[j]=pivot;
            pivot=a[j];
            quicksort(a,l,j-1);
            quicksort(a,j+1,h);
            
        }
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no of elements in array");
	int n=s.nextInt();
	int ar[]=new int[n];
	System.out.println("Enter array elements");
	for(int i=0;i<n;i++){
	    ar[i]=s.nextInt();}
	quicksort(ar,0,n-1);
	System.out.println("\nFinal Sorted Array : ");
	for(int i=0;i<n;i++)
	{System.out.print(ar[i]+" ");}
	}
}



