
import java.io.*;
import java.util.*;
import java.lang.*;
class Node{
Node lchild;
Node rchild;
int data;
public Node(int x){
	data=x;
	}
}
class roll4{

		public static Node root;
		public static int hleft=0;
		public static int balfac;
		public static int hright=0;
	
		public static void insert(Node a){
		Node x=root;
		if(root==null){
		root=a;
		return;
		}
		else{
		while(true){
		
		if(a.data>x.data){
		if(x.rchild==null){
		x.rchild=a;
		return;
		}
		x=x.rchild;
		}
		else if(a.data<x.data){
		
		if(x.lchild==null){
		x.lchild=a;
		return;
		}
		x=x.lchild;
		}
		else
		return;
		}
		}
	}
	
/* 	public static void check(Node a){

	if(a.lchild!=null){
	System.out.println(a.data);
	check(a.lchild);
	}
	if(a.rchild!=null){
	System.out.println(a.data);
	check(a.rchild);
	}
	
	} */
	

	
	
	  public static boolean isBalanced(Node root)
    {
        int lh; /* for height of left subtree */
        int rh; /* for height of right subtree */
 
        if (root == null)
            return true;
 
        lh = height(root.lchild);
        rh = height(root.rchild);
 
        if (Math.abs(lh - rh) <= 1 && isBalanced(root.lchild)
                && isBalanced(root.rchild))
            return true;
 
        return false;
    }
 
    public static int max(int a, int b)
    {
        return (a >= b) ? a : b;
    }
 
    public static int height(Node node)
    {
        if (node == null)
            return 0;
 
        return 1 + max(height(node.lchild), height(node.rchild));
    }
	

	
	public static void main(String args[]){
	
			int i=0;
			int value;
			int p;
			Node a;
		Scanner scan=new Scanner(System.in);
		while(i==0)
		{
			System.out.println("1.Insert\n2.Check\n3.Exit\nEnter choice");
			int ch=scan.nextInt();
			
			switch(ch)
			{
				case 1:System.out.println("Enter element");
				value=scan.nextInt();
				a=new Node(value);
				insert(a);
				break;
				case 2: if (isBalanced(root))
            System.out.println("Tree t1 is AVL tree");
        else
            System.out.println("Tree t1 is not AVL tree");
				break;
				case 3:i=1;
				System.out.println("Terminating");
				break;
				default:System.out.println("Invalid input");
				break;
			}
		}		
	
	
	
	}
	
}	