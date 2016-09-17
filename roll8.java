
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
class roll8{

		public static Node root;
	
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
	
	public static int maxheight(Node a){
		
		int lheight,rheight;
		if(a==null)
		return -1;
		
		lheight=maxheight(a.lchild);
		rheight=maxheight(a.rchild);
		if(lheight>rheight)
			return lheight+1;
		else
			return rheight+1;
			
	
	}

	
	public static int nodes(Node a){
	
		int lnode,rnode;
		if(a==null)
		return 0;
		
		lnode=nodes(a.lchild);
		rnode=nodes(a.rchild);
		return lnode+rnode+1;
	}
	
	public static void main(String args[]){
	
			int i=0;
			int value;
			int p,q;
			Node a;
		Scanner scan=new Scanner(System.in);
		while(i==0)
		{
			System.out.println("1.Insert\n2.Get\n3.Exit\nEnter choice");
			int ch=scan.nextInt();
			
			switch(ch)
			{
				case 1:System.out.println("Enter element");
				value=scan.nextInt();
				a=new Node(value);
				insert(a);
				break;
				case 2: p=maxheight(root);
						q=nodes(root);
						System.out.println("Max Height:"+p+"\n");
						System.out.println("No of nodes:"+q+"\n");
						q=q-1;
						System.out.println("No of eddges:"+q+"\n");
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