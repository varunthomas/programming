import java.io.*;
import java.util.*;

class dd{

	public static void main(String args[]){

		int t,n;
		int l;
		int count;
		int sum;
		int arr[];
		int flag;
		int temp;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		if(t<1 || t>50)
			return;
		for(int i=0;i<t;i++){
			count=0;
			l=0;
			flag=0;
			n=s.nextInt();
			if(n<0 ||n>100)
				break;
			while(l<n){
				l+=6;
				count++;

			}
			temp=count;
			arr=new int[count];
			
			while(count!=0){
			for(int j=0;j<count;j++)
				arr[j]=8;
			for(int j=count-1;j>=0;j--){
				sum=0;
				for(int k=0;k<count;k++){
					sum+=arr[k];
				}
				if(sum==n){
					flag=1;
					if(count<temp)
						temp=count;
					
					
				}
				else
					arr[j]=6;


			}
			count--;

		}
		if(flag==0)
			System.out.println("-1");
		else
			System.out.println(temp);
		}
	}
}