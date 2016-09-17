import java.math.BigInteger;
import java.util.Scanner;

public class factmod {

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int i,j,num;
       int count=0;
       int count1=0;
       int flag=0;
       num=s.nextInt();
       for(i=1;i<=num;i++){
        for(j=1;j<=num;j++){
          if((i*i)+(j*j)<=(num*num)){
            count++;
        }
          }
          
       }
       System.out.print(count+"\n"+count1);

   }

}