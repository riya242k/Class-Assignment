import java.util.*;  
public class BinaryNode2
{ 
    static class Node
{ 
    int data; 
    Node left, right; 
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} ;
    Node root; 
  
    public BinaryNode2() 
    { 
        root = null; 
    }
    void printLevelOrder(Node root) 
    { 
        int h = height(root); 
        int i; 
        for (i=h; i>=1; i--) {
            printGivenLevel(root, i);
            System.out.println(" ");
            } 
    }
    int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
 
            int lheight = height(root.left); 
            int rheight = height(root.right);
            if (lheight >= rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    }
    void printGivenLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 
    Node insert(Node root, int data)  
   {  
    Node node= new Node(data);
    if(root==null){
        return node;
    } 
    Node parent=null, current = root;
    while(current!=null){
        parent=current;
        if(current.data>=data){
            current=current.right;
        }
        else{
            current=current.left;
        }
    }
    if(parent.data>=data){
        parent.right=node;
    }
    else{
        parent.left=node;
    }
    return root;
    }
    void Inorder(Node root)  
   {  
    if (root == null)  
        return;  
    else {  
        Inorder(root.left);  
        System.out.print( root.data +" ");  
        Inorder(root.right);  
    }  
   } 
   void Preorder(Node root)  
   {  
    if (root == null)  
        return;  
    else {  
    	System.out.print( root.data +" ");
        Preorder(root.left);    
        Preorder(root.right);  
    }  
   } 
   void Postorder(Node root)  
   {  
    if (root == null)  
        return;  
    else {  
        Postorder(root.left);   
        Postorder(root.right); 
        System.out.print( root.data +" ");  
    }  
   }    
public static void main(String args[])  
{
    BinaryNode2 tree=new BinaryNode2();
    Node root = null;  
    root = tree.insert(root, 40);  
    tree.insert(root, 70);  
    tree.insert(root, 30);  
    tree.insert(root, 80);  
    tree.insert(root, 50);  
    tree.insert(root, 35);  
    tree.insert(root, 20);    
    tree.printLevelOrder(root);
    tree.Inorder(root);
    System.out.println();
    tree.Preorder(root);
    System.out.println();
    tree.Postorder(root); 
    } 
}
