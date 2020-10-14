import java.util.*;
public class Main
{   static Scanner s=new Scanner(System.in);
    static int n=5; //assuming stack size is 5.
    static int top1=-1;
    static int top2=-1;
    static int stack1[]=new int[n];
    static int stack2[]=new int[n];
    static int count=0;
    
    static void enqueue(){
        System.out.println("Enter data");
        int data=s.nextInt();
        push1(data);    // for pushing(adding) element in stack1
        count++;
    }
    
    static void push1(int data)
    {
        if(top1==n-1){
            System.out.println("Queue Overflow");
        }
        else
        {
            top1++;
            stack1[top1]=data;
        }
        
    }
    
    static void push2(int data)
    {
        if(top2==n-1){
            System.out.println("Queue Overflow");
        }
        else
        {
            top2++;
            stack2[top2]=data;
        }
    }
    
    static void dequeue(){
        int item,a;
        if(top1==-1&&top2==-1)
        {
            System.out.println("Queue Empty");
        }
        else{
            for(int i=0;i<count;i++)
            {
                a=pop1(); // pop element from stack1 one by one and push it to stack2 so that we can delete according to FIFO.
                push2(a);
            }
            item=pop2();
            System.out.println("Popped element is "+item);
            count--;
            for(int i=0;i<count;i++){
                a=pop2(); // popping element from stack2 one by one and pushing it back to stack1.
                push1(a);
            }
        }
        
    }
    
    static int pop1()
    {
        return stack1[top1--];
    }
    
    static int pop2()
    {
        return stack2[top2--];
    }
    
    static void peek()
    {
        if(top1==-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("Top most element is "+stack1[top1]);
        }
    }
    static void display(){
        System.out.println("Queue elements are : ");
        for(int i=0;i<=top1;i++)
        {
            System.out.print(stack1[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
	   
	    char c;
	    do{
	         System.out.println("Enter 1 for enqueue operation\nEnter 2 for dequeue operation\nEnter 3 for peek operation(i.e to see top most element)\nEnter 4 to display queue");
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
