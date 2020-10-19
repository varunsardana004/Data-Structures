import java.util.*;
public class Main
{ static Node root=null;
    Node head=null;
    static class Node{
        int data;
        Node left;
        Node right;
    
    Node(int item){
        data=item;
        left=null;
        right=null;
    }
    }
    static Node insert(Node root,int x)
    {
        Node newnode=new Node(x);
        if(root==null)
        {
            root=newnode;
            return root;
        }
        if(x<root.data)
        {
            root.left=insert(root.left,x);
        }
        else if(x>root.data){
            root.right=insert(root.right,x);
        }
        return root;
        }
        

    static void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }
	public static void main(String[] args) {
	    int x;
	  Main ob=new Main();
        root=ob.insert(root,100); 
        root=ob.insert(root,25); 
        root=ob.insert(root,83); 
        root=ob.insert(root,59); 
        root=ob.insert(root,44); 
        root=ob.insert(root,90); 
        root=ob.insert(root,10); 
      System.out.println("\nInorder Traversal in BST : ");
      ob.inorder(root);
     
	 
	    
	}
}


