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

public class roll35{

	public static Node root;

	public static void insert(Node a){
		if(root==null){
			root=a;
			return;
		}
		Node current=root;
		while(current!=null){
		if(a.data>current.data && current.rchild!=null){
			current=current.rchild;
		}
		else if(a.data<current.data && current.lchild!=null){
			current=current.lchild;
		}
		else if(a.data>current.data && current.rchild==null){
			current.rchild=a;
			return;
		}
		else if(a.data<current.data && current.lchild==null){
			current.lchild=a;
			return;
		}

		}


	}

	public static void display(Node a){
		if(a!=null){
		System.out.print(a.data+" ");
		display(a.lchild);
		display(a.rchild);
	}
	}

	public static void mirror(Node a){
		if(a!=null){
		Node temp;
		temp=a.lchild;
		a.lchild=a.rchild;
		a.rchild=temp;
		mirror(a.lchild);
		mirror(a.rchild);
	}
	}

	public static void main(String args[]){

		int ch,x,exit=0;
		Scanner s=new Scanner(System.in);
		while(exit!=1){
		System.out.println("Enter the choice");
		System.out.println("1.Insert\n2.Display\n3.Mirror\n4.Exit");
		ch=s.nextInt();
		switch(ch){
			case 1: System.out.println("Enter data");
					x=s.nextInt();
					Node a=new Node(x);
					insert(a);
					break;
			case 2: display(root);
					break;
			case 3: mirror(root);
					break;
			case 4: exit=1;
					break;					
			}
		}
	}
}