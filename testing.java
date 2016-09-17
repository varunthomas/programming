import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int sum = 0;
    public static int shortest=99999;
    
    public static int traverse(adj,i,dest,visited,v){
        int j,h;
        visited[i]=1;
        if(adj[i][dest]==6)
            sum+=6;
        else{
            for(j=0;j<v;j++){
                if(adj[i][j]==6 && visited[j]!=1){
                    sum+=6;
                    h=traverse(adj,j,dest,visited,v);
                    if(h<shortest)
                        shortest=h1;
                }
            }
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        for(int k=0;k<t;k++){
            
            
            
            int i,j,result;
            int shortest=999999;
            int v = s.nextInt();
            int e = s.nextInt();
            int[][] adj = new int[v][v];
            for(i=0;i<v;i++)
                for(j=0;j<v;j++){
                adj[i][j]=-1;
            }
            int[] visited = new int[v];
            for(int l=0;l<e;l++){
                i=s.nextInt();
                j=s.nextInt();
                adj[i][j]=6;
            }
            int start=s.nextInt();
            for(i=0;i<v-1;i++){
            result=traverse(adj,start,i,visited,v);
            System.out.println(result+" ");
            }
            
            
            
            
        }
    }
}