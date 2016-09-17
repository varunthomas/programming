/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;
class PromNight {
	
	public static void remove(int[] arr1,int[] arr2,int j,int k){
		
		arr1[j]=0;
		arr2[k]=0;
		
	}
	
    public static void main(String args[] ) throws Exception {
      	int testcases;
      	int i,j,k,nboys,ngirls;
      	int boysheight[];
      	int girlsheight[];
      	int flag=0;
	    Scanner s=new Scanner(System.in);
		testcases=s.nextInt();
	
		if(testcases<1 || testcases>10)
				return;	
		for(i=0;i<testcases;i++){
			nboys=s.nextInt();
			boysheight=new int[nboys];
			ngirls=s.nextInt();
			girlsheight=new int[ngirls];
			for(j=0;j<nboys;j++){
				boysheight[j]=s.nextInt();
			}
			for(j=0;j<ngirls;j++){
				girlsheight[j]=s.nextInt();
			}
			
			for(j=0;j<nboys;j++){
				for(k=0;k<ngirls;k++){
					if(boysheight[j]>girlsheight[k] && girlsheight[k]!=0){
						remove(boysheight,girlsheight,j,k);
					}
				}
			}
			for(j=0;j<nboys;j++){
				if(boysheight[j]!=0)
				flag=1;
			}
			if(flag==1)
			System.out.println("NO");
			else
			System.out.println("YES");
		}		

    }
}
