import java.util.*;
public class Main
{  public int top=-1;
public int count=0;
    void push(int []stack,int n,int data){
        if(top>=n)
        {
           System.out.println("Stack overflow");
        }
        else
        {   top=top+1;
            stack[top]=data;
        }
    }
     void pop(int stack[],int item)
    {
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            item=stack[top];
            top--;
            count++;
            System.out.println(count+" popped element from stack is : "+item);
        }
    }
    
	public static void main(String[] args) {
     
        int n;
        int data;
        int item=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
       int stack[]=new int[n];
        Main ob=new Main();
       for(int i=0;i<n;i++)
       {
           data=s.nextInt();
           ob.push(stack,n,data);
       }
       for(int i=0;i<n;i++)
       {
           ob.pop(stack,item);
       }
	}
}

