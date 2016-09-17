import java.io.*;
import java.util.*;

class Node{

	Node next;
	int data;
}

public class reversealt{

	public static Node start=null;
	public static void insert(Node a){

		if(start==null){
			start=a;
			start.next=null;
			return;
		}

		Node current=start;
		while(current.next!=null)
			current=current.next;
		current.next=a;
		a.next=null;


	}

	public static void reverse(int k){
		
		Node prev=null;
		Node after=new Node();
		Node current=start;
		after=current.next;
		int count=k;
		int alt=0;
		while(current!=null || count!=0){

			
			current.next=prev;
			prev=current;
			current=after;
			after=after.next;
			count--;
		}

	}

	public static void display(){
		Node current=start;
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println();
	}


	public static void main(String args[]){

		int val,ch,k;
		int exit=0;

		Scanner s=new Scanner(System.in);
		while(exit==0){

			System.out.println("Enter choice");
			System.out.println("1.Insert\n2.reverse\n3.display\n4.exit");
			ch=s.nextInt();
			switch(ch){

				case 1:System.out.println("Enter value");
						val=s.nextInt();
						Node a=new Node();
						a.data=val;
						insert(a);
						break;
				case 2: System.out.println("Enter k");
						k=s.nextInt();
						reverse(k);
						System.out.println("reversed List:");
						display();
						break;
				case 3:display();
						break;
				case 4:exit=1;
						break;						
			}
		}
	}
}