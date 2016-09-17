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
class amaz2{

public static Node root;
public static int sumodd=0;
public static int sumeven=0;


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
	
	public static int getLevel(Node a){
	int lh,rh;
	if(a!=null){
	
	lh=getLevel(a.lchild);
	rh=getLevel(a.rchild);
	if(lh>rh)
	return lh+1;
	else 
	return rh+1;
	
	}
	return 0;
	}
	
	 
	public static void display(Node a, int level,int original){
		
		if(level>1){
		display(a.lchild,level-1,original);
		display(a.rchild,level-1,original);
		return;
		}
		if(a!=null){
		if(original%2==0){
		sumeven+=a.data;
		}
		else{
		sumodd+=a.data;
		}
		}
	} 

public static void main(String args[]){
	int i=0;
			int value,j,k;
			int lev;
			int diff;
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
				case 2: lev=getLevel(root);
				for(k=lev;k>=1;k--)
				{
				j=k;
				display(root,k,j);
				}
				diff=sumeven-sumodd;
				System.out.println("Difference"+diff);
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