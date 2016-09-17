
import java.util.*;
class xavier{



	public static void main(String args[]){

		int t;
		String str;
		char chArr[];
		int ascii;
		double f;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		s.nextLine();
		if(t>100)
			return;
		for(int i=0;i<t;i++)
		{
			ascii=0;
			str=s.nextLine();
			if(str.length()>100)
				return;
			chArr=str.toCharArray();
			for(int j=0;j<str.length();j++){
				ascii+=(int)chArr[j];
				
			}
			

			f=(double)ascii/str.length();
			f=Math.floor(f);
			if(f%2==0)
				System.out.println(str);
			else{
				str=new StringBuilder(str).reverse().toString();
				System.out.println(str);
			}


	}
		
	}
}