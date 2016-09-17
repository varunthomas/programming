import java.io.*;
import java.util.*;
import java.lang.*;

public class parsetest{

	public static void main(String args[]){
		String[] a=new String[200];
		int sum=0;

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<4;i++)
			a[i]=s.next();
		
		for(int j=0;j<4;j++)
		System.out.println("a["+j+"]= "+a[j]);
	}
}