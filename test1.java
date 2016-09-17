/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;
import java.math.*;
class test1 {
    public static void main(String args[] ) throws Exception {
		
		long input[]=new long[2];
	
		int j;
		long sum=0;
		Scanner sc=new Scanner(System.in);
		long diff,n;


		
		j=0;
		try{
		while(j!=2){
		input[j]=Long.parseLong(sc.next());


		j++;
		}
		}catch(NumberFormatException e){ return;}
		 if(input[0]<0 || input[0]>1000000000000000000L || input[1]<0 || input[1]>1000000000000000000L)
			return;
		diff=input[1]-input[0];
		if(input[0]>input[1] || diff>1000000000000000000L)
			return;
			 
		n=diff+1;
		//x=n/2;
 		BigDecimal bd=new BigDecimal(n/2);

		BigInteger d3 = BigInteger.valueOf(input[0]).add(BigInteger.valueOf(input[1]));
		BigDecimal d4=new BigDecimal(d3);
		BigDecimal d5=bd.multiply(d4);

		System.out.println(d5);
    }	
}
