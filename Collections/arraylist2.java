import java.io.*;
import java.util.*;

public class arraylist2{

	static class PowerRank{

		String name;
		int rank;
		PowerRank(String name, int rank){
			this.name=name;
			this.rank=rank;
		}
	}
	public static class List{
		public static void main(String[] args){
			ArrayList<PowerRank> al=new ArrayList<PowerRank>();
			PowerRank p2 = new PowerRank("Goku",1);
			PowerRank p3 = new PowerRank("Vegeta",2);
			PowerRank p4 = new PowerRank("Gohan",3);
			al.add(p2);
			al.add(p3);
			al.add(p4);
			Iterator it = al.iterator();
			while(it.hasNext()){
				PowerRank p1 = (PowerRank)it.next();
				System.out.println("Name: "+p1.name+" Rank: "+p1.rank);
			}
		}
	}
}