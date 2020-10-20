import java.util.*;
public class Main
{
  static Node root = null;
  public static Scanner s = new Scanner (System.in);
  Node head = null;
  static class Node
  {
    int data;
    Node left;
    Node right;

      Node (int item)
    {
      data = item;
      left = null;
      right = null;
    }
  }
  static Node insert (Node root, int x)
  {
    Node newnode = new Node (x);
    if (root == null)
      {
	root = newnode;
	return root;
      }
    if (x < root.data)
      {
	root.left = insert (root.left, x);
      }
    else if (x > root.data)
      {
	root.right = insert (root.right, x);
      }
    return root;
  }
    static Node delete (Node root, int x)
    {
       if (root == null)
      {
	    return null;
      }
      if(x<root.data)
      {
        root.left=delete(root.left,x);  
      }
      else if(x>root.data)
      {
          root.right=delete(root.right,x);
      }
      else  // if x is same as the root.data, then this node should be deleted.
      {
        //node with atmost 1 child.
        if(root.left==null){    
            return root.right;
        }
        else if(root.right==null)
        {
            return root.left;
        }
        
        // node with 2 childs. Get the inorder successor i.e. smallest value in right subtree 
        // or we can take inorder predecesoor i.e. largest value from left subtree.  
      
        root.data=min(root.right);
        root.right=delete(root.right,root.data);
          
      }
      return root;
      
      
    }
    static int min(Node root)
    {
        int min=root.data;
        while(root.left!=null)
        {
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
    

  static void inorder (Node root)
  {
    if (root == null)
      {
	    return ;
      }
    inorder (root.left);
    System.out.print (root.data + " ");
    inorder (root.right);

  }
  
   static void preorder(Node root)
    {
        if(root==null)  
        {
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        
    }
    static void postorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
       
        preorder(root.left);
        preorder(root.right);
         System.out.print(root.data+" ");
        
    }
    
  public static void main (String[]args)
  {
    int x;
    Main ob = new Main ();
    root = ob.insert (root, 20);
    root = ob.insert (root, 16);
    root = ob.insert (root, 5);
    root = ob.insert (root, 18);
    root = ob.insert (root, 17);
    root = ob.insert (root, 19);
    root = ob.insert (root, 60);
    root = ob.insert (root, 85);
    root = ob.insert (root, 70);
    
    System.out.println ("   Tree:   " );
    System.out.println("       20         ");
    System.out.println("      /  \\        ");
    System.out.println("    16    60      ");
    System.out.println("   / \\      \\     ");
    System.out.println("  5   18    85   ");
    System.out.println("     /  \\   /    ");
    System.out.println("    17  19 70   ");
    
    
    System.out.println ("\nInorder Traversal : ");
    inorder (root);
    
    System.out.println ("\nPreorder traversal : ");
    preorder (root);
    
    System.out.println ("\nPostorder traversal : ");
    postorder (root);
    
    
    System.out.println("\n***********************************************");
    System.out.println ("\nDelete 17");
    root=ob.delete (root,17);
    System.out.println ("\nInorder traversal after deleting 17");
    inorder (root);
    System.out.println ("\nPreorder traversal after deleting 17");
    preorder (root);
    System.out.println ("\nPostorder traversal after deleting 17");
    postorder (root);
    
    System.out.println (" Tree after deleting 17:   " );
    System.out.println("       20         ");
    System.out.println("      /  \\        ");
    System.out.println("    16    60      ");
    System.out.println("   / \\      \\     ");
    System.out.println("  5   18    85   ");
    System.out.println("        \\   /    ");
    System.out.println("         19 70   ");

    System.out.println("***********************************************");
    System.out.println ("\nDelete 60");
    root=ob.delete (root,60);
    System.out.println ("\nInorder traversal after deleting 60");
    inorder (root);
    System.out.println ("\nPreorder traversal after deleting 60");
    preorder (root);
    System.out.println ("\nPostorder traversal after deleting 60");
    postorder (root);
    
    System.out.println (" Tree after deleting 60:   " );
    System.out.println("       20         ");
    System.out.println("      /  \\        ");
    System.out.println("    16    85      ");
    System.out.println("   / \\    /     ");
    System.out.println("  5   18  70       ");
    System.out.println("        \\       ");
    System.out.println("         19    ");
    
    System.out.println("***********************************************");
    System.out.println("\nDelete 20"); 
    root=ob.delete(root,20); 
    System.out.println("\nInorder traversal after deleting 20"); 
    ob.inorder(root); 
    System.out.println ("\nPreorder traversal after deleting 20");
    preorder (root);
    System.out.println ("\nPostorder traversal after deleting 20");
    postorder (root);
    
    System.out.println (" Tree after deleting 20:   " );
    System.out.println("       70         ");
    System.out.println("      /  \\        ");
    System.out.println("    16    85      ");
    System.out.println("   / \\         ");
    System.out.println("  5   18         ");
    System.out.println("        \\       ");
    System.out.println("         19    ");


  }
}
