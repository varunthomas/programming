import java.io.*;
import java.util.*;

class Node{
	Node next;
	int data;
	}

class roll10{

public static Node start1=null; 
public static Node start2=null;
public static void insert(int value){
	Node a=new Node();
	a.data=value;
	Node current=new Node();
	current=start1;
	if(start1==null){
		start1=a;
		start1.next=null;
		return;
	}
	while(current.next!=null){

	current=current.next;
	}
	current.next=a;
	

}

public static void sort(int value){
	Node a=new Node();
	a.data=value;
	Node current1=new Node();
	Node current2=new Node();
	current1=start1;
	current2=start2;
	while(current1!=null){
	if(current1.data<a.data){
	if(start2==null){
	start2=new Node();
	start2.data=current1.data;
	start2.next=null;
	current2=start2;
	}
	else{
	while(current2.next!=null){
	current2=current2.next;
	}
	current2.next=new Node();
	current2.next.data=current1.data;
	}
	}
	current1=current1.next;
	}
	
	current1=start1;
	
	while(current1!=null){
	if(current1.data>=a.data){
	if(start2==null){
	start2=new Node();
	start2.data=current1.data;
	start2.next=null;
	current2=start2;
	}
	else{
	while(current2.next!=null){
	current2=current2.next;
	}
	current2.next=new Node();
	current2.next.data=current1.data;
	}
	}
	current1=current1.next;
	}
	
	display_sorted();
	
	
	}

	public static void display_sorted(){
	
	Node current=new Node();
	current=start2;
	while(current!=null){
	System.out.println(current.data);
	current=current.next;
	}
	
	}
	
public static void display(){
	Node current=new Node();
	current=start1;
	while(current!=null){
	System.out.println(current.data);
	current=current.next;
	}
}

public static void main(String args[]){

	int i=0;
	int ch;
	int value;
	Scanner s=new Scanner(System.in);
	while(i!=1){
	System.out.println("1.Insert\n2.Find Mode\n3.Display\n4.Exit\n");
	ch=s.nextInt();
	switch(ch){
	case 1:System.out.println("Enter Value\n");
		   value=s.nextInt();
		   insert(value);
		   break;
	case 2:System.out.println("Enter value:");
			value=s.nextInt();
			sort(value);
			break;
	case 3:display();
			break;
	case 4:i=1;
			break;
	}

}

}

}	