import java.util.*;
import java.io.*;

public class robot{

	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		System.out.println("Enter path");
		String p=s.nextLine();
		char[] path=p.toCharArray();
		int dir=2;
		int curr;
		int x=0;
		int y=0;
		int flag=1;
		for(int i=0;i<path.length;i++){

			
			if(path[i]=='G'){
				if(flag==0 && dir==1)
					x++;
				else if(flag==0 && dir==3)
					x--;
				else if(flag==1 && dir==2)
				 	y++;
				 else
				 	y--;

			}	
			else if(path[i]=='L'){

				if(dir==2){

					dir=3;
					flag=0;

				}
				else if(dir==1){

					dir=2;
					flag=1;
				}
				else if(dir==3){

					dir=4;
					flag=1;
				}
				else if(dir==4){

					dir=1;
					flag=0;
				}
			}

			//right ksdhfkjdshfjahd

			else if(path[i]=='R'){

				if(dir==2){

					dir=1;
					flag=0;

				}
				else if(dir==1){

					dir=4;
					flag=1;
				}
				else if(dir==3){

					dir=2;
					flag=1;
				}
				else if(dir==4){

					dir=3;
					flag=0;
				}
			}



		}

		if(x==0 && y==0){
			System.out.println("circular");	
		}
		else{
			System.out.println("Not circular");
		}
	}
}