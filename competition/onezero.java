//Segregate 0s and 1s in an array

import java.io.*;
import java.util.*;

class onezero{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int l,r;
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		l=0;
		int temp;
		r=n-1;
		while(l<r){
			if(a[l]==1 && a[r]==0){
				temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
			if(a[l]==0)
				l++;
			if(a[r]==1)
				r--;

		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}