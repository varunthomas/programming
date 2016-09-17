import java.io.*;
import java.util.*;
class stringtest{

  public static void main(String args[] ) throws Exception {
	int input[]=new int[2];
	int i=0;
	Scanner sc=new Scanner(System.in);
	while(i!=2){
	input[i]=Integer.parseInt(sc.next());
	i++;
	}
	for(i=0;i<input.length;i++)
	System.out.println("The Value is:"+input[i]);
    }
}