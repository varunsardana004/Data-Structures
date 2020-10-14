import java.util.*;
public class Main
{
    Node head=null;
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
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
   
    public void deleteFromPosition(int position)
    {
       Node temp=head;
       Node nextnode=null;
       int i=1;
       while(i<position-1)
       {
           temp=temp.next;
           i++;
       }
       nextnode=temp.next;
       temp.next=nextnode.next;
       
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
      
      System.out.println("Enter No of elements to insert in linked list.");
	    int n=s.nextInt();
	    System.out.println("Enter list elements.");
	    for(int i=0;i<n;i++){
	        ob.insert(s.nextInt());
	    }
	    System.out.println("Linked list : ");
	    ob.display();
	    
	    System.out.println("\nEnter the position from where you want to delete node.");
	    ob.deleteFromPosition(s.nextInt());
	    
	    System.out.println("\nLinked list after deleting element from entered position : ");
	    ob.display();
	   
	}
}
