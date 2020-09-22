import java.util.*;
public class Main
{
    Node head=null;
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
            newnode.prev=temp;
            temp=newnode;
        }
    }
    public void insertAtBeginning(int item){
        
        Node newnode=new Node(item);
        head.prev=newnode;
        newnode.next=head;
        newnode.prev=null;
        head=newnode;
        
    }
    public int insertAtPosition(int position,int item)
    {
        int count=0;
        int flag=1;
        int i=1;
        if(position==1)
        {
            insertAtBeginning(item);
            flag=2;
            
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
                    if(position==count+1){
                        insert(item);
                        flag=3;
                       
                    }
                    else{
                    System.out.println("Invalid Position!");
                    flag=0;
                    
                    }
                }
            else
                {
                    Node temp=head;
                    while(i<position-1)
                    {
                        temp=temp.next;
                        i++;
                    }
                    Node newnode=new Node(item);
                    newnode.prev=head;
                    newnode.next=temp.next;
                    temp.next.prev=newnode;
                    temp.next=newnode;
                }
            
        }
        return flag;
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
	    int flag;
	    int pos;
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
	    flag=ob.insertAtPosition(pos=s.nextInt(),s.nextInt());
	    if(flag==1){
	    System.out.println("Linked list after inserting element at Position"+pos+ ": ");
	    ob.display();
	    }
	    else if(flag==2){
	    System.out.println("Linked list after inserting element at Beginning : ");
	    ob.display();
	    }
	    else if(flag==3){
	    System.out.println("Linked list after inserting element at End: ");
	    ob.display();
	    }
	    else{
	        System.out.println("\nElement not inserted because position of insertion is greater than total element. ");
	    }
	    
	    
	}
}
