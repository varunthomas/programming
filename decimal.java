import java.io.*;
import java.util.*;

class decimal{

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n;
		int i,j;
		char val='0';
		n=s.nextInt();
		float x;
		x=(float)1/n;
		String str;
		str = String.valueOf(x);
		char[] c =str.toCharArray();
		for(i=0;i<c.length-1;i++){
			if(c[i]==c[i+1]){
				val=c[i];
				break;
			}
			System.out.print(c[i]);
		}
		System.out.print(c[i]);
		System.out.print(" "+val);
		
	}
}