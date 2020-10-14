import java.util.*;
public class Main
{
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
    public void deletefromend(){
        Node current=tail.next;
        Node previous=null;
        if(tail==null)
        {
            return;
        }
        else if(current.next==current){
            tail=null;
        }
        else
        {
          while(current.next!=tail.next)
          {
              previous=current;
              current=current.next;
              
          }
          previous.next=tail.next;
          tail=previous;
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
	
		Main ob=new Main();
      Scanner s=new Scanner(System.in);
      
      System.out.println("Enter No of elements to insert in circular linked list.");
	    int n=s.nextInt();
	    System.out.println("Enter list elements.");
	    for(int i=0;i<n;i++){
	        ob.insert(s.nextInt());
	    }
	    System.out.println("Circular Linked list : ");
	  ob.display();
	  
	  ob.deletefromend();    // Delete node from end.
	  System.out.println("\nCircular Linked List after deleting node from end : ");
	  ob.display();
	    
	}
}

