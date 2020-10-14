import java.util.*;
public class Main
{   public static int n;
    Node tail=null;
    static class Node{
        int data;
        Node next;
    
    Node(int item){
        data=item;
        next=null;
    }
    }
    public void insert(int data)
    {
        Node newnode=new Node(data);
        if(tail==null)
        {
            tail=newnode;
            tail.next=newnode;
        }
        else
        {
            newnode.next=tail.next;
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void insertAtBeginning(int data){
         Node newnode=new Node(data);
        if(tail==null)
        {
            tail=newnode;
            tail.next=newnode;
        }
        else{
            newnode.next=tail.next;
            tail.next=newnode;
        }
    }
    public void insertAtPosition(int pos,int data)
    {   
        Node newnode=new Node(data);
        int i=1;
        
        if(tail==null)
        {
             tail=newnode;
            tail.next=newnode;
        }
        if(pos<0||pos>n)
        {
            System.out.println("invalid position");
        }
        else if(pos==1)
        {
            insertAtBeginning(data);
        }
        else{
            Node temp=tail.next;
            while(i<pos-1){
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            
        }
    }
    public void display(){
        if(tail==null)
        {
            return ;
        }
        else{
            Node current=tail.next;
            do{
                System.out.print(current.data+ " ");
                current=current.next;
        }while(current!=tail.next);
        }
    }

	public static void main(String[] args) {
	int pos;
		Main ob=new Main();
      Scanner s=new Scanner(System.in);
      
      System.out.println("Enter No of elements to insert in circular linked list.");
	    n=s.nextInt();
	    System.out.println("Enter list elements.");
	    for(int i=0;i<n;i++){
	        ob.insert(s.nextInt());
	    }
	    System.out.println("Circular Linked list : ");
	  ob.display();
	  
	  System.out.println("\nEnter position and the node you want to insert respectively.");
	    ob.insertAtPosition(pos=s.nextInt(),s.nextInt());
	    
	     System.out.println("Circular Linked list after inserting node at position "+pos +": ");
	  ob.display();
	  
	}
}
