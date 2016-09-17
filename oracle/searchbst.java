//Given a bst search for an element

import java.io.*;
import java.util.*;

 class Node{

	Node lchild,rchild;
	int data;
	public Node(int x){
		data=x;

	}
}

 class searchbst{

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

	public static int search(Node a, Node c){
		int x;
		if(c==null)
			return 0;
		else if(c.data==a.data)
			return 1;
		else if(a.data>c.data){
			x= search(a,c.rchild);
			return x;
		}
		else if(a.data<c.data){
			x= search(a,c.lchild);
			return x;
		}
		else 
			return 0;

		
	}

	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		int ch;
		Node a;
		int val;
		int res;
		int exit=0;
		while(exit!=1){
		System.out.println("Enter choice");
		System.out.println("1.Insert 2.Search 3.Exit");
		ch=s.nextInt();
		switch(ch){
			case 1: System.out.println("Enter val");
			val=s.nextInt();
			a=new Node(val);
			insert(a);
			break;
			case 2: System.out.println("Enter value to search");
			val=s.nextInt();
			a=new Node(val);
			res=search(a,root);
			if(res==1)
				System.out.println("Found");
			else 
				System.out.println("Not Found");
			break;
			case 3: exit=1;
			break;
		}
	}
	}
}