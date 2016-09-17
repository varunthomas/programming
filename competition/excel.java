import java.util.*;
import java.lang.*;
import java.io.*;

class excel{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int i=0;
	int q=n;
	int num;
	char[] str = new char[50];
	while(q!=0){
		num=q%26;
		if(num==0){
			str[i]='Z';
			q=q-1;
		}
		else
			str[i]=(char)(num-1+'A');
		i++;
		q=q/26;
	}

	i=0;
	char temp;
	int l = str.length;
	while(i<l/2){
		temp=str[i];
		str[i]=str[l-i-1];
		str[l-i-1]=temp;
		i++;
	}
	for(int j=0;j<l;j++){
		if(str[j]!=' ')
			System.out.print(str[j]);
	}
	}
}