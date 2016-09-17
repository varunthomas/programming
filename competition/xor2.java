import java.io.*;
import java.util.*;

class xor2{

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int col,row;
		int temp=0;
		int val;
		int xor;
		row=s.nextInt();
		if(row<1 || row>1000)
			return;
		col=s.nextInt();
		if(col<1 || col>1000)
			return;
		if(row>col)
			val=row;
		else
			val=col;
		int[][] a =new int[val][val];
		Arrays.fill(a,0);
		int[] sumrow = new int[val];
		int[] sumcol = new int[val];
		for(int i=0;i<val;i++)
			for(int j=0;j<val;j++){
				a[i][j]=s.nextInt();
				if(a[i][j]<1 || a[i][j]>10000)
					return;
				sumrow[i]+=a[i][j];
			}

		for(int j=0;j<val;j++)
			for(int i=0;i<val;i++){
				sumcol[j]+=a[i][j];
			}		

		for(int i=0;i<val;i++){
			xor= sumrow[i]^sumcol[i];
			if(xor>temp)
				temp=xor;
		}
		System.out.println(temp);
			

	}
}