import java.io.*;
import java.util.*;

class Node{

	Node next;
	int data;
}

public class stacklist{


	public static Node start=null;




	public static void main(String args[]){

		
		int n;
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of numbers");
		n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter num");
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
			Node a=new Node();
			temp=arr[i];
			x=temp;
			int[] num=new int[20];
			while(x!=0){
				temp=x%10;
				x=x/10;
			}	


			a.data=arr[i];
			

		}
		display();
		sum();			


			
		

		
	}
}