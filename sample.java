import java.io.*;
import java.util.*;


	class Node{

		Node next;
		int data;
	}
public class sample{




	public static void callMe(){

		Node current=new Node();
		Node dis=current;
		current.data=5;
		current=current.next;
		current.data=6;
		current=current.next;
		current.data=7;
		current=current.next;
		current.data=8;
		current=current.next;
		current.data=9;
		while(dis.data!=9){
			System.out.println(dis.data);
			dis=dis.next;
		}
	}

	public static void main(String args[]){

		callMe();
		

	}
}