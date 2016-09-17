/*Given an array
eg: 2 4 5 6
and n as 2
we get new array {4-2,5-4,6-5} for 1st iteration
and array {-1,0} for 2nd iteration */

import java.util.*;
import java.io.*;

public class sumarr{

	public static void iterate(int[] arr,int iter){
		int n = arr.length;
		int i,j,k;
		for(i=0;i<iter;i++){
			if(n==1){
				System.out.print(arr[0]);
				return;
			}
			for(j=0;j<n-1;j++){
				arr[j]=arr[j+1]-arr[j];

			}
			n--;
		}
		for(k=0;k<n;k++)
			System.out.print(arr[k]+" ");
	}

	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		int n;
		int iter;
		n = s.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		iter = s.nextInt();
		iterate(arr,iter);
	}
}
