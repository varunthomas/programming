import java.io.*;
class node
{
	public int d;
	public node leftchild,rightchild;
	public node(int x)
	{
		d=x;
	}
}

class tree
{
	public node root;
	
	public void insert(node a)
	{
		node x=root;
		if(root==null)
		{
			root=a;
			return;
		}
		else
		{
			while(true)
			{
				if(a.d<x.d)
				{
					if(x.leftchild==null)
					{
						x.leftchild=a;
						return;
					}
					x=x.leftchild;
				}
				else if(a.d>x.d)
				{
					if(x.rightchild==null)
					{
						x.rightchild=a;
						return;
					}
					x=x.rightchild;
				}
				else
				return;
			}
		}
	}

	public int findHeight(node a){

		int lh,rh;
		if(a==null){

			return 0;
		}
		else{

			lh=1+findHeight(a.leftchild);
			rh=1+findHeight(a.rightchild);

			return lh>rh?lh:rh;
			

		}
	}
	
}

class height
{
	public static void main(String args[])throws IOException
	{
		tree T=new tree();
		node a;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int ch,value,h;
		do
		{
			System.out.println("\nMenu\n");
			System.out.println("1 Insert Node");
			System.out.println("2 Find height");	
			System.out.println("3 Traverse Tree");
			System.out.println("4 Delete Node");
			System.out.println("5 Exit");
			System.out.println("\nEnter Your Choice");
			ch=Integer.parseInt(in.readLine());
			switch(ch)
			{
				case 1:  System.out.println("\nEnter Value");
					 value=Integer.parseInt(in.readLine());
					 a=new node(value);
					 T.insert(a);
					 break;
				case 2: h= T.findHeight(T.root);
						h=h-1;
						System.out.println("Height is "+h);
					 break;
				case 3:  
					 break;
				case 4:  
					 break;
				case 5:  System.out.println("Exiting"); break;
				default: System.out.print("Invalid Choice");
			}
			System.out.println();
		}while(ch!=5);
	}
}
