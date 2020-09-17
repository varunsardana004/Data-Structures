import java.util.*;
public class Main
{  public int top=-1;
public static int n=4;
public int item,front = -1, rear = -1; 
public int queue[]=new int[n];
    void insert(int item)  
{  
    if((rear+1)%n == front)  
    {  
        System.out.println("Overflow"); 
        return;  
    }  
    else if(front == -1 && rear == -1)  
    {  
        front = 0;  
        rear = 0;  
    }  
    else if(rear == n -1 && front != 0)   
    {  
        rear = 0;  
    }  
    else   
    {  
        rear = (rear+1)%n;  
    }  
    queue[rear] = item; 
     System.out.println("inserted element is "+queue[rear]);
}  
void delete()  
{   
    if(front == -1 & rear == -1)  
    {  
        System.out.println("UNDERFLOW");
        return;  
    }  
    else if(front == rear)  
    {  
        front = -1;  
        rear = -1;  
    }  
    else if(front == n-1)  
        {  
            front = 0;  
        }  
    else   
        item=front;
        front = front + 1; 
        
    System.out.println("deleted element is "+queue[item]);
}  
	public static void main(String[] args) {
     
        
        int data;
        Scanner s=new Scanner(System.in);
       
        Main ob=new Main();
      ob.insert(10);
      ob.insert(20);
      ob.delete();
      ob.insert(30);
      ob.insert(40);
      ob.delete();
        
	}
}


