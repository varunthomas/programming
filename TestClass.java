/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;
class TestClass {
	
	public static int getCount(String[] arr,int i,int x ){
		int count=0;
		char[] arrChar;
		if(arr[i].charAt(x)=='R'){
		 arrChar = arr[i].toCharArray();
		arrChar[x] = 'K';
		}
		else{
			arrChar = arr[i].toCharArray();
			arrChar[x] = 'R';
		}
		for(int m=0;m<arrChar.length;m++){
			
			if(arrChar[m]=='R')
			count++;
		}
		return count;
	}
	
    public static void main(String args[] ) throws Exception {
		
		int i=0,j,k,x,testcases,counter;
		int max=0;
		String names[];
		Scanner s=new Scanner(System.in);
		testcases=s.nextInt();
		names=new String[testcases];
		if(testcases<1 || testcases>10)
				return;	
		
		
		while(testcases!=0){
			
			names[i]=s.next();
			testcases--;
			i++;
		}
		testcases=i;
		for(i=0;i<testcases;i++){
			k=names[i].length();
			for(j=0;j<k;j++){
				for(x=j;x<k;x++){
					counter=getCount(names,i,x);
					if(counter>max){
					max=counter;
					}
				}
				k--;
			}
			System.out.println(max+1);
		}
		
		
    }
}
