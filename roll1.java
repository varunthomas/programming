import java.io.*;
import java.util.*;

class Node{
	Node rchild,lchild;
	int data;
	public Node(int x){
		data=x;
	
	}
}
class roll1{
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
	
	
	public static void preorder(Node c, Node a, Node b){	
		if(c!=null){
		if(c.data>a.data && c.data<b.data)
		System.out.println(c.data);
		preorder(c.lchild,a,b);
		preorder(c.rchild,a,b);
		}
	}
	
	
	
	public static void main(String args[]){
	
			int i=0;
			int value,up,down;
			Node a;
			Node b;
		Scanner scan=new Scanner(System.in);
		while(i==0)
		{
			System.out.println("1.Insert\n2.Display\n3.Exit\nEnter choice");
			int ch=scan.nextInt();
			
			switch(ch)
			{
				case 1:System.out.println("Enter element");
				value=scan.nextInt();
				a=new Node(value);
				insert(a);
				break;
				case 2:System.out.println("Enter lower limit:\n");
				down=scan.nextInt();
				System.out.println("Enter upper limit:\n");
				up=scan.nextInt();
				a=new Node(down);
				b=new Node(up);
				System.out.println("Elements are:");
				preorder(root,a,b);
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