import java.io.*;
import java.util.*;

class lhmap{

	public static void main(String[] args){
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(100,"Vayya");
		lhm.put(101,"Mwon");
		lhm.put(102,"Vayya");
		lhm.put(103,"aksjfh");
		lhm.put(101,"Mwon");
		for(Map.Entry m: lhm.entrySet())
			System.out.println(m.getValue()+" "+m.getKey());
	}
}