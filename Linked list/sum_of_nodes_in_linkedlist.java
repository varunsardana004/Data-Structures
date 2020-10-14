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
    public int SumOfNodes() {
        Node node=head;
    if(node == null) {
      return 0;
    }
    
    int sum = 0;
    while(node != null) {
      sum = sum + node.data;
      node = node.next;
    }
    
    return sum;
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
      ob.insert(10); 
      ob.insert(20);
      ob.insert(30); 
      ob.insert(40);
      ob.insert(50);
     System.out.println("the Linked List is");
      ob.show();
       System.out.println("sum of linked list : "+ob.SumOfNodes());
     }}
