import java.io.*;
import java.util.*;

class Node{
	Node next;
	int data;
	Node(int x){
	data=x;
	}
	}

class roll9{

public static Node start; 

public static void insert(Node a){
	Node current=start;
	if(start==null){
		start=a;
		start.next=null;
		return;
	}
	while(current.next!=null){

	current=current.next;
	}
	current.next=a;
	

}

public static int mode(){
	int i=0;
	int k;
	int final_mode=0;
	int[] count=new int[50];
	int[] freq=new int[50];
	for(i=0;i<count.length;i++){
		count[i]=0;
		freq[i]=0;
	}

	Node current=start;
	i=0;
	while(current!=null){
	count[i]=current.data;
	System.out.println(count[i]);
	current=current.next;
	i++;
	}
	int j=i;
	for(i=0;i<j;i++)
	for(k=0;k<j;k++){
	if(count[i]==count[k]){
	freq[i]++;
	}
	}
	for(i=0;i<j;i++)
	System.out.print(freq[i]);

	for(i=0;i<freq.length;i++){
	if(freq[i]>final_mode){
	final_mode=freq[i];
	}
	}
	return final_mode;
}

public static void display(){

	Node current=start;
	while(current!=null){
	System.out.println(current.data);
	current=current.next;
	}
}

public static void main(String args[]){

	int i=0;
	int ch;
	int big;
	Node a;
	int value;
	Scanner s=new Scanner(System.in);
	while(i!=1){
	System.out.println("1.Insert\n2.Find Mode\n3.Display\n4.Exit\n");
	ch=s.nextInt();
	switch(ch){
	case 1:System.out.println("Enter Value\n");
		   value=s.nextInt();
		   a=new Node(value);
		   insert(a);
		   break;
	case 2:big=mode();
			System.out.println("Biggest:"+big);
			break;
	case 3:display();
			break;
	case 4:i=1;
			break;
	}

}

}

}	