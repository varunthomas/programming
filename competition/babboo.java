// https://www.hackerearth.com/may-circuits/algorithm/booboo-and-upsolving-circuits/

import java.io.*;
import java.util.*;
class babboo{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int a[] = new int[n];
		int max=0;
		int j=0;
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			if(a[i]>max)
				max=a[i];
		}
		int sum=0;
		int temp;
		int days=0;
		int flag=0;
		while(true){
			j=0;
			while(j<n){
				sum+=a[j];
				if(sum>=max){
					days++;
					System.out.println("max"+max+" days"+days);
					temp=sum+a[j];
					sum=0;
					if(days>m){
						flag=1;
						max=temp;
						days=0;
						break;
					}

				}
				j++;
			}
			if(flag==0){
				System.out.print(max);
				return;
			}
		}
	}
}