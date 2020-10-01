import java.util.*;
public class Main
{   
    public static int n;
    Node head,tail=null;
    static class Node{
        int data;
        Node next;
        Node prev;
    
    Node(int item){
        data=item;
        next=null;
        prev=null;
    }
    }
    public void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            head.next=head;
            head.prev=head;
        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            newnode.next=head;
            head.prev=newnode;
            tail=newnode;
        }
    }
    public void insertAtBeginning(int data){
         Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            head.next=head;
            head.prev=head;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    public void insertAtPosition(int pos,int data)
    {   
        Node newnode=new Node(data);
        int i=1;
        
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            head.next=head;
            head.prev=head;
        }
        if(pos<=0||pos>n+1)
        {
            System.out.println("invalid position");
        }
        else if(pos==1)
        {
            insertAtBeginning(data);
        }
        else if(pos==n+1)
        {
            insert(data);
        }
        else{
            Node temp=head;
            while(i<pos-1){
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            newnode.prev=temp;
            newnode.next.prev=newnode;
            
        }
    }
    public void display(){
        if(head==null)
        {
            return ;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }while(temp!=tail.next);
    }

	public static void main(String[] args) {
	
		Main ob=new Main();
      Scanner s=new Scanner(System.in);
      
      System.out.println("Enter No of elements to insert in doubly Circular linked list.");
	    n=s.nextInt();
	    System.out.println("Enter list elements.");
	    for(int i=0;i<n;i++){
	        ob.insert(s.nextInt());
	    }
	    System.out.println("Doubly Circular Linked list : ");
	  ob.display();
	  
	   System.out.println("\nEnter the position and node to insert at that position.");
	    ob.insertAtPosition(s.nextInt(),s.nextInt());
	    
	     System.out.println("Doubly Circular Linked list after inserting node at entered position: ");
	  ob.display();
	    
	}
}
