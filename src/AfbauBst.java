  import java.util.*;

public class AfbauBst {

	class Node{
		int key;
		Node left,right;
		Node(int item)
		{
			key=item;
			left=right=null;
		}
	}
	Node root;
       AfbauBst()
	{
		root=null;
	}
	
	Node insertRec(Node root,int key)
	{
		if(root==null) {
			root=new Node(key);
		return root;
		}
		if(key < root.key){
            root.left = insertRec(root.left, key);
        }else if(key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
	}
	
	void display(Node a)
	{
     	System.out.print(a.key+" ");
     	a=a.left;
     	if(a!=null)
     	{
     	display(a);
     	}
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AfbauBst tree = new AfbauBst();
        tree.root = tree.insertRec(tree.root, 40);
        tree.root = tree.insertRec(tree.root, 30);
        tree.root = tree.insertRec(tree.root, 70);
        tree.root = tree.insertRec(tree.root, 20);
        tree.root = tree.insertRec(tree.root, 35);
        tree.root = tree.insertRec(tree.root, 50);
        tree.root = tree.insertRec(tree.root, 80);
      
        
           while(tree.root!=null)
           {
        	   tree.display(tree.root);
        	   tree.root=tree.root.right;
           }
        
       
        
        

       
   }

}



