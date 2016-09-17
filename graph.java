Program:25

//Varun Thomas C4A 63
//Graph
import java.io.*;
importjava.lang.String.*;

class vertex
{
	public char label;
	public boolean visited;
	public vertex(char a)
	{
		label=a;
		visited=false;
	}
}

class node
{
	publicint data;
	public node next;
	public node(int x)
	{
		data=x;
	}
}

class Queue
{
	public node front,rear;
	
	public void enqueue(int x)
	{
		node a=new node(x);
		if(front==null)
		front=rear=a;
		else
		{
			rear.next=a;
			rear=rear.next;
		}
	}
	
	public int dequeue()
	{
		int x=-1;
		if(!isempty())
		{
			x=front.data;
			front=front.next;
		}
		return x;
	}

	public boolean isempty()
	{
		return (front==null);
	}
}

class Graph
{
	public int n;
	public vertex v[];
	public int adjmat[][];
	Queue q;
	public Graph()
	{
		n=0;
		v=new vertex[20];
		adjmat=new int[20][20];
		q=new Queue();
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
			adjmat[i][j]=0;
	}
	
	public void addvertex(vertex a)
	{
		v[n++]=a;
	}
	
	public void clearvisits()
	{
		for(int i=0;i<n;i++)
		v[i].visited=false;
	}
	
	public void addedge(String X)
	{
		inti,j;
		for(i=0;i<n;i++)
		{
			if(v[i].label==X.charAt(0))
			break;
		}
		for(j=0;j<n;j++)
		{
			if(v[j].label==X.charAt(1))
			break;
		}
		adjmat[i][j]=adjmat[j][i]=1;
	}

	public void displayadjmat()
	{
		System.out.print(" ");
		for(int i=0;i<n;i++)
		System.out.print("  "+v[i].label);
		for(int i=0;i<n;i++)
		{
			System.out.println();
			System.out.print(v[i].label+"  ");
			for(int j=0;j<n;j++)
			{
				System.out.print(adjmat[i][j]+"  ");
			}
		}
	}
	
	public void traverse()throws IOException
	{
		int ch;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nMENU\n");
		System.out.println("1 BFS");
		System.out.println("2 DFS");	
		System.out.println("\nEnter Your Choice for Traversal Algorithm");
		ch=Integer.parseInt(in.readLine());
		switch(ch)
		{
			case 1:  System.out.print("BFS : ");
				BFS(0);
				clearvisits();
				break;
			case 2:  System.out.print("DFS : ");
				DFS(0);
				clearvisits();
				break;
			default: System.out.print("Invalid Choice For Traversal Algorithm");
		}
		System.out.println();
	}

	
public void BFS(int x)
	{
		v[x].visited=true;
		q.enqueue(x);
		while(!(q.isempty()))
		{
			x=q.dequeue();
			System.out.print(v[x].label+"   ");
			for(int i=0;i<n;i++)
			{
				if(adjmat[x][i]==1&&v[i].visited==false)
				{
					v[i].visited=true;
					q.enqueue(i);
				}
			}
		}
	}

	public void DFS(int x)
	{
		v[x].visited=true;
		System.out.print(v[x].label+"   ");
		for(int i=0;i<n;i++)
		{
			if(adjmat[x][i]==1&&v[i].visited==false)
			{
				DFS(i);
			}
		}
	}
	
}


class run
{
	public static void main(String args[])throws IOException
	{
		Graph G=new Graph();
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int ch;
		char label;
		vertex v;
		String edge;
		System.out.println("\nEnter Labels For Vertices To Be Added");
		while(true)
		{
			try
			{
				label=(in.readLine()).charAt(0);
			}
			catch(Exception E)
			{
				break;
			}
			v=new vertex(label);
			G.addvertex(v);
		}
		System.out.println("Enter Label Of Edges To Be Inserted (eg: AB)");
		while(true)
		{
			edge=in.readLine();
			if(edge.equals(""))
			break;
			G.addedge(edge);
		}
		do
		{
			System.out.println("\nGraph Menu\n");	
			System.out.println("1 Traverse Graph");
			System.out.println("2 Display Adjacency Matrix");
			System.out.println("3 Exit");
			System.out.println("\nEnter Your Choice");
			ch=Integer.parseInt(in.readLine());
			switch(ch)
			{
				case 1:  G.traverse();
					break;
				case 2:  G.displayadjmat();
					break;
				case 3:  System.out.println("Thanks For Using Graph"); break;
				default: System.out.print("Invalid Choice");
			}
			System.out.println();
		}while(ch!=3);
	}
}		





















/*

Execution Steps:
varun@varun:~$ javac graph.java // to compile this program
varun@varun:~$ java graph // to run this program

Output:

Enter Labels For Vertices To Be Added 
A
B
C
D
E
F
G
H
I

Enter Label Of Edges To Be Inserted (eg: AB)
AB
AC
BF
AG
GF
CF
FH
CD
EI
DE


Graph Menu

1 Traverse Graph
2 Display Adjacency Matrix
3 Exit

Enter Your Choice
2
   A  B  C  D  E  F  G  H  I
A  0  1  1  0  0  0  1  0  0  
B  1  0  0  0  0  1  0  0  0  
C  1  0  0  1  0  1  0  0  0  
D  0  0  1  0  1  0  0  0  0  
E  0  0  0  1  0  0  0  0  1  
F  0  1  1  0  0  0  1  1  0  
G  1  0  0  0  0  1  0  0  0  
H  0  0  0  0  0  1  0  0  0  
I  0  0  0  0  1  0  0  0  0

Graph Menu 

1 Traverse Graph
2 Display Adjacency Matrix
3 Exit

Enter Your Choice
1

Traversal Menu 

1 BFS
2 DFS

Enter Your Choice for Traversal Algorithm
1
BFS : A   B   C   G   F   D   H   E   I   


-------------- Graph Menu ----------------

1 Traverse Graph
2 Display Adjacency Matrix
3 Exit

Enter Your Choice
1

Menu 

1 BFS
2 DFS

Enter Your Choice for Traversal Algorithm
2
DFS : A   B   F   C   D   E   I   G   H   



*/