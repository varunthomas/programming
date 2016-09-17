/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;
class minClass {
    public static void main(String args[] ) throws Exception {
		
		int noofclasses[];
		int noofdays[];
		int i,j;
		int testcases;
		
		int temp;
		int sum;
		Scanner sc=new Scanner(System.in);
		testcases=sc.nextInt();
		if(testcases<1 || testcases>1000)
			return;
		noofclasses=new int[testcases];	
		noofdays=new int[testcases];
		for(i=0;i<testcases;i++){
			try{
			noofclasses[i]=sc.nextInt();
			}catch(InputMismatchException e){return;}
			if(noofclasses[i]<1 || noofclasses[i]>1000000000)
				return;
			noofdays[i]=0;
		}
		
		for(j=0;j<testcases;j++){
		temp=0;
		sum=0;
		while(sum<=noofclasses[j]){
		
			temp++;
			sum+=temp;
			noofdays[j]++;
		}
		sum-=temp;
		temp--;
		noofdays[j]--;
		if(sum==noofclasses[j])
		System.out.println(noofdays[j]);
		else{
		
		while(sum<noofclasses[j]){
		temp--;
		sum+=temp;
		noofdays[j]++;
		}
		System.out.println(noofdays[j]);
		}
		}

    }	
}
