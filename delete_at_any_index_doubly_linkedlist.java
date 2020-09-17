import java.util.*;
public class Main{
    int count=0;
  class Node
{
    int data;
    Node next;
     Node previous;  
     
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
    
  Node head,tail=null;
  public void insertNode(int data) {  
        Node newNode = new Node(data);  
        if(head == null) {  
             head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
             newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        } 
        count++;
    }  
     void deleteParticularNode(int index) {  
           if(index==0)
        {
            head=head.next;
            head.previous=null;
        }
        else if(index==count-1)
        {
            tail=tail.next;
            tail.previous=null;
        }
        }
        else
        {
            Node n1=null;
            Node temp=head;
            
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
                temp.previous.next=temp.next;
                temp.next.prev=temp.prev;
            }
          
            System.out.println("deleted item is "+n1.data);
            
        }
    }  
    public  void show()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
     public static void main(String []args){
      Main ob=new Main();
      Scanner s1=new Scanner(System.in);
      ob.insertNode(10); 
      ob.insertNode(20);
      ob.insertNode(30); 
      ob.insertNode(40);
      ob.insertNode(50);
      System.out.println("Enter the index of element you want to delete.");
      int index=s1.nextInt();
     System.out.println("the initial Linked List is");
      ob.show();
      ob.deleteParticularNode(index);
       System.out.println("the linked list after deletion from end: ");
       ob.show();
       
    
     }}



