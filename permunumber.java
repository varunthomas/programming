import java.io.*;
import java.util.*;

public class permunumber{

	public static void permute(int[] num, int l, int r,int digit){

		if(l==r){
			int temp=0;
			int tempdigit;
			tempdigit=digit;
			for(int j=0;j<n;j++){
				temp+=num[j]*tempdigit;
				tempdigit=tempdigit/10;
			}
		}
	}

	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		int n;

		int digit=1;
		System.out.println("Enter the number of elements");
		n=s.nextInt();
		int[] num=new int[n];
		for(int i=1;i<n;i++)
			digit=digit*10;

		System.out.println("Enter elements");
		for(int i==0;i<n;i++){
			num[i]=s.nextInt();
		}

		permute(num,0,n-1,digit);

	}
}