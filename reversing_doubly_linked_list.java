import java.util.*;
public class Main
{
    Node head=null;
    Node tail=null;
    static class Node{
        int data;
        Node next;
        Node previous;
    
    Node(int item){
        data=item;
        next=null;
        previous=null;
    }
    }
    public void insert(int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=temp=newnode;
        }
        else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.previous=temp;
            temp=newnode;
            tail=temp;
        }
    }
    public void reverse()
    {
        Node currentnode=head;
        Node nextnode;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else{
            while(currentnode!=null){
            nextnode=currentnode.next;
         currentnode.next=currentnode.previous;
         currentnode.previous=nextnode;
         currentnode=nextnode;
        }
        currentnode=head;
        head=tail;
        tail=currentnode;
        }
    }
   public void display(){
        if(head==null)
        {
            return ;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data+ " ");
            current=current.next;
        }
   }
     public static void main(String[] args) {
	
		Main ob=new Main();
      Scanner s=new Scanner(System.in);
      
      System.out.println("Enter No of elements to insert in doubly linked list.");
	    int n=s.nextInt();
	    System.out.println("Enter list elements.");
	    for(int i=0;i<n;i++){
	        ob.insert(s.nextInt());
	    }
	     System.out.println("Doubly Linked list : ");
	  ob.display();
	    ob.reverse();
	    System.out.println("\nDoubly Linked list after reversing : ");
	  ob.display();
	    
	}
}
