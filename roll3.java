import java.io.*;
import java.util.*;
class Node{
int data;
Node next;
Node prev;
public Node(int x){
data=x;
}
}

public class roll3{

public static Node start;
public static void insert(Node a){

	if(start==null){
	start=a;
	start.next=start;
	return;
}
	a.next=start.next;
	start.next=a;
	
	
}

public static void display(){

	Node current=start;
	do{
	System.out.print(current.data+ " ");
	current=current.next;
	}while(current!=start);
}

public static void swap(){

	Node first=start;
	Node last=start;
	Node slast;
	do{
	slast=last;
	last=last.next;
	
	}while(last.next!=start);
	
	last.next=start.next;
	slast.next=first;
	first.next=last;
	start=last;
	
}

public static void main(String args[]){

			int i=0;
			int value,up,down;
			Node a;
		Scanner scan=new Scanner(System.in);
		while(i==0)
		{
			System.out.println("\n1.Insert\n2.Display\n3.Swap\n4.Exit\nEnter choice");
			int ch=scan.nextInt();
			
			switch(ch)
			{
				case 1:System.out.println("Enter element");
				value=scan.nextInt();
				a=new Node(value);
				insert(a);
				break;
				case 2:display();
				break;	
				case 3:swap();
				display();
				break;

				case 4:i=1;
				System.out.println("Terminating");
				break;
				default:System.out.println("Invalid input");
				break;
			}
		}		

}

}