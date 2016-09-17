import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int t;
        t=sc.nextInt();
        int[] n =new int[t];
        int[] m =new int[t];
        int[] s =new int[t];
        for(int i=0;i<t;i++){
            n[i]=sc.nextInt();
            m[i]=sc.nextInt();
            s[i]=sc.nextInt();               
        }
        for(int i=0;i<t;i++){
         
            while(m[i]!=0){
                m[i]--;
                if(m[i]==0){
                    System.out.println(s[i]);
                    break;
                }
                if(s[i]!=n[i])
                    s[i]++;
                else
                    s[i]=1;
            }
        }
    }
}