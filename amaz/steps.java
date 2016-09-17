/*A bot has to go from point A to point B. Every time the bot moves, it can take either 1 or 2 or 3 steps. Find the total number of ways in which this can be done.
Input parameters – distance between A and B
Required output – number of ways*/

import java.io.*;
import java.util.*;

class steps{
	
	public static int num=0;
	public static void numOfWays(int distance){

			
		if(distance==0)
			num++;
		else if(distance<0){}

		else{
			numOfWays(distance-3);
			numOfWays(distance-2);
			numOfWays(distance-1);
		}
	}

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int distance;
		distance=s.nextInt();
		numOfWays(distance);
		System.out.print(num);
	}	
}