import java.util.*;
public class Main
{ public static int n;
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
     public void deletefrombeginning()
    {
        Node temp=head;
        head=temp.next;
        head.prev=tail;
    }
  
    public void deletefrompos(int pos){
        int i=1;
        if(pos<1||pos>n){
            System.out.println("invalid position");
        }
        else if(pos==1){
            deletefrombeginning();
        }
       
        else{
            Node temp=head;
            while(i<pos){
                temp=temp.next;
                i++;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            if(temp.next==head){ // to check if the node we are deleting is the last node or not if last node then update tail also.
                tail=temp.prev;
            }
            
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
	    System.out.println("\nEnter the position from where you want to delete node.");
	    ob.deletefrompos(s.nextInt()); //delete node from entered position of Doubly Circular linked list.
	    
	    System.out.println("\nDoubly Circular Linked list after deleting node from entered position : ");
	    ob.display();
	    
	}
}

