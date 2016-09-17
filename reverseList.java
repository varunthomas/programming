import java.util.*;
import java.io.*;

class Node{
			int data;
			Node next;
			}

class reverseList{
					public static Node start=null;
					public static Node first=null;
					
					public static void reverse(){
						Node prev =new Node();
						Node current=new Node();
						Node next=new Node();
						prev=null;
						current=start;
						
						while(current!=null){
						next=current.next;
						current.next=prev;
						prev=current;
						current=next;
						}
						start=prev;
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
					public static void insertEnd(int x){
						Node current=new Node();
						Node a=new Node();
						a.data=x;
						a.next=null;
						if(start==null){
						start=a;
						 
						}
						else{
							current=start;
							while(current.next!=null){
							current=current.next;
							}
							current.next=a;
							}
						
					}
					public static void main(String args[]){
							int n,x;
							int i=0;
							System.out.println("How many elements");
							Scanner s=new Scanner(System.in);
							n=s.nextInt();
							System.out.println("Enter elements");
							while(i<n){
							x=s.nextInt();
							insertEnd(x);
							i++;
							}
							System.out.println("Before reverse:\n");
							display();
							System.out.println("After reverse:\n");
							reverse();
							display();
							}
					}
						
						