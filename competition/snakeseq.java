//Find maximum length Snake sequence
//Given a grid of numbers, find maximum length Snake sequence and print it. If multiple snake sequences exists with the maximum length, print any one of them.

import java.io.*;
import java.util.*;

class snakeseq{


	public static int maxLength(int[][] a, int[][] t, int i, int j,int row, int col){
		
		int x=0,y=0;
		int r=0,d=0;
		if(i<row-1)
		x=Math.abs(a[i+1][j]-a[i][j]);
		if(j<col-1)
		y = Math.abs(a[i][j+1]-a[i][j]);

			if(x!=1 && y!=1)
				return 0;
			if(i<row-1)
			if(x==1){
				d=maxLength(a,t,i+1,j,row,col)+1;
			}
			if(j<col-1)
			if(y==1){
				r=maxLength(a,t,i,j+1,row,col)+1;

			}
			if(d>r){
				t[i+1][j]=d;
				return d;
				}
			else{
				t[i][j+1]=r;
				return r;
			}	
		
		
	}

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int row=s.nextInt();
		int col = s.nextInt();
		int temp=0;
		int[][] a=new int[row][col];
		int[][] t = new int[row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++){
				a[i][j]=s.nextInt();
			}

		t[0][0] = maxLength(a,t,0,0,row,col)+1;	
		for(int i=row-1;i>=0;i--){
			for(int j=col-1;j>=0;j--){
				if(t[i][j]>temp){
					System.out.print(a[row-i-1][col-j-1]+" ");
					temp=t[i][j];
				}

			}		
		}

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(t[i][j]+" ");

			}		
			System.out.println();
		}


	}
}