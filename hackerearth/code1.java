import java.io.*;
import java.util.*;

class code1 {
    public static void main(String args[] ) throws Exception {

        Scanner s =new Scanner(System.in);
        int t,n;
        int op=1;
        int count=0;
        int k=1;
        int flag=0;
        t=s.nextInt();
        int a[] =new int[200];
        if(t<1)
        	return;
        for(int i=0;i<t;i++){
        	n=s.nextInt();
        	if(n>30)
        		return;
        	for(int j=1;j<=n;j++){
        		if(j==1){
        			a[0]=1;
        		}
        		else{
        			for(int l=0;l<a.length;l++){
        				if(a[l]%j==0){
        					flag=1;
        					break;
        				}
        			}
        			if(flag==0){
        				a[k]=j;
        				k++;
        			}

        		}

        	}
        	int m;
        	for(m=0;a[m]!=0;m++);
        	if(m%2==0){

        		System.out.println("2");
        	}
        	else{
        		System.out.println("1");
        	}
        }
    }
}
