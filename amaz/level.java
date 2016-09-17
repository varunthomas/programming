//level order traversal

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

class level{
	public static int lh,rh;
	public static Node root =null;


	public static int height(Node a){
		if(a==null)
			return 0;
		lh=1+height(a.lchild);
		rh=1+height(a.rchild);
		if(lh>rh)
			return lh;
		else
			return rh;
	}

	public static void levelorder(Node a, int level){
		if(level==0)
			return;
		if(level==1)
			System.out.print(a.data+" ");
		else if(level>1){
			if(a.lchild!=null)
				levelorder(a.lchild,level-1);
			if(a.rchild!=null)
				levelorder(a.rchild,level-1);
		}

	}

	public static void main(String[] args){
		root =new Node(5);
		root.lchild=new Node(7);
		root.rchild=new Node(3);
		root.lchild.lchild=new Node(15);
		root.lchild.rchild=new Node(2);
		root.rchild.lchild=new Node(8);
		root.rchild.rchild=new Node(1);
		root.rchild.rchild.rchild=new Node(29);
		int v = height(root);
		for(int i=1;i<=v;i++){
			levelorder(root,i);
		}

	}
}