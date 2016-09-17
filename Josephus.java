import java.io.*;
import java.util.*;

class Node{
	int data;
	Node next;
	}
public class Josephus{
			public static Node start=null;
			public static void create(int x){
				Node a=new Node();
				Node current=new Node();
				current=start;
				a.data=x;
				if(start==null){
				a.next=a;
				start=a;
				}
				else{
				while(current.next!=start){
				current=current.next;
				}
				current.next=a;
				a.next=start;
				}
				
				}
				
			public static void delete(int gap,Node begin){
				Node current=new Node();
				int y=gap;
				start=begin;
				Node prev=new Node();
				prev.next=start;
				current=start;
				int x=0;
				while(x<gap-1){
				current=current.next;
				prev=prev.next;
				x++;
				}
				if(current==start && current.next==start){
				return;
				}
				else{
				prev.next=current.next;
				delete(y,prev.next);
				}
			}			
				
			public static void display(){
				
				Node current=new Node();
				current=start;
				do{
				System.out.print(current.data);
				current=current.next;
				}while(current!=start);
				}	
			
			public static void main(String args[]){
				int n,gap,i=1;
				
				Scanner s=new Scanner(System.in);
				System.out.println("Enter number of people");
				n=s.nextInt();
				System.out.println("Enter gap");
				gap=s.nextInt();
				while(n!=0){
				
				create(i);
				i++;
				n--;
				
				}
				delete(gap,start);
				display();
				}
				}