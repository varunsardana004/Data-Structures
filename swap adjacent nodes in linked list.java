import java.util.*;
public class Main{
    
  Node head;
  int count;
 
  class Node
{
    int data;
    Node next;
     
    Node(int data)
    {
        this.data=data;
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
     void Swap() 
    { 
        Node node = head; 
        while (node != null && node.next != null) { 
            int k = node.data; 
            node.data = node.next.data; 
            node.next.data = k; 
            node = node.next.next; 
        } 
    } 
    void print() 
    { 
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
        System.out.println(); 
    } 
     public static void main(String []args){
      Main ob=new Main();
      Scanner s1=new Scanner(System.in);
      ob.insert(10); 
      ob.insert(20);
      ob.insert(30); 
      ob.insert(40);
      ob.insert(50);
      ob.insert(60);
     System.out.println("the Linked List is");
      ob.print();
      ob.Swap();
       System.out.println("the linked list after swapping : ");
       ob.print();
     }}
