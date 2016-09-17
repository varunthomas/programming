import java.io.*;
import java.util.*;

class Node{

	Node next;
	int data;
	
}

class reversel{

	public static Node start=null;

	public static void insert(int x){
		
		Node a=new Node();
		a.data=x;
		Node current=start;
		if(start==null){

			start=a;
			a.next=null;
			return;
		}
		else{

			while(current.next!=null)
				current=current.next;
			current.next=a;
			a.next=null;

		}


	}

	public static void display(){

		Node current=start;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}
	}	

	public static void reverse(){
		Node current=start;
		Node prev=new Node();
		Node after=new Node();
		prev=null;

		while(current!=null){
			after=current.next;
			current.next=prev;
			prev=current;
			current=after;
			

		}
		start=prev;
	}

	public static void main(String[] args){

		int ch,val;
		int exit=0;
		Scanner s=new Scanner(System.in);

		while(exit!=1){
				
				System.out.println("1.insert 2.rev 3. display 4.exit");
				ch=s.nextInt();
				switch(ch){

					case 1:System.out.println("Enter value");
					val=s.nextInt();
					insert(val);
					break;

					case 2: reverse();
					break;

					case 3:display();
					break;
					case 4:exit=1;
					break;

				}

		}
	}

}