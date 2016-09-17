//https://www.hackerrank.com/challenges/sherlock-and-the-beast


/*import java.io.*;
import java.util.*;

class test{

	public static void main(String[] args){
		String num ="55555555555";
		String three="33333";
        String newstr = num.substring(0,7)+three;
		System.out.println(newstr);
	}
}
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int nvar=n;
            String subthree="33333";
            String subfive="555";
            String actual_num,changed_num;
            int five=0;
            int three=0;
            String num="";
            /*while(nvar>0){
                num+="5";
                nvar--;
            }*/
            int[] arr = new int[n];
            Arrays.fill(arr,5);
            num=Arrays.toString(arr);
            num=num.replace(", ","");
            num=num.replace("[","");
            num=num.replace("]","");
            nvar=n;
            while(true){
                five=0;
                three=0;
                actual_num = num;  
                for(int i=0;i<n;i++){
                    if(num.charAt(i)=='5')
                        five++;
                    else
                        three++;
                }
                if(five%3==0 && three%5==0){
                    System.out.println(num);
                    break;
                    }
                else if(five%3!=0){
                    if(nvar-5>=0){
                        num = num.substring(0,nvar-5)+subthree+num.substring(nvar);
                        nvar=nvar-5;
                    }
                }
                else if(three%5!=0){
                    if(nvar-3>=0){
                        num =num.substring(0,nvar-3)+subfive+num.substring(nvar);
                        nvar=nvar-3;
                    }
                }
                
                changed_num=num;
                if(actual_num.equals(changed_num)){
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
