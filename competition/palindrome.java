import java.util.*;


class palindrome{

	public static boolean isPalindrome(String str){

		char[] ch;
		boolean flag=false;
		int l=str.length();
		ch=str.toCharArray();
		for(int k=0;k<l/2;k++){
			if(ch[k]==ch[l-k-1])
				flag=true;
			
			else{
				flag=false;
				return flag;
			}
			
		}
		return flag;
	}

	public static void main(String args[]){

	String a;
	String b;
	String str;
	int t;
	int count;
	Scanner s=new Scanner(System.in);
	t=s.nextInt();
	for(int i=0;i<t;i++){
		count=0;
		s.nextLine();
		a=s.next();
		b=s.next();
		for(int j=0;j<=a.length();j++){
		str = new StringBuilder(a).insert(j, b).toString();
		if(isPalindrome(str)){
			count++;
		}
		}
		System.out.println(count);
	}
}
}