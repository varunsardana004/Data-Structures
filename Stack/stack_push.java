import java.util.*;
public class Main
{  public int top=-1;
    void push(int []stack,int n,int data){
        if(top==n-1)
        {
           System.out.println("Stack overflow");
        }
        else
        {   top=top+1;
            stack[top]=data;
        }
    }
	public static void main(String[] args) {
     
        int n;
        int data;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
       int stack[]=new int[n];
        Main ob=new Main();
       for(int i=0;i<n;i++)
       {
           data=s.nextInt();
           ob.push(stack,n,data);
       }
       System.out.println("Stack is : ");
       for(int i=0;i<n;i++)
       {
           System.out.println(stack[i] );
       }
        
	}
}
