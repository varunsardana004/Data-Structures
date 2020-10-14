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
    public void insertAtBeginning(int item){
        Node node=new Node(item);
        node.next=head;
        head=node;
        
    }
    public void insertAtPosition(int position,int item)
    {
        int count=0;
        int i=1;
        if(position==1)
        {
            insertAtBeginning(item);
        }
        else
        {
             Node current=head;
            while(current!=null)
            {
            count++;
            current=current.next;
             }
            if(position>count)
                {
                    System.out.println("Invalid Position!");
                }
            else
                {
                    Node temp=head;
                    while(i<position-1)
                    {
                        temp=temp.next;
                        i++;
                    }
                    Node node=new Node(item);
                    node.next=temp.next;
                    temp.next=node;
                }
            
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
      
      System.out.println("Enter No of elements to insert in linked list.");
	    int n=s.nextInt();
	    System.out.println("Enter list elements.");
	    for(int i=0;i<n;i++){
	        ob.insert(s.nextInt());
	    }
	    System.out.println("Linked list : ");
	    ob.display();
	    
	    System.out.println("\nEnter the position & element which you want to insert at that position.");
	    ob.insertAtPosition(s.nextInt(),s.nextInt());
	    
	    System.out.println("Linked list after inserting element at Position : ");
	    ob.display();
	    
	    
	}
}
