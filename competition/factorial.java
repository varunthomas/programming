import java.io.*;
import java.util.*;

class factorial{

	public static int fact(int n){

		if(n==1){

			return 1;

		}

		else{
			
			return fact(n-1)*n;

		}	
	}

	public static void main(String args[]){

		int n;
		int fact;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		n=s.nextInt();
		fact=fact(n);
		System.out.println(fact);
	}
}