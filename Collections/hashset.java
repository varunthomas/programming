import java.io.*;
import java.util.*;

class hashset{
	public static void main(String[] args){
	HashSet<String> hs = new HashSet<String>();
	hs.add("Pavanai");
	hs.add("Shavamai");
	hs.add("Varun");
	hs.add("Ayyo");
	hs.add("Varun");
	Iterator<String> it = hs.iterator();
	while(it.hasNext())
		System.out.print(it.next()+" ");
	System.out.println();
}
}