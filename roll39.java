import java.io.*;
import java.util.*;

class Node{
		int data;
		Node next;
		Node prev;

	}

public class roll39{

	public static Node start;

	public static void insert(Node a){

		if(start==null){
			start=a;
			return;	
		}

		Node current=start;
		while(current.next!=null)
			current=current.next;
		current.next=a;
		a.prev=current;

	}

	public static void display(){
		Node current=start;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}

	public static void shift(int x){

		Node current=start;
		Node previous=new Node();
		while(current.data!=x && current.next!=null){
			previous=current;
			current=current.next;
		}
		Node newFront=new Node();
		if(current==start){
			newFront.data=current.data;
			newFront.next=start.next;
			if(current.next!=null)
			start.next.prev=newFront;
		}
		else{
		newFront.data=current.data;
		previous.next=current.next;
		if(current.next!=null)
		current.next.prev=previous;
		newFront.next=start;
		start.prev=newFront;
	}
		System.out.println("New Node is:\n");
		current=newFront;
		while(current!=null){
			System.out.print(current.data+ " ");
			current=current.next;
		}
	}

	public static void main(String args[]){
		int ch,x,exit=0;
		Scanner s=new Scanner(System.in);
		while(exit!=1){
		System.out.println("ENter the choice");
		System.out.println("1.Add\n2.Display\n3.Shift\n4.Exit");
		ch=s.nextInt();
		switch(ch){
			case 1: System.out.println("Enter data");
					x=s.nextInt();
					Node a=new Node();
					a.data=x;
					insert(a);
					break;
			case 2: display();
					break;
			case 3: System.out.println("Enter value to be shifted");
					x=s.nextInt();
					shift(x);
					break;
			case 4: exit=1;
					break;					
			}
		}
	}
}