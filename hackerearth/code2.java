import java.io.*;
import java.util.*;

class code2{
	public static void main(String[] args){
		long a,b,x;
		Scanner s=new Scanner(System.in);
			a=s.nextLong();
			b=s.nextLong();
			if(a<1 || b>10e17 || a>b)
				return;
			x=b-a;
			int sum=0;
			long[] num =new long[(int)x+1];
		for(int i=0;i<=x;i++){
			num[i]=a;
			a++;
		}	
		
		for(int i=0;i<num.length;i++){
			long[] seq =new long[500];
			int j=0;
			int divisor=1;
			int r=0;
			int flag=0;
		while(flag!=1){
			if(r==0){
				seq[0]=num[i];
				r++;
			}

			else{
				while(true){
					if(divisor==seq[j]){
						flag=1;
						sum++;
						break;
					}
					if(seq[j]%divisor!=0){
						seq[j+1]=divisor;
						divisor=1;
						j++;
						sum++;
					}
					else{
						divisor++;
					}
				}
			}
		}

	}
	System.out.print(sum);
	}
}