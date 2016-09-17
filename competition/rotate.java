
import java.io.*;
import java.util.*;

class rotate{
	public static int flag=0;
	public static void rotate(int[] a, int i, int val,int n,int r,int k){
		if(flag==1)
			return;
		int temp;
		if(i<r){
			temp=a[n+(i-r)];
			a[n+(i-r)]=val;
			if(n+(i-r)==k)
				flag=1;
			rotate(a,n+(i-r),temp,n,r,k);
		}
		else{
			temp=a[i-r];
			a[i-r]=val;
			if(i-r==k)
				flag=1;
			rotate(a,i-r,temp,n,r,k);
		}

	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int r=s.nextInt();
		int[] a = new int[n];
		for(int j=0;j<n;j++)
			a[j]=s.nextInt();
		for(int k=0;k<r;k++){
			rotate(a,k,a[k],n,r,k);
			flag=0;
		}


		for(int j=0;j<n;j++)
			System.out.print(a[j]+" ");	
	}
}