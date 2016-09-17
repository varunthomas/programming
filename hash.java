/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;
class hash {
    public static void main(String args[] ) throws Exception {
		
		int input[];
	
		int i,n,j,k;
		int testcases;
		int temp,count=0;
		Scanner sc=new Scanner(System.in);
		testcases=sc.nextInt();
		if(testcases<1 || testcases>50)
			return;
		for(i=0;i<testcases;i++){
		j=0;
		n=sc.nextInt();
		if(n<1 || n>100000)
			return;
		input=new int[n];
	
		while(j!=n){
		input[j]=Integer.parseInt(sc.next());
		if(input[j]<-1000000 || input[j]>1000000)
			return;
		j++;
		}

	    for(j=0;j<n;j++){
	    	for(k=j;k<n;k++){
	    		if(input[j]==input[k]){
	    			count++;
	    		
	    		}
	    	}
	    }
	    System.out.println(count);
		count=0;
		}
    }	
}
