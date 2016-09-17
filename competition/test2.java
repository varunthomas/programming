import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a ,u,d,l,r;
        String grid[][] = new String[n][n];
        for(int grid_i=0; grid_i < n; grid_i++)
            for(int grid_j=0;grid_j<n;grid_j++){
            grid[grid_i][grid_j]=in.next();
        }
        for(int i=1;i<n-1;i++)
            for(int j=1;j<n-1;j++){
                a=Integer.parseInt(grid[i][j]);
                u=Integer.parseInt(grid[i-1][j]); 
                d=Integer.parseInt(grid[i+1][j]);
                l=Integer.parseInt(grid[i][j-1]);
                r=Integer.parseInt(grid[i][j+1]);
                if(a>u&&a>d&&a>l&&a>r){
                    grid[i][j]="x";
                }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]);
                }
            System.out.println();
            }
        }
    }

