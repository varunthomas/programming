import java.io.*;
import java.util.*;

class xor{

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int col,row;
		int temp=0;
		int val;
		int i,j;
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
		int[][] a =new int[row][col];
		int[] sumrow = new int[val];
		int[] sumcol = new int[val];
		int[][] newmat = new int[val][val];

		for(i=0;i<row;i++)
			for(j=0;j<col;j++){
				a[i][j]=s.nextInt();
				if(a[i][j]<1 || a[i][j]>10000)
					return;
			}

		if(row == col){
			for(i=0;i<row;i++)
				for(j=0;j<col;j++)
					newmat[i][j]=a[i][j];
		}	
			
		if(row>col){

			for(i=0;i<row;i++){
				for(j=0;j<col;j++){
					newmat[i][j]=a[i][j];
				}
				while(j<row){
					newmat[i][j]=0;
					j++;
				}
			}

		}

		if(col>row){
			for(i=0;i<row;i++){
				for(j=0;j<col;j++){
					newmat[i][j]=a[i][j];
				}

			}
			while(i<col){
				for(j=0;j<col;j++){
					newmat[i][j]=0;
				}

					i++;
			}
		}




		for(i=0;i<val;i++)
			for(j=0;j<val;j++){
				sumrow[i]+=newmat[i][j];
			}

		for(j=0;j<val;j++)
			for(i=0;i<val;i++){
				sumcol[j]+=newmat[i][j];
			}		

		for(i=0;i<val;i++){
			System.out.println(sumcol[i]);
			System.out.println(sumrow[i]);
}

		for(i=0;i<val;i++)
			for(j=0;j<val;j++){
			xor= sumrow[i]^sumcol[j];
			if(xor>temp)
				temp=xor;
		}
		System.out.println(temp);
			

	}
}