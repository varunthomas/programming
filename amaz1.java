import java.io.*;
import java.util.*;

class Node{
Node lchild;
Node rchild;
int data;
public Node(int x){
data=x;
} 
}
class amaz1{

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
	
	public static void display(Node a, int level){
		if(level>0){
		
		display(a.lchild,level-1);
		display(a.rchild,level-1);
		return;
		}
		if(a!=null)
		System.out.print(a.data+" ");
	}

public static void main(String args[]){
	int i=0;
			int value;
			
			Node a;
		Scanner scan=new Scanner(System.in);
		while(i==0)
		{
			System.out.println("1.Insert\n2.Enter level\n3.Exit\nEnter choice");
			int ch=scan.nextInt();
			
			switch(ch)
			{
				case 1:System.out.println("Enter element");
				value=scan.nextInt();
				a=new Node(value);
				insert(a);
				break;
				case 2: System.out.println("LEVEL:");
				value=scan.nextInt();
				display(root,value);
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