import java.io.*;
import java.util.*;

class Node{
	Node rchild,lchild;
	int data;
	public Node(int x){
		data=x;
	
	}
}
class Tree{
	public Node root;
 
	
	
			public void insert(Node a){
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

	public void search(Node a){
		Node c=root;
		if(root==null){
		System.out.println("BST EMPTY!!");
		return;
		}
		while(true){
		if(a.data>c.data){
		c=c.rchild;
		}
		else if(a.data<c.data){
		c=c.lchild;
		}
		if(c.data==a.data){
		System.out.println("Element found");
		return;
		}
		if(c.lchild==null && c.rchild==null){
		System.out.println("Element not found");
		return;
		}
		}
	
	
	}
	public void traverse()
	{
		System.out.print("Pre-Order  : ");
		preorder(root);
		System.out.println();
		System.out.print("In-Order   : ");
		inorder(root);
		System.out.println();
		System.out.print("Post-Order : ");
		postorder(root);
		System.out.println();
	}

	public void preorder(Node c)
	{
		if(c!=null)
		{
			System.out.print(c.data+"   ");
			preorder(c.lchild);
			preorder(c.rchild);
		}
	}

	public void inorder(Node c)
	{
		if(c!=null)
		{
			inorder(c.lchild);
			System.out.print(c.data+"   ");
			inorder(c.rchild);
		}
	}

	public void postorder(Node c)
	{
		if(c!=null)
		{
			postorder(c.lchild);
			postorder(c.rchild);
			System.out.print(c.data+"   ");
		}
	}
	
	public Node findparent(Node a){
	
	Node c=root;
	while(true){
	if(a.data>c.data){
	if(c.rchild.data==a.data){
	return c;
	}
	c=c.rchild;
	}
	if(a.data<c.data){
	if(c.lchild.data==a.data){
	return c;
	}
	c=c.lchild;
	}	
	}
	}

	public Node successor(Node a){
	Node c=a;
	c=c.rchild;
	while(c.lchild!=null){
	c=c.lchild;
	}
	return c;
	}
	
	public void delete(Node a){
	
	Node c=root;
	if(root==null){
	System.out.println("Empty tree\n");
	return;
	}

	Node parent=findparent(a);

	if(parent.lchild.data==a.data)
	{
	if(parent.lchild.lchild==null && parent.lchild.rchild==null)
	{
	parent.lchild=null;
	System.out.println("Deleted");
	return;
	}
	else if(parent.lchild.lchild!=null && parent.lchild.rchild==null){
	parent.lchild=parent.lchild.lchild;
	System.out.println("Deleted");
	return;
	}
	else if(parent.lchild.lchild==null && parent.lchild.rchild!=null){
	parent.lchild=parent.lchild.rchild;
	System.out.println("Deleted");
	return;
	}
	else if(parent.lchild.lchild!=null && parent.lchild.rchild!=null){
	Node s=successor(parent.lchild);
	Node x=parent.lchild.lchild;
	parent.lchild=s;
	s.lchild=x;
	System.out.println("Element Deleted");
	return;
	}	
	}
	
	if(parent.rchild.data==a.data)
	{
	if(parent.rchild.lchild==null && parent.rchild.rchild==null)
	{
	parent.rchild=null;
	System.out.println("Deleted");
	return;
	}
	else if(parent.rchild.lchild!=null && parent.rchild.rchild==null){
	parent.rchild=parent.rchild.lchild;
	System.out.println("Deleted");
	return;
	}
	else if(parent.rchild.lchild==null && parent.rchild.rchild!=null){
	parent.rchild=parent.rchild.rchild;
	System.out.println("Deleted");
	return;
	}
	
	else if(parent.rchild.lchild!=null && parent.rchild.rchild!=null){
	Node s=successor(parent.rchild);
	Node x=parent.rchild.lchild;
	parent.rchild=s;
	s.lchild=x.lchild;
	System.out.println("Element Deleted");
	return;
	}	
	
	}	
	
	
	}
	
	

}

class bst{
		public static void main(String args[]){
			Tree T=new Tree();
			int i=0;
			int value;
			Node a;
		Scanner scan=new Scanner(System.in);
		while(i==0)
		{
			System.out.println("1.Insert\n2.Display\n3.Search\n4.Delete a node\n5.Exit\nEnter choice");
			int ch=scan.nextInt();
			
			switch(ch)
			{
				case 1:System.out.println("Enter element");
				value=scan.nextInt();
				a=new Node(value);
				T.insert(a);
				break;
				case 2:T.traverse();
				break;
				case 3:System.out.println("Enter value to be searched\n");
				value=scan.nextInt();
				a=new Node(value);
				T.search(a);
				break;
				case 4:System.out.println("Enter element to b deleted\n");
				value=scan.nextInt();
				a=new Node(value);
				T.delete(a);
				break;
				case 5:i=1;
				System.out.println("Terminating");
				break;
				default:System.out.println("Invalid input");
				break;
			}
		}		
	}
	}