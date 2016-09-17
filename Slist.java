import java.io.*;
import java.util.*;

	class Node{
			
		int data;
		Node next;
		}
	

	class Slist{
	
			public static  Node start=null;
			
			public static void insertBegin(int x){
			
					Node a =new Node();
					a.data=x;
					a.next=start;
					start=a;
					}
					
			public static void display(){
			Node current=new Node();
		    current=start;
			if(current==null)
			System.out.println("Empty list");
			else
			while(current!=null){
			System.out.println(current.data);
			current=current.next;
			}
					}
					
			public static void insertMid(int x,int y){
			int flag=0;
				if(start==null)
					insertBegin(x);
				else{
					
					Node current=new Node();
					Node a=new Node();
					current=start;
					while(current!=null){
						if(current.data!=y)
						current=current.next;
						else {
						a.data=x;
						a.next=current.next;
						current.next=a;
						flag=1;
						current=current.next;
						}
						}
					if(flag==0)
					System.out.println("Element not found");
				}
			}	
			
			public static void delete(int x){
			Node current=new Node();
			current=start;
			Node prev=new Node();
			prev.next=current;
			while(current.data!=x && current!=null){
				prev=prev.next;
				current=current.next;
				}
			if(current==null)
				System.out.println("Element not found");
				else if(current.next==null && prev.next==start){
				start=null;
				}
			else{
				prev.next=current.next;
				}
				}
				
			
			public static void main(String args[]){
			int c,value,pos,i=0;
			while(i==0){
			Scanner s=new Scanner(System.in);
			System.out.println("Enter option");
			System.out.println("1.Insert at beginning\n2.Insert at mid\n3.Display\n4.Delete\n5.Exit\n");
			c=s.nextInt();
			switch(c){
			case 1: System.out.println("Enter value");
					 value=s.nextInt();
					insertBegin(value);
					break;
			case 2: System.out.println("Enter value");
					value=s.nextInt();
					System.out.println("Enter position");
					pos=s.nextInt();
					insertMid(value,pos);
					break;
			case 3: display();	
					break;
			case 4: System.out.println("Enter value to delete");
					value=s.nextInt();
					delete(value);
					break;
			case 5: i=1;
					break;		
			}
				}
			}
		
			}