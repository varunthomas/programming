/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;
class coprime {
	
	

    public static void main(String args[] ) throws Exception {
		
		int n1[];
		int n2[];
		int i,j;
		int x,y;
		int u=1,v=1;
		int count=0;
		int testcases;
		
		Scanner sc=new Scanner(System.in);
		testcases=sc.nextInt();
		if(testcases<1 || testcases>10)
			return;
		n1=new int[testcases];	
		n2=new int[testcases];
		for(i=0;i<testcases;i++){
			
			n1[i]=sc.nextInt();
			if(n1[i]>1000000000)
				return;
			n2[i]=sc.nextInt();
			if(n2[i]>1000000000)
				return;
			if(n1[i]<1 || n2[i]<1)
				return;
			
		}
	
		for(j=0;j<testcases;j++){
		
		x=n1[j];	
		y=n2[j];
		if(x==1 && y==1)
			System.out.println(count);
		else{	
		while(u<x && v<y){
		u++;
		v++;
		count++;
		
		}
		while(u<x)
		{
		u++;
		count++;
		}
		while(v<y)
		{
		v++;
		count++;
		}
		System.out.println(count-1);
		count=0;
		}
		}

    }	
}
