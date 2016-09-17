import java.io.*;
import java.util.*;
class Node{
int data;
Node child;
public Node(int x){
data=x;
}
}

class first{

insert(Node a){

}

}

class second{
public static void main(String args[]){
first f=new first();
int i=0;
Scanner scan=new Scanner(System.in);
		while(i==0)
		{
			System.out.println("1.Insert at beginning\n2.Display\n3.Exit\nEnter choice");
			int ch=scan.nextInt();
			
			switch(ch)
			{
				case 1:System.out.println("Enter element");
				x=scan.nextInt();
				Node a=new Node(x);
				T.insert(a);
				break;
				case 2:System.out.println("Preorder:");
				T.preorder(T.root);
				System.out.println("Inorder:");
				T.inorder(T.root);
				System.out.println("Postorder:");
				T.postorder(T.root);
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