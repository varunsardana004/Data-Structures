import java.util.*;
public class Main
{   static Scanner s=new Scanner(System.in);
    static int n=5; //assuming queue size is 5.
    static int front=-1;
    static int rear=-1;
    static int queue[]=new int[n];
    static void enqueue(){
        System.out.println("Enter data");
        int data=s.nextInt();
        if(rear==n-1){
            System.out.println("queue is full");
        }
        else if(front==-1&&rear==-1){
            front=rear=0;
            queue[rear]=data;
        }
        else{
            rear++;
            queue[rear]=data;
        }
    }
    static void dequeue(){
        int item;
        if(front==-1&&rear==-1)
        {
            System.out.println("Queue Empty");
        }
        else if(front==rear)
        {
            System.out.println("Popped element is "+queue[front]+"\nQueue is now Empty");
            front=rear=-1;
        }
        else{
            item=queue[front];
            front++;
            System.out.println("Popped element is "+item);
        }
        
    }
    static void peek()
    {
        if(front==-1&&rear==-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("Top most element is "+queue[front]);
        }
    }
    static void display(){
        if(front==-1&&rear==-1){
            System.out.println("Queue Empty");
        }
        else{
        System.out.println("Queue elements are : ");
        for(int i=front;i<rear+1;i++)
        {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
        }
    }
	public static void main(String[] args) {
	    System.out.println("*****Queue Implementation Using Array*****");
	    char c;
	    do{
	         System.out.println("Enter 1 for enqueue operation\nEnter 2 for dequeue operation\nEnter 3 for peek operation(i.e to see top most element)\nEnter 4 to display stack");
	    int choice=s.nextInt();
	    switch(choice){
	        case 1:
	           enqueue();
	            break;
	        case 2:
	            dequeue();
	            break;
	        case 3:
	            peek();
	            break;
	        case 4:
	            display();
	            break;
	      
	    }
	    System.out.println("press y to continue and n to exit");
	     c = s.next().charAt(0); 
	    }while(c!='n');
	    
	    
	}
}
