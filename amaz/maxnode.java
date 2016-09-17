import java.io.*;
import java.util.*;

	class Node{
		Node lchild;
		Node rchild;
		int data;
		public Node(int x){
			data=x;
		}
	}

	public class maxnode{
	public static Node root =null;

	public static void insert(Node a){
		if(root ==null){
			root=a;
			return;
		}
		Node current = root;
		while(true){
			if(a.data>current.data && current.rchild!=null){
				current = current.rchild;
			}
			else if(a.data<=current.data && current.lchild!=null){
				current = current.lchild;
			}
			else if(a.data>current.data && current.rchild==null){
				current.rchild =a;
				return;
			}
			else if(a.data<=current.data && current.lchild==null){
				current.lchild=a;
				return;
			}
		}

	}

	public static int count;

	public static void traverse(Node a){
		if (a!=null){
			System.out.print(a.data+ " ");
			count++;
			traverse(a.lchild);
			traverse(a.rchild);
		}
	}

	//public static int j=0;
	public static int[] zero =new int[count];
	/*public static int[] maxNode(Node a,int[] sum){
		sum[0]=1;
		if(a.lchild==null && a.rchild==null){
			return sum;
		}
		System.out.println(j);
		j++;
		System.out.println("after "+j);
		if(a.lchild!=null)
			sum[j]++;
		if(a.rchild!=null)
			sum[j]++;
		if(a.lchild!=null)
			sum=maxNode(a.lchild,sum);
		if(a.rchild!=null)
			sum=maxNode(a.rchild,sum);
		return sum;
	}*/
		public static int[] sum = new int[10];
		public static void maxNode(Node a,int j){
		if(a!=null){
			sum[j]++;
			j++;
			maxNode(a.lchild,j);
			maxNode(a.rchild,j);
			j--;
		}
	}
	public static void main(String[] args){

		int n;
		Node b;
		int useless;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements");
		n = s.nextInt();
		int[] a = new int[n];
		int[] max = new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++){
			b =new Node(a[i]);
			insert(b);
		}
		//traverse(root);
		maxNode(root,0);
		for(int k=0;k<10;k++)
			System.out.print(sum[k]+ " ");
	}
}