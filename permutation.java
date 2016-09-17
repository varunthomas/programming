import java.io.*;
import java.util.*;


public class permutation{


	public static void permute(char[] ch,int l,int r){

		int i=l;
		char temp;
		if(l==r){
			for(int j=0;j<ch.length;j++)
				System.out.print(ch[j]);
			System.out.println();
		}

		else{

			while(i<=r){

				temp=ch[l];
				ch[l]=ch[i];
				ch[i]=temp;
				permute(ch,l+1,r);
				temp=ch[i];
				ch[i]=ch[l];
				ch[l]=temp;
				i++;

			}
		}

	}


	public static void main(String args[]){

		
		int n;
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		str=s.nextLine();
		char[] ch=str.toCharArray();

		n=ch.length;
		permute(ch,0,n-1);

		
	}
}