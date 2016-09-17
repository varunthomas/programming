import java.util.*;
import java.io.*;

class subarray{

	public static int isZero(int[] a,int i,int j,int sum){
		int x;
		if(i==a.length){
			return 0;
		}
		if(i==j){
			if(a[i]==0)
				return 1;
			sum=a[i];
		}
		else{
			sum+=a[j];
			if(sum==0)
				return 1;
		}
		if(j<a.length-1){
			x=isZero(a,i,j+1,sum);
			return x;
		}
		else{
			sum=0;
			i=i+1;
			j=i;
			x=isZero(a,i,j,sum);
			return x;
		}
		
	}

	public static void main(String[] args){

		Scanner s= new Scanner(System.in);
		int n,sm;
		n=s.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		sm=isZero(a,0,0,0);
		System.out.println(sm);
	}
}