import java.math.BigInteger;
import java.util.Scanner;

public class repunit {

   public static boolean prime(int n){
      int j,m=0;
      int flag=0;    
      boolean prime=true; 
      m=n/2;    
      for(j=2;j<=m;j++){    
       if(n%j==0){    
       prime=false;  
       flag=1;    
       break;    
       }    
      }    
      if(flag==0)    
      prime=true;     
    return prime;
   } 

   public static boolean gcd(int n1){
        int n2=10;
        int r;
                while(n2 != 0)
            {
                r = n1 % n2;
                n1 = n2;
                n2 = r;
            }
            if(n1==1)
              return true;
            else
              return false;
   }



   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int l,r;
       int i;
       int count=0;
       int p;
       l=s.nextInt();
       r=s.nextInt();

       for(i=l;i<=r;i++){
        String str="";
        int length;
        if(!prime(i)){
          if(gcd(i)){

            
            /*while(true){
              str = str+"1";
              BigInteger x = BigInteger.valueOf(i);
              BigInteger repunit = new BigInteger(str);
              if(!repunit.mod(x).equals(BigInteger.ZERO)){
                
              }
              else{
                break;
              }
              count++;
            }*/
            /*while(str.length()<i-1){
              str=str+"1";
            }*/
            BigInteger ten = new BigInteger("10");
            BigInteger x =BigInteger.valueOf(i);
            BigInteger repunit = ten.pow(i-1);
            BigInteger nine =new BigInteger("9");
            repunit=repunit.divide(nine);
            if(repunit.mod(x).equals(BigInteger.ZERO))
              System.out.println(i);
            /*length=str.length();
            if((i-1)%length==0)
              System.out.println(i);*/
          }
        }

       }


   }

}