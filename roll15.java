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
class roll15{

		public static Node root;
	
		public static void insert(Node a){
		Node x=root;
		if(root==null){
		root=a;
		return;
		}
		else{
		while(true){
		
		if(x.lchild==null){
		x.lchild=a;
		return;
		}
		else if(x.lchild!=null && x.rchild==null){
		x.rchild=a;
		return;
		}
		
		}
		}
	}
	
	public static int check(Node a){
		if(a==null)
		return 1;
		else if(a.data>a.lchild.data && a.data<a.rchild.data){
		
		flag1=check(a.lchild);
		flag2=check(a.rchild);
		if(flag1==1 && flag2==1)
		return 1;
		else
		return 0;
		}
		else
		return 0;
	}
	
	public static void main(String args[]){
	
			int i=0;
			int value;
			int p,q;
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
				case 2: check();
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