/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;
class dictionary {
    public static void main(String args[] ) throws Exception {
		
		String s1,s2;
		int i,j;
		int testcases;
		int count=0;
		Scanner sc=new Scanner(System.in);
		testcases=sc.nextInt();
		if(testcases<1 || testcases>50)
			return;
		for(i=0;i<testcases;i++){
			s1=sc.next();
			s2=sc.next();
			if(s1.length()<1 || s1.length()>500 || s2.length()<1 || s2.length()>500)
				return;
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			
			for(j=0;j<charArray1.length;j++)
				if(charArray1[j]<'A' || charArray1[j]>'Z')
					return;
			
			for(j=0;j<charArray2.length;j++)
				if(charArray2[j]<'A' || charArray2[j]>'Z')
					return;
			
			for(j=0;j<charArray1.length;j++){
			

			
				if(j<charArray2.length)
				if(charArray1[j]==charArray2[j]){
					count++;
				}
			}
			System.out.println(count);
			count=0;
		}
    }	
}
