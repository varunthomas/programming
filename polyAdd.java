import java.util.*;
import java.io.*;
class Node{
			int c;
			int e;
			Node next;
			
			}

class polyAdd{
					public static Node p1=null;
					public static Node p2=null;
					public static Node start1=p1;
					public static Node start2=p2;
					
				public static void display(Node start){
				         	
					 Node current=new Node();
					current=start;
					System.out.print("\n");
					if(current==null)
					System.out.println("Empty");
					while(current!=null){
						
						System.out.print(current.c+"x^"+current.e+"+");
						current=current.next;
						} 
						}
				
				public static Node insert(Node p,int c,int e){
					
					Node a=new Node();
					Node prev=new Node();
					Node current =new Node();
						current=p;
						prev.next=current;
					a.e=e;
					a.c=c;
					
					if(p==null){
					
						a.next=null;
						p=a;
				
						
						}
					
						else{
						while(current!=null && current.e>a.e){
							prev=prev.next;
							current=current.next;
							
							}
							
							a.next=current;
							prev.next=a;
							p=a;
							
							 }
							
							
						
					return p;
				}
				
				public static void main(String args[]){
						int n,c,e,count1=0,count2=0;
						Scanner s=new Scanner(System.in);
						System.out.println("Enter no of terms of first polynomial");
						n=s.nextInt();
						while(n!=0){
							System.out.println("Enter the coefficient");
							c=s.nextInt();
							System.out.println("Enter exponent");
							e=s.nextInt();
							
						
							p1=insert(p1,c,e);
							if(count1==0){
							start1=p1;
							}
							n--;
							count1++;
							
							}
						System.out.println("Enter no of terms of second polynomial");
						n=s.nextInt();
						while(n!=0){
							System.out.println("Enter the coefficient");
							c=s.nextInt();
							System.out.println("Enter exponent");
							e=s.nextInt();
							
							p2=insert(p2,c,e);
							if(count2==0){
							start2=p2;
							}
							n--;
							count2++;
							}	
							display(start1);
							display(start2);
						}	
						}