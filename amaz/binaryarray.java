//Move ones and zero in single itration

import java.io.*;
import java.util.*;

class binaryarray{

	public static void swap(int[] a,int i,int j){
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	public static void reorder(int[] a){

		for(int i=0;i<a.length/2;i++){
			if(a[i]==1){
				for(int j=a.length/2;j<a.length;j++){
					if(a[j]==0){
						swap(a,i,j);
						break;
					}
					swap(a,i,(a.length/2)-1);
				}
			}
		}
		for(int i=a.length/2;i<a.length;i++){
			if(a[i]==0){
				for(int j=0;j<a.length/2;j++){
					if(a[j]==1){
						swap(a,i,j);
						break;
					}
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		reorder(a);
	}
}