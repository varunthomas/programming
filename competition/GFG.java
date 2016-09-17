/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

/*
rec(a,i,j){
    if j==n
        return 0;
    if(a[i]==a[j])
    return 1+rec(a,i,j+1);
    return 0;
    
}

for i=0 to n i++
sum+=rec(a,i,i);

*/
import java.io.*;
import java.util.*;
public class GFG {
    public static int rec(int[] a, int i,int j){
        if(j==a.length)
            return 0;
        if(a[i]==a[j])
            return 1+rec(a,i,j+1);
        return rec(a,i,j+1);    
    }
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int k=0;k<t;k++){
            int i;
            int max=0;
            int n = s.nextInt();
            int[] a = new int[n];
            for(int l=0;l<n;l++)
                a[l]=s.nextInt();
            for(i=0;i<n;i++)
                max+=rec(a,i,i);
            System.out.println(max);    
        }
        
    }
}
