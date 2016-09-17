import java.io.*;
import java.util.*;
import java.lang.*;

class beverage{

	public static void main(String args[]){

		int n;
		int arr[];
		int x;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n<3)
			return;
		arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(s.next());
		if(arr[0]>30000)
			return;

		x=s.nextInt();
		if(x>30000)
			return;
		
		mainLoop:
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++)
					
					if(arr[i]+arr[j]+arr[k]==x){
						flag=true;
						break mainLoop;
				}
				
		if(flag)		
		System.out.println("True");
		else if(!flag)
		System.out.print("False");			
	}
}